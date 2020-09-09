
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class CSVDataFile extends Simulation {

  val httpConf = http.baseUrl("http://localhost:8080/app/")
    .header("Accept", "application/json")

  val csvFeeder = csv("data/game.csv").circular
  //val csvFeeder = csv("games.csv").circular

  val scn = scenario(scenarioName = "3Calls")
  .feed(csvFeeder)
    .exec(http(requestName="Get_Games_Call_1")
      .get ("videogames/1"))

  .exec(http(requestName="Get_Games_Call_2")
    .get ("videogames/${gameId}"))

  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)

}
