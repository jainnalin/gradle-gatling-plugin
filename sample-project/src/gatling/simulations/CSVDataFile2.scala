
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class CSVDataFile2 extends Simulation {

  val httpConf = http.baseUrl("http://localhost:8080/app/")
    .header("Accept", "application/json")

 // val csvFeeder = csv("data/gameData.csv").circular
  val csvFeeder = csv("game.csv").circular

  def getSpecificVideoGame() = {
    repeat(10) {
     feed(csvFeeder)
        .exec(http("Get specific video game")
          .get("videogames/${gameId}")
          .check(jsonPath("$.name").is("${gameName}"))
          .check(status.is(200)))
        .pause(1)
    }
  }

  val scn = scenario(scenarioName = "FetchDatafromCsvFile")
    .exec(getSpecificVideoGame())

  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)

}
