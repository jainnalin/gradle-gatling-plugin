
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.concurrent.duration.DurationInt

class PauseScript_Methods extends Simulation{

  //1 HTTP Conf
  val httpConf = http.baseUrl(url = "http://localhost:8080/app/")
    .header(name ="Accept", value="application/json")


  //2 Scenario Definition
 // val scn = scenario(scenarioName = "3Calls")

   // .exec(http(requestName="Get_Games_Call_1")
   //  .get ("videogames"))
   //  .pause( duration =3)

   // .exec(http(requestName="Get_Games_Call_2")
   //  .get ("videogames/1"))
   //  .pause( 1,5)

   // .exec(http(requestName="Get_Games_Call_3")
   //  .get ("videogames"))
   //  .pause(3000.milliseconds)

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

  val scn= scenario(scenarioName = "ReuseCodewithMethods")
      .exec(getGamesList())
      .pause(5)
      .exec(getGame())
      .pause(5)
      .exec(getGamesList())

  //3 Load Scenario
  setUp(
   scn.inject(atOnceUsers( users = 1))
   ).protocols(httpConf)

}

