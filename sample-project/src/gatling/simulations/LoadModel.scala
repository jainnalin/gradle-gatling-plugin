
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.concurrent.duration.DurationInt

class LoadModel extends Simulation{

  //1 HTTP Conf
  val httpConf = http.baseUrl(url = "http://localhost:8080/app/")
    .header(name ="Accept", value="application/json")


  //2 Scenario Definition

    def getGamesList()={
      exec(http(requestName="Get_Games_Call_1")
        .get ("videogames")
        .check(status.is(200)))
    }

  def getGame()={
    exec(http(requestName="Get_1_Game")
      .get ("videogames/1")
      .check(status.in(200 to 210)))
  }

  val scn= scenario(scenarioName = "LoadModel")
    .forever(){
      exec(getGamesList())
        .pause(5)
        .exec(getGame())
        .pause(5)
        .exec(getGamesList())
    }

  //3 Load Scenario
  setUp(
    scn.inject(
      nothingFor(5 seconds),
      atOnceUsers(5),
      rampUsers(45) during (30 seconds),
      //constantConcurrentUsers(50) during (1 minute),
      //rampUsers(1) during (30 seconds)
      //rampConcurrentUsers(50) to (1) during(1 minute)
    ).protocols(httpConf.inferHtmlResources())
  ) .maxDuration (5 minutes)

  after {
    println("Test completed")
  }

}

