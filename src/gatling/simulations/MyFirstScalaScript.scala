import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

  class MyFirstScalaScript extends Simulation{

  //1 HTTP Conf
  val httpConf = http.baseUrl(url = "http://localhost:8080/app/")
    .header(name ="Accept", value="application/json")


  //2 Scenario Definition
  val scn = scenario(scenarioName = "My 1st Script")
    .exec(http(requestName="Get All Games")
      .get ("videogames"))

  //3 Load Scenario
  //val setUp =  scn.inject(atOnceUsers( users = 1))
  //.protocols(httpConf)

  setUp(
   scn.inject(atOnceUsers( users = 1))
   ).protocols(httpConf)

}

