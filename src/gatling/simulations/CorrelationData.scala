import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class CorrelationData extends Simulation{

  //1 HTTP Conf
  val httpConf = http.baseUrl(url = "http://localhost:8080/app/")
    .header(name ="Accept", value="application/json")


  //2 Scenario Definition
  val scn = scenario(scenarioName = "DynamicResponse")

    .exec(http(requestName="Search_Game")
      .get ("videogames/3")
      //Validate the search key
      .check(jsonPath("$.name").is("Tetris")))

    .exec(http("Capture_Dynamic_Data")
      .get("videogames")
      //CaptureDynamicData&save in a Param
      .check(jsonPath("$[6].id").saveAs("gameId")))

    .exec(http("Search_Game_from_Param")
      //Fetchthe dyamic data using Param
      .get("videogames/${gameId}")
      .check(jsonPath("$.name").is("Minecraft")))

  //3 Load Scenario
    setUp(
   scn.inject(atOnceUsers( users = 1))
   ).protocols(httpConf)

}

