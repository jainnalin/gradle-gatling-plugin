
import java.io.File
import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Calendar

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef.{http, _}
import io.gatling.core.structure.{ChainBuilder, ScenarioBuilder}
import io.gatling.jdbc.Predef._

class acschrome extends Simulation {

  val httpProtocol = http
    .baseUrl("https://opssuite.qa6.swacorp.com")
    .inferHtmlResources()
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36")

  val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "none",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val headers_1 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Sec-Fetch-Dest" -> "style",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_3 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_5 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_7 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_28 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Origin" -> "https://eua-opssuite.qa6.swacorp.com",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_29 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_30 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "style",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_35 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_36 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "origin" -> "https://opssuite.qa6.swacorp.com",
    "sec-fetch-dest" -> "font",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin")

  val headers_98 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin")

  val headers_99 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-requested-with" -> "XMLHttpRequest")

  val headers_100 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "content-type" -> "application/json;charset=UTF-8",
    "origin" -> "https://opssuite.qa6.swacorp.com",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-requested-with" -> "XMLHttpRequest")

  val headers_180 = Map(
    "accept" -> "application/json, text/javascript, */*; q=0.01",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-requested-with" -> "XMLHttpRequest")

  val headers_192 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val headers_286 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "cache-control" -> "no-cache, no-store, must-revalidate",
    "expires" -> "-1",
    "pragma" -> "no-cache",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin")

  val headers_372 = Map("Origin" -> "https://opssuite.qa6.swacorp.com")

  val uri1 = "https://eua-opssuite.qa6.swacorp.com"

  val userid_feeder = csv("UserID.csv").random
  val station_feeder = csv("Station.csv").random
  val epochTime = scenario("acschrome")
  val starttime = System.currentTimeMillis()

  val currdate = new SimpleDateFormat("yyyy-MM-dd")

  val acs_main = scenario("acschrome")
    .exec(flushSessionCookies)
    .exec(flushCookieJar)
    .exec(flushHttpCache)
    .exec(_.set("currdate", currdate.format(Calendar.getInstance().getTime())))
    .exec(_.set("epochTime", System.currentTimeMillis / 1000))
    .exec(http("01_01_ACS_Launch_Main")
      .get("/opssuite")
      .headers(headers_0)
      //<link id="csslink" rel="Stylesheet" type="text/css" href="Themes/2016%20Light/MFAStyleSheet.css?version=9.2.0.85" />
      //<form method="post" action="/oauth2/SecureAuth.aspx?response_type=code&amp;client_id=0c6141093c6144339b643981de9130a5&amp;redirect_uri=com.southwest.aws.eua%3a%2foauth2%2fidpresponse&amp;scope=openid+profile+email&amp;state=eyJjYWxsYmFjayI6Imh0dHBzOi8vb3Bzc3VpdGUucWE2LnN3YWNvcnAuY29tL29wc3N1aXRlIiwiY29kZV92ZXJpZmllciI6ImtOSGpHcTN-NlUwOVlNU01HNFExY0RXbExHYS0tMkdaQVhEWDNGcmdhM2tHQVRwRVV5cW1oUHhWb01PMHRDS2lrbnNCbzRuOEZocFNIM0NJSkxoc2JBd2ZYaXVwTzFYZCIsIm5vbmNlIjoiZDgyOGJiNDQtMzcyOC00MTFhLTVjMGItNjBjNTZmMjcyMGNkIiwic2VydmljZSI6InhscWV1YS1vcHNzdWl0ZSIsInRpbWUiOjE1OTM0NDYwMDd9&amp;nonce=d828bb44-3728-411a-5c0b-60c56f2720cd&amp;code_challenge=REbIW9cGh3-gYvsWDUP9FzQbn6afFV_GT_htenudRZ0&amp;code_challenge_method=S256" id="aspnetForm" class="form">
      //<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="2+32i7ocDdGWERB6h3DxxMC7r1xjQbLodgYxdDRARREWL38qJ5oEZUuA18F+Lk0q7bnizAcwiixdZlN0VHAEXg6/B6XFiBlTLquPqEzoGoZjolgo6UJdLmgrU9A9PqyUQUBG6mEuXHiDQUUfWgSbrJ1XCTgCHE6Xc3IUzG8iUS2WP+eYy+6mvehJ4L2Hnv42PIRFQwSTuwNg0L+Sd7Px7iH5gBtYlbBk4gvwnHIC1YB3ZntwRnPZlKo6ZlJtS2O8lUCxyvrGw2sXB7dXA0XyxuAiQXODaEGT3mnjoMRiou9nX9px1/X+e2gR+dHQAeABecqbZtTuHMt/SUdlePf7KC9R2n4Tj+U072GXyKRoquXy5In+y1SFrfWA4SmIidm8/ze1sNdfYvz3SVqKq8VUGvB/Yky10nmUe6g+xwpKkNPw6rd+uta8sfFYwANYPL+jA1M7e0SyCfmDzovpxWclXrMMc/ffbgEvk3eoXEWLeDl6Lyapjo57uXS7VzIMTIJWQ//LX334V3W/hvlo70+LKFgwvzh/JWikIw277D1RtABwdh325wbbv3Tk+oA6UrvhGe8nEl5LYxpVE3yLnOnXp88ByVHils5jucVxVMvI5kaIjyxT39UDftqU+vMYhAo0Q7LA28YSa39f0GV/RocYMs4WHY7jEtusdDvIthNPtnk73uzNTRSENb9dPWxT+y6CJzj/6J9P+l+9bzH7/Ur5UY7qogWsoGOFn2zycsxLR9r0WYyGj2y21K+DYRQZWpCRujBvxFN1Cy5tE3g4qYv6GlZ+1XI2ZILVBK7m16LSmv3CmWWeUMPBNsElSjXdrk7x55UPFRlc5a1DDc0O4jDtBDhAgNJWSAl9fzEzXRPlxAO7ALKYOeJeulGbyQR3KK0C+6YK9CMMq60gAvsWCitofnZIUaIPxvQzugPW5bX2u37nVgdSjPHAXRGSkeKiGYuVfF3TBpRfGrzu/6UVKG37jDfV87owv0tGYWIS6Sp2oJfW0NCN7ZK/oiHmw3L1+nfZFS3oglDuG3onyOXBb4WNHoa3HSQC1d/f9tBcnGo1oVLoBaA+bS4hMK1ruSS8wsWUVKczc7A8CWGWWy8HLBk91CvIn1t+VsZvYbIHJ2rDxUqwJataAcMHkBbA3T/eO7M0eyO1Cg4X1g9jaVrjfpIx3kx7mTUAMGfkz06T83UZ/ZXv3bZVuIUANA651PqUDPCQ4WpOSeT+JHO8S3lLX1m/njdTPd09qmzKNUiJRdjnEdfuGIvuvOcHrlIvgnSdvLX0WlGAWH/LmpOwrlo0JtYJW5XwwiTdBzOfuwTLLf/EYpLiktE29CyrO4kGLQrL4ljcIHyQjLEgqV0DMtEupOnn6vmHDiVgO6wvAL5nVicBErwmYl0TjhjWvxPMTOwZgLMddBjYdltzelhRIE/4i4yPbaStkMtt/AhxyVdUZ0izLq2gaeEjsUnPFRQEwEG27lpc0FfkSyuKxj0M+1Ha8p2XLMgG0EkzaDrX6yasoVmrBwctsp8WRv69Z2G1EkSeCwQym1Yy6xtazJb4E1eIogeEHJlSsdycy/xhxl0EvEEz9wmemf64yU7CKrwZ/KrK03cSiAl2UHh1JyeagcNMqkEGp5Z1V6oNR/bEn1ZcZMy4jbH87FJcFylEvB/68BZXJNoFcPqM+xxn991E+Wr3fBsMVi0oE1HBvGNxitHnyS5YlLLa/j6ShL1cxD0fBVzHqew+6MjvSUB9ycPq4cBu0LCwq4TUOTsUTLj4I7cSXbAewIeV///rNvqTP3ueEc2KRq86YrWIHwG1nCrv9OxlpwLmzlkXBgE2JV9o/6zeFZHoqizI240PcCbVI4gz1EGG2zNKJ8YWSPdhcs7JNeizLMNtcSeALoaaw0LyOBJt+aNP5BAHxrKBhOAweeaQGKch9qzF6mAxPwKQ6mGGtCmcEsnOMEi4cE0fM6nHoid+1biAvKDY+iEIKewU53XmMBHFJ6qWNaq8fq8VT/2OhHVZq8mszfGWJ1zF5G3WNIhg+xeAEV+uCExHnZRvECoxmyosI4PXhfQDHYDB9bhAFh7wmWmYMWN3Uk26B1SxNqEhH53aBNkm2D00qU8nmTPf8OpIGW8iaUo2sJYw7m1HHnlLgcn0EyclalLIYZgXHnNRylX0wYPLJTI6OKMKqS0q+RngErdapELsInF5NEGM83JJuHZ+cpPjfMjMrK0ZGoPN4s74AxY7ezZWiGFoJd00lmoXp2iowaY/TuN2L6n+bw9l3R1V/wkjDcJQmdLL78q9f54dytck/cdPJvj97K7tzh2dJz/mPboE6rwxpuA/AL4z2yz92TDLkd+zGrlIatrg2IsOWolcliETZRwL13n5BfBaMiNJ+iFV4yK4cMmGWAZopOAhptIslJs+dGChoYsmYV+NFppN1TkbP+KWlmYeWhDhC4vm3wiAA7n84H+8npDmxHoPwX8z6A2NV993vcOS8G466Z3RENA+1gz92QfIa9BD+7roUa0g81m2FnXCeGkwO4901DW6xQFf0OQgu2+80eodX6Biog2NJxx+zXjiPkBLg+9yIpIe6GR/Iyy7UCYBvcJPdW6G81klgxA7tC/u6nFw6j1xAVv9oBF81DOAy1CVNKd85N4U0Sho1Jj9liY0Gs2hhDejy2PKo3CqBb4cQPpTtQSEWrwOv08cwV7VmhamEUAB7GtcozO/ZcYAVXM0bWLmaHasSKrtK58j8Je0IyfV31DcX/uEsDiFRch10JMbEmVGb1JN+3UUmG6YB+l3YVu3UTTBKGfUER9LQM2fbnLRcwJOVnXsi4kPnJj/LVJvYpcP40EeSq7iK71wOvs7sSjr4ybldOG6ubKV4kK6QpIYBMpYVvOLV1RmL0C3vXeRMwkCgCF2/D1d4z2Wwy5+xdsDFaT0lQWeSpPwPtJHzm2efQOwJVU3MmqZ2molkYaLCbOJFzUXXrdR1ZxHtpZ22b/a37w0kQcjJrnRx1ccVUrKw7RdRJJJMbI385dDd/huYlHqKt1jT73JkEb1rSBqpy5NpVDWatsGOf9TUvfzqqB9IeNE2g517QP005UoxO4AACBrLFdfxiXZ0NaKlg0Xte8XD0TMjP4FVomcDTWvpgllej3UEvEobiCtHGhIvIMWxAfbEwsoNn1AvMmXglcwJ2S4+9p8lPiPCxsiKkD3XpyElJeFfyAzdT+kO/uX5WCsGbweIFR8GGDcMNLh1VTDvhR8NJdPWoUAOsfy6g8ETNW8Z9LG3gXXrnGCFTtnuhgKKHF5WsaoBNO5+tljc6DFvk4fEmwzgkhlBZZHNpyNB1fJfLwxSsBQFVzxMxGmQmARPoZvPAMHC+T0XRasXLlxWixX3IhFoaSFHfdau/cM8U1AhE2C/xXeSfoV+TP903o7pkwkN/fMSBlxrkXwxTeAYSqh+NVr75g=" />
      //<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="F3CCCF2E" />
      //<input type="hidden" name="ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$hiddenToken" id="hiddenToken" value="5F085FFBD09B3EB0" />
      //<input type="hidden" name="ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$hiddenServerTime" id="hiddenServerTime" value="Monday, June 29, 2020 3:53:27 PM" />
      //.check(bodyString.saveAs("respBody"))   //to display response of the request
      .check(css("#__VIEWSTATEGENERATOR", "value").saveAs("ViewStateGen"))
      .check(css("#__VIEWSTATE", "value").saveAs("ViewState"))
      .check(css("#hiddenToken", "value").saveAs("hidtoken"))
      .check(css("#hiddenServerTime", "value").saveAs("hidServerTime"))
      .check(regex("client_id=(.*)\" id=").saveAs("clientid"))
      .check(regex("version=(.*)\" />").saveAs("versionid"))
      .resources(http("01_01_ACS_Launch_ExtraRequests_01")
        .get(uri1 + "/assets/vendors/bootstrap-sass/assets/stylesheets/bootstrap.css")
        .headers(headers_1),
        http("01_01_ACS_Launch_ExtraRequests_02")
          .get(uri1 + "/Themes/2016%20Light/MFAStyleSheet.css?version=${versionid}")
          .headers(headers_1),
        http("01_01_ACS_Launch_ExtraRequests_03")
          .get(uri1 + "/oauth2/WebResource.axd?d=4xrQC_NZncspxebrSEykmSlnvyQqKgz6lnHf0qILacXhEvVOVVodWyOTvdokrbFvUe7WoARtT8p8AoQGoW8sBsr2du9HXf7y2Ns-wNkov6J_T1guBZJZ55UhI4JWcP3sDUF-HA2&amp;t=636682175540000000")
          .headers(headers_3),
        http("01_01_ACS_Launch_ExtraRequests_04")
          .get(uri1 + "/oauth2/Themes/2016%20Light/theme.js")
          .headers(headers_3),
        http("01_01_ACS_Launch_ExtraRequests_05")
          .get(uri1 + "/Images/swa_logo_light.png")
          .headers(headers_5),
        http("01_01_ACS_Launch_ExtraRequests_06")
          .get(uri1 + "/oauth2/Themes/2016%20Light/app.min.js")
          .headers(headers_3),
        http("01_01_ACS_Launch_ExtraRequests_07")
          .get(uri1 + "/oauth2/Themes/2016%20Light/views/UserIDView/UserIDView.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_08")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/userIdLabel/userIdLabel.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_09")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/logo/logo.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_10")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/pageHeader/pageHeader.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_11")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/passValidMethod/passValidMethod.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_12")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userIdHeader/userIdHeader.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_13")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/passExpire/passExpire.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_14")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userActivexMessage/userActivexMessage.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_15")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/publicPrivateMode/publicPrivateMode.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_16")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/authMethod/authMethod.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_17")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userExpired/userExpired.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_18")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userSocialLogin/userSocialLogin.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_19")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userIdButton/userIdButton.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_20")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIdView/userViewMessage/userViewMessage.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_21")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/forgotUsernameLink/forgotUsernameLink.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_22")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/forgotPasswordLink/forgotPasswordLink.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_23")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/restartLoginLink/restartLoginLink.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_24")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/copyrightText/copyrightText.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_25")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/eulaLink/eulaLink.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_26")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/disclaimerText/disclaimerText.html")
          .headers(headers_7),
        http("01_01_ACS_Launch_ExtraRequests_27")
          .get(uri1 + "/images/Max6.jpg")
          .headers(headers_5)))


    .pause(5) //thinktime between transactions as in Loadrunner
    .feed(userid_feeder)
    .exec(http("01_02_ACS_Login_Main")
      .post(uri1 + "/oauth2/SecureAuth.aspx?response_type=code&client_id=${clientid}")
      .headers(headers_28)
      //urlArgs: 'v=3.1.0-317&b=2020-06-23T15:45:06-0500'
      .check(regex("'v=(.*)&b=").find.saveAs("version"))
      .check(regex("&b=(.*)'").find.saveAs("buildtime"))
      .formParam("__VIEWSTATE", "${ViewState}")
      .formParam("__VIEWSTATEGENERATOR", "${ViewStateGen}")
      .formParam("__VIEWSTATEENCRYPTED", "")
      .formParam("ctl00$ContentPlaceHolder1$hiddenjreversion", "")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$hiddenToken", "${hidtoken}")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$hiddenRet", "")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$hiddenServerTime", "${hidServerTime}")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$hiddenLocalTime", "")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$ContentPlaceHolder1_MFALoginControl1_UserIDView_txtUserid", "${UserName}")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$ContentPlaceHolder1_MFALoginControl1_UserIDView_tbxPassword", "${Password}")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$ContentPlaceHolder1_MFALoginControl1_UserIDView_btnSubmit", "Submit")
      .resources(http("01_02_ACS_Login_ExtraRequests_01")
        .get("/opssuite/localRequireConfig.js")
        .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_02")
          .get("/opssuite/common_ui_assets/opssuite_react_components/opssuite-ui.min.css")
          .headers(headers_30),
        http("01_02_ACS_Login_ExtraRequests_03")
          .get("/opssuite/css/swa.css?v=${version}")
          .headers(headers_30),
        http("01_02_ACS_Login_ExtraRequests_04")
          .get("/opssuite/common_ui_assets/lib/require/require.js")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_05")
          .get("/opssuite/common_ui_assets/lib/codemirror/lib/codemirror.css")
          .headers(headers_30),
        http("01_02_ACS_Login_ExtraRequests_06")
          .get("/opssuite/common_ui_assets/commonRequireConfig.js")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_07")
          .get("/opssuite/common_ui_assets/img/loader.png")
          .headers(headers_35),
        http("01_02_ACS_Login_ExtraRequests_08")
          .get("/opssuite/common_ui_assets/opssuite_react_components/assets/fonts/opensans-light-webfont.woff")
          .headers(headers_36),
        http("01_02_ACS_Login_ExtraRequests_09")
          .get("/opssuite/common_ui_assets/configuration.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_10")
          .get("/opssuite/common_ui_assets/main.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_11")
          .get("/opssuite/common_ui_assets/extensions/lodash.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_12")
          .get("/opssuite/common_ui_assets/lib/durandal/js/system.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_13")
          .get("/opssuite/common_ui_assets/extensions/moment.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_14")
          .get("/opssuite/common_ui_assets/lib/durandal/js/viewLocator.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_15")
          .get("/opssuite/common_ui_assets/extensions/knockout.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_16")
          .get("/opssuite/common_ui_assets/services/reactHelper.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_17")
          .get("/opssuite/common_ui_assets/extensions/gateDialog.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_18")
          .get("/opssuite/common_ui_assets/lib/polyfills/polyfill.min.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_19")
          .get("/opssuite/common_ui_assets/lib/jquery/jquery-private.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_20")
          .get("/opssuite/common_ui_assets/lib/lodash/lodashjs.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_21")
          .get("/opssuite/common_ui_assets/lib/lodash/natural.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_22")
          .get("/opssuite/common_ui_assets/lib/knockout/ko.plus.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_23")
          .get("/opssuite/common_ui_assets/lib/knockout/knockout-fast-foreach.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_24")
          .get("/opssuite/common_ui_assets/lib/durandal/js/viewEngine.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_25")
          .get("/opssuite/common_ui_assets/lib/knockout/knockoutjs.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_26")
          .get("/opssuite/common_ui_assets/lib/moment/momentjs.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_27")
          .get("/opssuite/common_ui_assets/lib/react/react.production.min.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_28")
          .get("/opssuite/common_ui_assets/lib/react/react-dom.production.min.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_29")
          .get("/opssuite/common_ui_assets/lib/durandal/js/app.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_30")
          .get("/opssuite/common_ui_assets/lib/durandal/js/plugins/widget.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_31")
          .get("/opssuite/common_ui_assets/lib/polyfills/fetch.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_32")
          .get("/opssuite/common_ui_assets/lib/durandal/js/plugins/router.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_33")
          .get("/opssuite/common_ui_assets/lib/durandal/js/plugins/dialog.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_34")
          .get("/opssuite/common_ui_assets/opssuite_react_components/opssuite-ui.min.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_35")
          .get("/opssuite/common_ui_assets/lib/jquery/jquery.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_36")
          .get("/opssuite/common_ui_assets/lib/durandal/js/composition.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_37")
          .get("/opssuite/common_ui_assets/lib/durandal/js/events.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_38")
          .get("/opssuite/common_ui_assets/lib/durandal/js/activator.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_39")
          .get("/opssuite/common_ui_assets/lib/durandal/js/plugins/history.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_40")
          .get("/opssuite/common_ui_assets/opssuite_react_components/utils/dateTimeUtils/dateTimeUtils.min.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_49")
          .get("/opssuite/common_ui_assets/lib/durandal/js/binder.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_50")
          .get("/opssuite/common_ui_assets/img/favicon.ico")
          .headers(headers_35),
        http("01_02_ACS_Login_ExtraRequests_51")
          .get("/opssuite/common_ui_assets/shell/shell.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_52")
          .get("/opssuite/common_ui_assets/shell/swaAirportMapper.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_53")
          .get("/opssuite/common_ui_assets/services/userModel.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_54")
          .get("/opssuite/common_ui_assets/user-preferences.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_55")
          .get("/opssuite/common_ui_assets/services/activity_indicator.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_56")
          .get("/opssuite/common_ui_assets/lib/swa/PushNotifications.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_57")
          .get("/opssuite/common_ui_assets/lib/js-cookie/js.cookie.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_58")
          .get("/opssuite/common_ui_assets/services/userSession.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_59")
          .get("/opssuite/common_ui_assets/shell/shellData.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_60")
          .get("/opssuite/common_ui_assets/shell/networkAppRouter.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_61")
          .get("/opssuite/common_ui_assets/lib/url-search-params/url-search-params.amd.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_62")
          .get("/opssuite/common_ui_assets/services/turnPermissionsModel.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_63")
          .get("/opssuite/common_ui_assets/services/gatePermissionsModel.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_64")
          .get("/opssuite/common_ui_assets/services/activity.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_65")
          .get("/opssuite/common_ui_assets/services/httpModel.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_66")
          .get("/opssuite/common_ui_assets/lib/jquery/jquery.cometd.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_67")
          .get("/opssuite/common_ui_assets/bindings/react.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_68")
          .get("/opssuite/common_ui_assets/models/model.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_69")
          .get("/opssuite/common_ui_assets/modules/clock/flyout/ignoreClick.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_70")
          .get("/opssuite/common_ui_assets/shell/getAllToggles.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_71")
          .get("/opssuite/common_ui_assets/modules/clock/flyout/ignoreChild.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_72")
          .get("/opssuite/common_ui_assets/lib/knockout/knockout.mapping.min.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_73")
          .get("/opssuite/common_ui_assets/extensions/validation.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_74")
          .get("/opssuite/common_ui_assets/lib/org/cometd.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_75")
          .get("/opssuite/common_ui_assets/services/janitor.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_76")
          .get("/opssuite/common_ui_assets/lib/knockout/knockout.validation.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_77")
          .get("/opssuite/common_ui_assets/lib/require/text.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_78")
          .get("/opssuite/common_ui_assets/shell/shell.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_79")
          .get("/opssuite/userDetails/getUserDetails?_=${epochTime}")
          .headers(headers_99),
        http("01_02_ACS_Login_ExtraRequests_80")
          .get("/opssuite/timezone/getUserStationTZ?_=${epochTime}")
          .headers(headers_99),
        http("01_02_ACS_Login_ExtraRequests_81")
          .get("/opssuite/timezone/getAllOperationalStationsTz?_=${epochTime}")
          .headers(headers_99),
        http("01_02_ACS_Login_ExtraRequests_82")
          .get("/opssuite/toggle/toggles?_=${epochTime}")
          .headers(headers_99),
        http("01_02_ACS_Login_ExtraRequests_83")
          .get("/opssuite/user-activity/setting/station/DAL?log=true&_=${epochTime}")
          .headers(headers_99),
        http("01_02_ACS_Login_ExtraRequests_84")
          .get("/opssuite/apps/getAll?log=true&_=${epochTime}")
          .headers(headers_99),
        http("01_02_ACS_Login_ExtraRequests_85")
          .get("/opssuite/data/station/getAircraftTypes?_=${epochTime}")
          .headers(headers_99),
        http("01_02_ACS_Login_ExtraRequests_86")
          .get("/opssuite/permissions/retrieveUserDetails?_=${epochTime}")
          .headers(headers_99),
        http("01_02_ACS_Login_ExtraRequests_87")
          .get("/opssuite/common_ui_assets/modules/userPreferences/userPreferences.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_88")
          .get("/opssuite/common_ui_assets/modules/userPreferences/userPreferencesData.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_89")
          .get("/opssuite/common_ui_assets/shell/shell_head.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_90")
          .get("/opssuite/common_ui_assets/lib/durandal/js/transitions/entrance.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_91")
          .get("/opssuite/common_ui_assets/services/cache.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_92")
          .get("/opssuite/common_ui_assets/widgets/checkboxSwitch/viewmodel.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_93")
          .get("/opssuite/common_ui_assets/widgets/stationSelector/viewmodel.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_94")
          .get("/opssuite/common_ui_assets/modules/trayContainer/trayContainer.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_95")
          .get("/opssuite/common_ui_assets/modules/notificationsList/notificationsList.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_96")
          .get("/opssuite/common_ui_assets/widgets/flyout/viewmodel.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_97")
          .get("/opssuite/common_ui_assets/icons/gear_airplane.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_98")
          .get("/opssuite/common_ui_assets/opssuite_react_components/assets/fonts/opensans-regular-webfont.woff")
          .headers(headers_36),
        http("01_02_ACS_Login_ExtraRequests_99")
          .get("/opssuite/common_ui_assets/lib/knockout/customBindings.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_100")
          .get("/opssuite/common_ui_assets/modules/trayContainer/ecblsReport.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_101")
          .get("/opssuite/common_ui_assets/opssuite_react_components/assets/fonts/opensans-semibold-webfont.woff")
          .headers(headers_36),
        http("01_02_ACS_Login_ExtraRequests_102")
          .get("/opssuite/common_ui_assets/modules/notificationsList/notificationsListData.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_103")
          .get("/opssuite/common_ui_assets/widgets/flyout/flyoutFocus.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_104")
          .get("/opssuite/common_ui_assets/modules/userPreferences/userPreferences.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_105")
          .get("/opssuite/common_ui_assets/models/viewModel.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_106")
          .get("/opssuite/common_ui_assets/widgets/flyout/flyoutPositionRight.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_107")
          .get("/opssuite/common_ui_assets/widgets/flyout/flyoutMouseEvent.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_108")
          .get("/opssuite/common_ui_assets/widgets/flyout/flyoutPositionTimeline.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_109")
          .get("/opssuite/common_ui_assets/widgets/flyout/flyoutPositionBottom.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_110")
          .get("/opssuite/common_ui_assets/modules/notificationsList/desktopNotifications.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_111")
          .get("/opssuite/common_ui_assets/opssuite_react_components/assets/fonts/ocl-icon.woff")
          .headers(headers_36),
        http("01_02_ACS_Login_ExtraRequests_112")
          .get("/opssuite/common_ui_assets/services/permissions.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_113")
          .get("/opssuite/common_ui_assets/services/notification.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_114")
          .get("/opssuite/common_ui_assets/widgets/checkboxSwitch/view.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_115")
          .get("/opssuite/common_ui_assets/lib/swa/Tabs.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_116")
          .get("/opssuite/common_ui_assets/lib/swa/Dropdown.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_117")
          .get("/opssuite/common_ui_assets/lib/swa/Split.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_118")
          .get("/opssuite/common_ui_assets/lib/swa/Collapsible.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_119")
          .get("/opssuite/common_ui_assets/lib/jquery/jquery.shim.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_120")
          .get("/opssuite/common_ui_assets/widget/SelectorWidget/selector.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_121")
          .get("/opssuite/common_ui_assets/components/radio.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_122")
          .get("/opssuite/common_ui_assets/extensions/lodash4.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_123")
          .get("/opssuite/common_ui_assets/lib/mousetrap/mousetrap.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_124")
          .get("/opssuite/common_ui_assets/lib/d3/d3.amd.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_125")
          .get("/opssuite/common_ui_assets/services/time.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_126")
          .get("/opssuite/common_ui_assets/components/dropdown.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_127")
          .get("/opssuite/common_ui_assets/lib/moment/moment-duration-format.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_128")
          .get("/opssuite/common_ui_assets/lib/swa/FancyRadio.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_129")
          .get("/opssuite/common_ui_assets/services/route_observer.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_130")
          .get("/opssuite/common_ui_assets/services/service_interface.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_131")
          .get("/opssuite/common_ui_assets/modules/trayContainer/trayContainerData.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_132")
          .get("/opssuite/common_ui_assets/opssuite_react_components/assets/fonts/opensans-bold-webfont.woff")
          .headers(headers_36),
        http("01_02_ACS_Login_ExtraRequests_133")
          .get("/opssuite/common_ui_assets/lib/pnotify/pnotify.core.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_134")
          .get("/opssuite/common_ui_assets/widgets/flyout/flyoutPositionClick.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_135")
          .get("/opssuite/common_ui_assets/lib/pdfmake/pdfmake.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_136")
          .get("/opssuite/common_ui_assets/lib/jquery/jqueryui.timepicker.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_137")
          .get("/opssuite/common_ui_assets/lib/moment/moment-timezone.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_138")
          .get("/opssuite/common_ui_assets/lib/jquery/jquery.actual.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_139")
          .get("/opssuite/common_ui_assets/lib/d3/d3.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_140")
          .get("/opssuite/common_ui_assets/widget/SelectorWidget/templates/stationSelector.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_141")
          .get("/opssuite/common_ui_assets/lib/lodash/lodashjs.4.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_142")
          .get("/opssuite/common_ui_assets/lib/moment/moment-timezone-data.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_143")
          .get("/opssuite/common_ui_assets/lib/jquery/chosen.jquery.min.js?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_144")
          .get("/opssuite/common_ui_assets/lib/jquery/jqueryui.js?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_145")
          .get("/opssuite/common_ui_assets/lib/jquery/jquery.terminal.js?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_146")
          .get("/opssuite/common_ui_assets/lib/jquery/jquery.tooltipster.js?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_147")
          .get("/opssuite/common_ui_assets/lib/pdfmake/vfs_fonts.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_148")
          .get("/opssuite/common_ui_assets/widgets/flyout/view.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_149")
          .get("/opssuite/common_ui_assets/widgets/stationSelector/view.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_150")
          .get("/opssuite/common_ui_assets/modules/notificationsList/notificationsList.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_151")
          .get("/opssuite/common_ui_assets/modules/clock/clock.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_152")
          .get("/opssuite/common_ui_assets/modules/clock/timeZonePopup.js?v=${version}&b=${buildtime}")
          .headers(headers_29),
        http("01_02_ACS_Login_ExtraRequests_153")
          .get("/opssuite/common_ui_assets/modules/trayContainer/trayContainer.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_155")
          .get("/opssuite/userDetails/getPermissions?_=${epochTime}")
          .headers(headers_99),
        http("01_02_ACS_Login_ExtraRequests_156")
          .get("/opssuite/getFilter?_=${epochTime}")
          .headers(headers_180),
        http("01_02_ACS_Login_ExtraRequests_157")
          .get("/opssuite/common_ui_assets/modules/clock/clock.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_157")
          .get("/opssuite/common_ui_assets/modules/clock/timeZonePopup.html?v=${version}&b=${buildtime}")
          .headers(headers_98),
        http("01_02_ACS_Login_ExtraRequests_158")
          .get("/opssuite/data/station/getSwaStations?_=${epochTime}")
          .headers(headers_180),
        http("01_02_ACS_Login_ExtraRequests_159")
          .get("/opssuite/helpDocument/getUploadPdf?_=${epochTime}")
          .headers(headers_99),
        http("01_02_ACS_Login_ExtraRequests_160")
          .get("/opssuite/sodSector/getList?_=${epochTime}")
          .headers(headers_180),
        http("01_02_ACS_Login_ExtraRequests_161")
          .get("/opssuite/notification?_=${epochTime}")
          .headers(headers_180)))
    .pause(5)
    .exec(http("01_02_ACS_Login_Handshake")
      .post("/opssuite/cometd/handshake")
      .headers(headers_100)
      //.body(RawFileBody("opssuitechrome/acschrome/0100_request.json")).asJson
      .body(StringBody("""[{"id":"1","version":"1.0","minimumVersion":"1.0","channel":"/meta/handshake","supportedConnectionTypes":["long-polling","callback-polling"],"advice":{"timeout":60000,"interval":0}}]""")).asJson
      .check(jsonPath("$..*").find.saveAs("resp")) //captures the entire response
      .check(jsonPath("$..clientId").find.saveAs("client"))
      .resources(http("01_02_ACS_Login_Connect_1")
        .post("/opssuite/cometd/connect")
        .headers(headers_100)
        //.body(ElFileBody("opssuitechrome/acschrome/0102_request.json")).asJson
        .body(StringBody("""[{"id":"2","channel":"/meta/connect","connectionType":"long-polling","advice":{"timeout":0},"clientId":"${client}"}]""")).asJson
        .check(jsonPath("$..*").find.saveAs("resp1")),
        http("01_02_ACS_Login_Connect_2")
          .post("/opssuite/cometd/connect")
          .headers(headers_100)
          //.body(RawFileBody("opssuitechrome/acschrome/0105_request.json"))
          .body(StringBody("""[{"id":"3","channel":"/meta/connect","connectionType":"long-polling","clientId":"${client}"}]""")).asJson,
        http("01_02_ACS_Login_Connect_3")
          .post("/opssuite/cometd/connect")
          .headers(headers_100)
          //.body(RawFileBody("opssuitechrome/acschrome/0106_request.json")),
          .body(StringBody("""[{"id":"4","channel":"/meta/connect","connectionType":"long-polling","advice":{"timeout":0},"clientId":"${client}"}]""")).asJson
          .check(jsonPath("$..*").find.saveAs("resp3")),
        http("01_02_ACS_Login_Subscribe_4")
          .post("/opssuite/cometd/")
          .headers(headers_100)
          //.body(RawFileBody("opssuitechrome/acschrome/0181_request.json")),
          .body(StringBody("""[{"id":"5","channel":"/meta/subscribe","subscription":"/upload-pdf/*","clientId":"${client}"}]""")).asJson
          .check(jsonPath("$..*").find.saveAs("resp4"))))
    .repeat(20) {

      exec(http("01_03_ACS_ClickAircraftSchedule_Main")
        .get("/opssuite-recovery/")
        .headers(headers_192)
        //urlArgs: 'v=2.7.0-330&b=2020-06-08T12:16:57-0500'
        .check(regex("'v=(.*)&b=").find.saveAs("version_1"))
        .check(regex("&b=(.*)'").find.saveAs("buildtime_1"))
        .resources(http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_01")
          .get("/opssuite-recovery/css/swa.css?v=${version_1}")
          .headers(headers_30),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_02")
            .get("/opssuite-recovery/localRequireConfig.js")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_03")
            .get("/opssuite-recovery/common_ui_assets/lib/codemirror/lib/codemirror.css")
            .headers(headers_30),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_04")
            .get("/opssuite-recovery/common_ui_assets/lib/require/require.js")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_05")
            .get("/opssuite-recovery/common_ui_assets/opssuite_react_components/opssuite-ui.min.css")
            .headers(headers_30),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_06")
            .get("/opssuite-recovery/common_ui_assets/commonRequireConfig.js")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_07")
            .get("/opssuite-recovery/common_ui_assets/main.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_08")
            .get("/opssuite-recovery/common_ui_assets/img/favicon.ico")
            .headers(headers_35),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_09")
            .get("/opssuite-recovery/common_ui_assets/configuration.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_10")
            .get("/opssuite-recovery/common_ui_assets/extensions/lodash.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_11")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/app.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_12")
            .get("/opssuite-recovery/common_ui_assets/extensions/knockout.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_13")
            .get("/opssuite-recovery/common_ui_assets/extensions/moment.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_14")
            .get("/opssuite-recovery/common_ui_assets/extensions/gateDialog.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_15")
            .get("/opssuite-recovery/common_ui_assets/lib/polyfills/polyfill.min.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_16")
            .get("/opssuite-recovery/common_ui_assets/lib/lodash/lodashjs.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_17")
            .get("/opssuite-recovery/common_ui_assets/lib/lodash/natural.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_18")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/events.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_19")
            .get("/opssuite-recovery/common_ui_assets/lib/jquery/jquery-private.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_20")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/composition.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_21")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/viewEngine.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_22")
            .get("/opssuite-recovery/common_ui_assets/lib/knockout/knockoutjs.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_23")
            .get("/opssuite-recovery/common_ui_assets/lib/knockout/ko.plus.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_24")
            .get("/opssuite-recovery/common_ui_assets/lib/moment/momentjs.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_25")
            .get("/opssuite-recovery/common_ui_assets/lib/jquery/jquery.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_26")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/binder.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_27")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/activator.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_28")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/viewLocator.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_29")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/plugins/router.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_30")
            .get("/opssuite-recovery/common_ui_assets/services/reactHelper.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_31")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/plugins/dialog.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_32")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/system.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_33")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/plugins/widget.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_34")
            .get("/opssuite-recovery/common_ui_assets/lib/polyfills/fetch.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_35")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/plugins/history.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_36")
            .get("/opssuite-recovery/common_ui_assets/lib/react/react.production.min.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_37")
            .get("/opssuite-recovery/common_ui_assets/lib/react/react-dom.production.min.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_38")
            .get("/opssuite-recovery/common_ui_assets/lib/knockout/knockout-fast-foreach.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_39")
            .get("/opssuite-recovery/common_ui_assets/opssuite_react_components/opssuite-ui.min.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_40")
            .get("/opssuite-recovery/common_ui_assets/opssuite_react_components/utils/dateTimeUtils/dateTimeUtils.min.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_41")
            .get("/opssuite-recovery/common_ui_assets/img/loader.png")
            .headers(headers_35),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_42")
            .get("/opssuite-recovery/common_ui_assets/opssuite_react_components/assets/fonts/opensans-light-webfont.woff")
            .headers(headers_36),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_43")
            .get("/opssuite-recovery/common_ui_assets/shell/shell.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_44")
            .get("/opssuite-recovery/common_ui_assets/shell/networkAppRouter.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_45")
            .get("/opssuite-recovery/common_ui_assets/lib/swa/PushNotifications.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_46")
            .get("/opssuite-recovery/common_ui_assets/modules/clock/flyout/ignoreClick.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_47")
            .get("/opssuite-recovery/common_ui_assets/services/userSession.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_48")
            .get("/opssuite-recovery/common_ui_assets/user-preferences.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_49")
            .get("/opssuite-recovery/common_ui_assets/shell/shellData.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_50")
            .get("/opssuite-recovery/common_ui_assets/services/activity_indicator.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_51")
            .get("/opssuite-recovery/common_ui_assets/shell/swaAirportMapper.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_52")
            .get("/opssuite-recovery/common_ui_assets/lib/js-cookie/js.cookie.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_53")
            .get("/opssuite-recovery/common_ui_assets/modules/clock/flyout/ignoreChild.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_54")
            .get("/opssuite-recovery/common_ui_assets/lib/url-search-params/url-search-params.amd.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_55")
            .get("/opssuite-recovery/common_ui_assets/services/userModel.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_56")
            .get("/opssuite-recovery/common_ui_assets/shell/getAllToggles.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_57")
            .get("/opssuite-recovery/common_ui_assets/bindings/react.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_58")
            .get("/opssuite-recovery/common_ui_assets/services/httpModel.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_59")
            .get("/opssuite-recovery/common_ui_assets/models/model.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_60")
            .get("/opssuite-recovery/common_ui_assets/lib/jquery/jquery.cometd.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_61")
            .get("/opssuite-recovery/common_ui_assets/services/activity.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_62")
            .get("/opssuite-recovery/common_ui_assets/services/gatePermissionsModel.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_63")
            .get("/opssuite-recovery/common_ui_assets/services/turnPermissionsModel.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_64")
            .get("/opssuite-recovery/common_ui_assets/extensions/validation.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_65")
            .get("/opssuite-recovery/common_ui_assets/lib/org/cometd.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_66")
            .get("/opssuite-recovery/common_ui_assets/services/janitor.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_67")
            .get("/opssuite-recovery/common_ui_assets/lib/knockout/knockout.mapping.min.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_68")
            .get("/opssuite-recovery/common_ui_assets/lib/knockout/knockout.validation.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_69")
            .get("/opssuite-recovery/common_ui_assets/lib/require/text.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_70")
            .get("/opssuite-recovery/common_ui_assets/shell/shell.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_71")
            .get("/opssuite/userDetails/getUserDetails?_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_72")
            .get("/opssuite/timezone/getUserStationTZ?_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_73")
            .get("/opssuite/timezone/getAllOperationalStationsTz?_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_74")
            .get("/opssuite/toggle/toggles?_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_75")
            .get("/opssuite/apps/getAll?log=true&_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_76")
            .get("/opssuite/data/station/getAircraftTypes?_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_77")
            .get("/opssuite-recovery/app/index.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_78")
            .get("/opssuite/permissions/retrieveUserDetails?_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_79")
            .get("/opssuite-recovery/app/aernando-schedule/index.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_80")
            .get("/opssuite-recovery/app/aernando-schedule/aernandoSchedule.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_81")
            .get("/opssuite-recovery/common_ui_assets/shell/shell_head.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_82")
            .get("/opssuite-recovery/common_ui_assets/lib/durandal/js/transitions/entrance.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_83")
            .get("/opssuite-recovery/app/aernando-schedule/aernandoScheduleDataService.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_84")
            .get("/opssuite-recovery/common_ui_assets/lib/swa/Refresher.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_85")
            .get("/opssuite-recovery/app/index.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_86")
            .get("/opssuite-recovery/data/schedule/getAllAircraftTails/${currdate}?_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_87")
            .get("/opssuite-recovery/common_ui_assets/widgets/checkboxSwitch/viewmodel.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_88")
            .get("/opssuite-recovery/data/schedule/getAllFlightNumbers/${currdate}?_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_89")
            .get("/opssuite/data/station/getSwaStations")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_90")
            .get("/opssuite-recovery/common_ui_assets/widgets/flyout/viewmodel.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_91")
            .get("/opssuite-recovery/common_ui_assets/icons/gear_airplane.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_92")
            .get("/opssuite/toggle/toggles")
            .headers(headers_286),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_93")
            .get("/opssuite-recovery/data/schedule/getAllPatternNumbers/${currdate}?_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_94")
            .get("/opssuite-recovery/app/aernando-schedule/index.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_95")
            .get("/opssuite-recovery/common_ui_assets/opssuite_react_components/assets/fonts/opensans-semibold-webfont.woff")
            .headers(headers_36),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_96")
            .get("/opssuite-recovery/common_ui_assets/opssuite_react_components/assets/fonts/ocl-icon.woff")
            .headers(headers_36),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_97")
            .get("/opssuite-recovery/common_ui_assets/modules/notificationsList/notificationsList.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_98")
            .get("/opssuite-recovery/common_ui_assets/modules/trayContainer/trayContainer.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_99")
            .get("/opssuite-recovery/common_ui_assets/opssuite_react_components/assets/fonts/opensans-regular-webfont.woff")
            .headers(headers_36),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_100")
            .get("/opssuite-recovery/common_ui_assets/widgets/checkboxSwitch/view.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_101")
            .get("/opssuite-recovery/common_ui_assets/widgets/flyout/flyoutPositionBottom.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_102")
            .get("/opssuite-recovery/common_ui_assets/widgets/flyout/flyoutPositionRight.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_103")
            .get("/opssuite-recovery/common_ui_assets/widgets/flyout/flyoutPositionClick.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_104")
            .get("/opssuite-recovery/common_ui_assets/widgets/flyout/flyoutMouseEvent.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_105")
            .get("/opssuite-recovery/common_ui_assets/widgets/flyout/flyoutPositionTimeline.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_106")
            .get("/opssuite-recovery/common_ui_assets/widgets/flyout/flyoutFocus.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_107")
            .get("/opssuite-recovery/common_ui_assets/modules/notificationsList/desktopNotifications.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_108")
            .get("/opssuite-recovery/common_ui_assets/services/permissions.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_109")
            .get("/opssuite-recovery/common_ui_assets/lib/knockout/customBindings.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_110")
            .get("/opssuite-recovery/common_ui_assets/modules/trayContainer/ecblsReport.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_111")
            .get("/opssuite-recovery/common_ui_assets/models/viewModel.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_112")
            .get("/opssuite-recovery/common_ui_assets/services/notification.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_113")
            .get("/opssuite-recovery/common_ui_assets/modules/trayContainer/trayContainerData.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_114")
            .get("/opssuite-recovery/common_ui_assets/modules/notificationsList/notificationsListData.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_115")
            .get("/opssuite-recovery/common_ui_assets/opssuite_react_components/assets/fonts/opensans-bold-webfont.woff")
            .headers(headers_36),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_116")
            .get("/opssuite-recovery/common_ui_assets/extensions/lodash4.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_117")
            .get("/opssuite-recovery/common_ui_assets/lib/swa/Collapsible.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_118")
            .get("/opssuite-recovery/common_ui_assets/lib/swa/Dropdown.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_119")
            .get("/opssuite-recovery/common_ui_assets/lib/swa/Split.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_120")
            .get("/opssuite-recovery/common_ui_assets/lib/swa/FancyRadio.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_121")
            .get("/opssuite-recovery/common_ui_assets/lib/d3/d3.amd.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_122")
            .get("/opssuite-recovery/common_ui_assets/services/time.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_123")
            .get("/opssuite-recovery/common_ui_assets/services/service_interface.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_124")
            .get("/opssuite-recovery/common_ui_assets/lib/jquery/jquery.shim.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_125")
            .get("/opssuite-recovery/common_ui_assets/widget/SelectorWidget/selector.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_126")
            .get("/opssuite-recovery/common_ui_assets/components/dropdown.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_127")
            .get("/opssuite-recovery/common_ui_assets/components/radio.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_128")
            .get("/opssuite-recovery/common_ui_assets/lib/moment/moment-duration-format.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_129")
            .get("/opssuite-recovery/common_ui_assets/lib/pnotify/pnotify.core.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_130")
            .get("/opssuite-recovery/common_ui_assets/lib/mousetrap/mousetrap.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_131")
            .get("/opssuite-recovery/common_ui_assets/services/route_observer.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_132")
            .get("/opssuite-recovery/common_ui_assets/lib/swa/Tabs.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_133")
            .get("/opssuite-recovery/common_ui_assets/lib/pdfmake/pdfmake.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_134")
            .get("/opssuite-recovery/common_ui_assets/lib/moment/moment-timezone.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_135")
            .get("/opssuite-recovery/common_ui_assets/lib/jquery/jqueryui.timepicker.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_136")
            .get("/opssuite-recovery/common_ui_assets/lib/jquery/jquery.actual.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_137")
            .get("/opssuite-recovery/common_ui_assets/widget/SelectorWidget/templates/stationSelector.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_138")
            .get("/opssuite-recovery/common_ui_assets/lib/moment/moment-timezone-data.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_139")
            .get("/opssuite-recovery/common_ui_assets/lib/jquery/chosen.jquery.min.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_140")
            .get("/opssuite-recovery/common_ui_assets/lib/jquery/jqueryui.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_141")
            .get("/opssuite-recovery/common_ui_assets/lib/jquery/jquery.terminal.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_142")
            .get("/opssuite-recovery/common_ui_assets/widgets/flyout/view.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_143")
            .get("/opssuite-recovery/common_ui_assets/lib/d3/d3.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_144")
            .get("/opssuite-recovery/common_ui_assets/lib/lodash/lodashjs.4.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_145")
            .get("/opssuite-recovery/common_ui_assets/lib/pdfmake/vfs_fonts.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_146")
            .get("/opssuite-recovery/common_ui_assets/lib/jquery/jquery.tooltipster.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_147")
            .get("/opssuite-recovery/common_ui_assets/modules/clock/timeZonePopup.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_148")
            .get("/opssuite-recovery/common_ui_assets/modules/clock/clock.js?v=${version_1}&b=${buildtime_1}")
            .headers(headers_29),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_149")
            .get("/opssuite-recovery/common_ui_assets/modules/clock/timeZonePopup.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_150")
            .get("/opssuite-recovery/common_ui_assets/modules/clock/clock.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_151")
            .get("/opssuite-recovery/common_ui_assets/modules/trayContainer/trayContainer.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_152")
            .get("/opssuite-recovery/common_ui_assets/modules/notificationsList/notificationsList.html?v=${version_1}&b=${buildtime_1}")
            .headers(headers_98),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_153")
            .get("/opssuite/userDetails/getPermissions?_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_154")
            .get("/opssuite/getFilter?_=${epochTime}")
            .headers(headers_180),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_155")
            .get("/opssuite/helpDocument/getUploadPdf?_=${epochTime}")
            .headers(headers_99),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_156")
            .get("/opssuite/data/station/getSwaStations?_=${epochTime}")
            .headers(headers_180),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_157")
            .get("/opssuite/sodSector/getList?_=${epochTime}")
            .headers(headers_180),
          http("01_03_ACS_ClickAircraftSchedule_ExtraRequests_158")
            .get("/opssuite/notification?_=${epochTime}")
            .headers(headers_180)))

        /*.exec(session => {
                println(session("version_1").as[String])
                println(session("buildtime_1").as[String])
                session
        })*/

        .pause(5)
      feed(station_feeder)
        .exec(http("01_04_ACS_SearchStation_Main")
          .get("/opssuite-recovery/aernando-schedule/station?schedDate=${currdate}&stationIataCode=${IataStation}&_=${epochTime}")
          .headers(headers_99)
          .check(status.in(200, 201, 202, 203, 204, 205, 206, 207, 208, 226, 300, 301, 302, 303, 304, 305, 306, 307, 308))
          .check(jsonPath("$..aircraftOnGroundCount").find.saveAs("ACOnGrndCount")))
        .pause(60,90)
    }
    .pause(5)
  exec(http("01_05_ACS_ClickMainGear_Main")
    .get("/opssuite/")
    .headers(headers_192)
    .resources(http("01_05_ACS_ClickMainGear_ExtraRequests_01")
      .get("/opssuite/css/swa.css?v=${version}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_02")
        .get("/opssuite/common_ui_assets/lib/codemirror/lib/codemirror.css"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_03")
        .get("/opssuite/common_ui_assets/opssuite_react_components/opssuite-ui.min.css"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_04")
        .get("/opssuite/common_ui_assets/lib/require/require.js"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_05")
        .get("/opssuite/common_ui_assets/commonRequireConfig.js"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_06")
        .get("/opssuite/localRequireConfig.js"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_07")
        .get("/opssuite/common_ui_assets/img/loader.png"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_08")
        .get("/opssuite/common_ui_assets/opssuite_react_components/assets/fonts/opensans-light-webfont.woff")
        .headers(headers_372),
      http("01_05_ACS_ClickMainGear_ExtraRequests_09")
        .get("/opssuite/common_ui_assets/configuration.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_10")
        .get("/opssuite/common_ui_assets/main.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_11")
        .get("/opssuite/common_ui_assets/extensions/lodash.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_12")
        .get("/opssuite/common_ui_assets/extensions/moment.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_13")
        .get("/opssuite/common_ui_assets/extensions/knockout.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_14")
        .get("/opssuite/common_ui_assets/lib/durandal/js/system.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_15")
        .get("/opssuite/common_ui_assets/lib/durandal/js/app.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_16")
        .get("/opssuite/common_ui_assets/lib/durandal/js/viewLocator.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_17")
        .get("/opssuite/common_ui_assets/lib/durandal/js/plugins/widget.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_18")
        .get("/opssuite/common_ui_assets/lib/durandal/js/plugins/router.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_19")
        .get("/opssuite/common_ui_assets/lib/durandal/js/plugins/dialog.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_20")
        .get("/opssuite/common_ui_assets/extensions/gateDialog.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_21")
        .get("/opssuite/common_ui_assets/services/reactHelper.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_22")
        .get("/opssuite/common_ui_assets/lib/polyfills/fetch.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_23")
        .get("/opssuite/common_ui_assets/lib/polyfills/polyfill.min.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_24")
        .get("/opssuite/common_ui_assets/lib/lodash/lodashjs.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_25")
        .get("/opssuite/common_ui_assets/lib/jquery/jquery-private.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_26")
        .get("/opssuite/common_ui_assets/lib/lodash/natural.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_27")
        .get("/opssuite/common_ui_assets/lib/durandal/js/composition.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_28")
        .get("/opssuite/common_ui_assets/lib/durandal/js/activator.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_29")
        .get("/opssuite/common_ui_assets/lib/durandal/js/viewEngine.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_30")
        .get("/opssuite/common_ui_assets/lib/knockout/knockoutjs.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_31")
        .get("/opssuite/common_ui_assets/lib/knockout/ko.plus.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_32")
        .get("/opssuite/common_ui_assets/lib/knockout/knockout-fast-foreach.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_33")
        .get("/opssuite/common_ui_assets/lib/durandal/js/events.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_34")
        .get("/opssuite/common_ui_assets/lib/react/react.production.min.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_35")
        .get("/opssuite/common_ui_assets/lib/react/react-dom.production.min.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_36")
        .get("/opssuite/common_ui_assets/lib/durandal/js/plugins/history.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_37")
        .get("/opssuite/common_ui_assets/lib/moment/momentjs.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_38")
        .get("/opssuite/common_ui_assets/lib/jquery/jquery.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_39")
        .get("/opssuite/common_ui_assets/lib/durandal/js/binder.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_40")
        .get("/opssuite/common_ui_assets/opssuite_react_components/opssuite-ui.min.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_41")
        .get("/opssuite/common_ui_assets/opssuite_react_components/utils/dateTimeUtils/dateTimeUtils.min.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_42")
        .get("/opssuite/common_ui_assets/img/favicon.ico"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_43")
        .get("/opssuite/common_ui_assets/shell/shell.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_44")
        .get("/opssuite/common_ui_assets/shell/networkAppRouter.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_45")
        .get("/opssuite/common_ui_assets/services/userSession.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_46")
        .get("/opssuite/common_ui_assets/user-preferences.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_47")
        .get("/opssuite/common_ui_assets/services/userModel.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_48")
        .get("/opssuite/common_ui_assets/lib/swa/PushNotifications.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_49")
        .get("/opssuite/common_ui_assets/shell/shellData.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_50")
        .get("/opssuite/common_ui_assets/services/activity_indicator.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_51")
        .get("/opssuite/common_ui_assets/shell/swaAirportMapper.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_52")
        .get("/opssuite/common_ui_assets/lib/js-cookie/js.cookie.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_53")
        .get("/opssuite/common_ui_assets/modules/clock/flyout/ignoreClick.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_54")
        .get("/opssuite/common_ui_assets/modules/clock/flyout/ignoreChild.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_55")
        .get("/opssuite/common_ui_assets/lib/url-search-params/url-search-params.amd.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_56")
        .get("/opssuite/common_ui_assets/shell/getAllToggles.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_57")
        .get("/opssuite/common_ui_assets/bindings/react.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_58")
        .get("/opssuite/common_ui_assets/services/httpModel.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_59")
        .get("/opssuite/common_ui_assets/models/model.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_60")
        .get("/opssuite/common_ui_assets/services/gatePermissionsModel.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_61")
        .get("/opssuite/common_ui_assets/services/turnPermissionsModel.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_62")
        .get("/opssuite/common_ui_assets/lib/jquery/jquery.cometd.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_63")
        .get("/opssuite/common_ui_assets/services/activity.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_64")
        .get("/opssuite/common_ui_assets/lib/knockout/knockout.mapping.min.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_65")
        .get("/opssuite/common_ui_assets/extensions/validation.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_66")
        .get("/opssuite/common_ui_assets/services/janitor.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_67")
        .get("/opssuite/common_ui_assets/lib/org/cometd.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_68")
        .get("/opssuite/common_ui_assets/lib/knockout/knockout.validation.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_69")
        .get("/opssuite/common_ui_assets/lib/require/text.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_70")
        .get("/opssuite/common_ui_assets/shell/shell.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_71")
        .get("/opssuite/userDetails/getUserDetails?_=${epochTime}")
        .headers(headers_99),
      http("01_05_ACS_ClickMainGear_ExtraRequests_72")
        .get("/opssuite/timezone/getUserStationTZ?_=${epochTime}")
        .headers(headers_99),
      http("01_05_ACS_ClickMainGear_ExtraRequests_73")
        .get("/opssuite/timezone/getAllOperationalStationsTz?_=${epochTime}")
        .headers(headers_99),
      http("01_05_ACS_ClickMainGear_ExtraRequests_74")
        .get("/opssuite/toggle/toggles?_=${epochTime}")
        .headers(headers_99),
      http("01_05_ACS_ClickMainGear_ExtraRequests_75")
        .get("/opssuite/apps/getAll?log=true&_=${epochTime}")
        .headers(headers_99),
      http("01_05_ACS_ClickMainGear_ExtraRequests_76")
        .get("/opssuite/common_ui_assets/modules/userPreferences/userPreferences.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_77")
        .get("/opssuite/common_ui_assets/modules/userPreferences/userPreferencesData.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_78")
        .get("/opssuite/common_ui_assets/services/cache.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_79")
        .get("/opssuite/data/station/getAircraftTypes?_=${epochTime}")
        .headers(headers_99),
      http("01_05_ACS_ClickMainGear_ExtraRequests_80")
        .get("/opssuite/permissions/retrieveUserDetails?_=${epochTime}")
        .headers(headers_99),
      http("01_05_ACS_ClickMainGear_ExtraRequests_81")
        .get("/opssuite/common_ui_assets/shell/shell_head.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_82")
        .get("/opssuite/common_ui_assets/lib/durandal/js/transitions/entrance.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_83")
        .get("/opssuite/common_ui_assets/widgets/checkboxSwitch/viewmodel.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_84")
        .get("/opssuite/common_ui_assets/modules/notificationsList/notificationsList.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_85")
        .get("/opssuite/common_ui_assets/icons/gear_airplane.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_86")
        .get("/opssuite/common_ui_assets/widgets/stationSelector/viewmodel.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_87")
        .get("/opssuite/common_ui_assets/widgets/flyout/viewmodel.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_88")
        .get("/opssuite/common_ui_assets/modules/trayContainer/trayContainer.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_89")
        .get("/opssuite/common_ui_assets/modules/userPreferences/userPreferences.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_90")
        .get("/opssuite/common_ui_assets/lib/knockout/customBindings.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_91")
        .get("/opssuite/common_ui_assets/modules/notificationsList/notificationsListData.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_92")
        .get("/opssuite/common_ui_assets/modules/notificationsList/desktopNotifications.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_93")
        .get("/opssuite/common_ui_assets/models/viewModel.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_94")
        .get("/opssuite/common_ui_assets/widgets/flyout/flyoutPositionRight.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_95")
        .get("/opssuite/common_ui_assets/widgets/flyout/flyoutPositionBottom.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_96")
        .get("/opssuite/common_ui_assets/widgets/flyout/flyoutMouseEvent.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_97")
        .get("/opssuite/common_ui_assets/widgets/flyout/flyoutPositionClick.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_98")
        .get("/opssuite/common_ui_assets/widgets/flyout/flyoutPositionTimeline.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_99")
        .get("/opssuite/common_ui_assets/widgets/flyout/flyoutFocus.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_100")
        .get("/opssuite/common_ui_assets/services/permissions.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_101")
        .get("/opssuite/common_ui_assets/modules/trayContainer/ecblsReport.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_102")
        .get("/opssuite/common_ui_assets/modules/trayContainer/trayContainerData.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_103")
        .get("/opssuite/common_ui_assets/services/notification.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_104")
        .get("/opssuite/common_ui_assets/opssuite_react_components/assets/fonts/opensans-semibold-webfont.woff")
        .headers(headers_372),
      http("01_05_ACS_ClickMainGear_ExtraRequests_105")
        .get("/opssuite/common_ui_assets/opssuite_react_components/assets/fonts/opensans-regular-webfont.woff")
        .headers(headers_372),
      http("01_05_ACS_ClickMainGear_ExtraRequests_106")
        .get("/opssuite/common_ui_assets/opssuite_react_components/assets/fonts/ocl-icon.woff")
        .headers(headers_372),
      http("01_05_ACS_ClickMainGear_ExtraRequests_107")
        .get("/opssuite/common_ui_assets/widgets/checkboxSwitch/view.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_108")
        .get("/opssuite/common_ui_assets/opssuite_react_components/assets/fonts/opensans-bold-webfont.woff")
        .headers(headers_372),
      http("01_05_ACS_ClickMainGear_ExtraRequests_109")
        .get("/opssuite/common_ui_assets/lib/swa/Collapsible.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_110")
        .get("/opssuite/common_ui_assets/lib/swa/Tabs.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_111")
        .get("/opssuite/common_ui_assets/lib/swa/Dropdown.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_112")
        .get("/opssuite/common_ui_assets/lib/swa/Split.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_113")
        .get("/opssuite/common_ui_assets/lib/swa/FancyRadio.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_114")
        .get("/opssuite/common_ui_assets/lib/moment/moment-timezone.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_115")
        .get("/opssuite/common_ui_assets/lib/jquery/jquery.shim.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_116")
        .get("/opssuite/common_ui_assets/lib/jquery/jqueryui.timepicker.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_117")
        .get("/opssuite/common_ui_assets/widget/SelectorWidget/selector.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_118")
        .get("/opssuite/common_ui_assets/lib/d3/d3.amd.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_119")
        .get("/opssuite/common_ui_assets/services/time.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_120")
        .get("/opssuite/common_ui_assets/components/dropdown.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_121")
        .get("/opssuite/common_ui_assets/components/radio.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_122")
        .get("/opssuite/common_ui_assets/lib/moment/moment-duration-format.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_123")
        .get("/opssuite/common_ui_assets/lib/mousetrap/mousetrap.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_124")
        .get("/opssuite/common_ui_assets/services/route_observer.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_125")
        .get("/opssuite/common_ui_assets/extensions/lodash4.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_126")
        .get("/opssuite/common_ui_assets/lib/pnotify/pnotify.core.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_127")
        .get("/opssuite/common_ui_assets/services/service_interface.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_128")
        .get("/opssuite/common_ui_assets/lib/jquery/jquery.actual.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_129")
        .get("/opssuite/common_ui_assets/widget/SelectorWidget/templates/stationSelector.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_130")
        .get("/opssuite/common_ui_assets/lib/d3/d3.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_131")
        .get("/opssuite/common_ui_assets/lib/moment/moment-timezone-data.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_132")
        .get("/opssuite/common_ui_assets/lib/pdfmake/pdfmake.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_133")
        .get("/opssuite/common_ui_assets/lib/jquery/chosen.jquery.min.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_134")
        .get("/opssuite/common_ui_assets/lib/jquery/jqueryui.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_135")
        .get("/opssuite/common_ui_assets/lib/jquery/jquery.tooltipster.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_136")
        .get("/opssuite/common_ui_assets/lib/jquery/jquery.terminal.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_137")
        .get("/opssuite/common_ui_assets/lib/lodash/lodashjs.4.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_138")
        .get("/opssuite/common_ui_assets/lib/pdfmake/vfs_fonts.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_139")
        .get("/opssuite/common_ui_assets/widgets/flyout/view.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_140")
        .get("/opssuite/common_ui_assets/modules/clock/clock.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_141")
        .get("/opssuite/common_ui_assets/modules/clock/timeZonePopup.js?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_142")
        .get("/opssuite/common_ui_assets/widgets/stationSelector/view.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_143")
        .get("/opssuite/common_ui_assets/modules/notificationsList/notificationsList.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_144")
        .get("/opssuite/common_ui_assets/modules/trayContainer/trayContainer.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_145")
        .get("/opssuite/common_ui_assets/modules/clock/clock.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_146")
        .get("/opssuite/common_ui_assets/modules/clock/timeZonePopup.html?v=${version}&b=${buildtime}"),
      http("01_05_ACS_ClickMainGear_ExtraRequests_147")
        .get("/opssuite/userDetails/getPermissions?_=${epochTime}")
        .headers(headers_99),
      http("01_05_ACS_ClickMainGear_ExtraRequests_148")
        .get("/opssuite/getFilter?_=${epochTime}")
        .headers(headers_180),
      http("01_05_ACS_ClickMainGear_ExtraRequests_149")
        .get("/opssuite/data/station/getSwaStations?_=${epochTime}")
        .headers(headers_180),
      http("01_05_ACS_ClickMainGear_ExtraRequests_150")
        .get("/opssuite/sodSector/getList?_=${epochTime}")
        .headers(headers_180),
      http("01_05_ACS_ClickMainGear_ExtraRequests_151")
        .get("/opssuite/helpDocument/getUploadPdf?_=${epochTime}")
        .headers(headers_99),
      http("01_05_ACS_ClickMainGear_ExtraRequests_152")
        .get("/opssuite/notification?_=${epochTime}")
        .headers(headers_180)))
    .pause(5)
  exec(http("01_05_ACS_Logout_Main")
    .get("/opssuite/logout?log=true")
    .headers(headers_192)
    .resources(http("01_05_ACS_Logout_ExtraRequests_01")
      .get(uri1 + "/oauth2/Themes/2016%20Light/app.min.js")
      .headers(headers_3),
      http("01_05_ACS_Logout_ExtraRequests_02")
        .get(uri1 + "/oauth2/Themes/2016%20Light/theme.js")
        .headers(headers_3),
      http("01_05_ACS_Logout_ExtraRequests_03")
        .get(uri1 + "/oauth2/Themes/2016%20Light/views/UserIDView/UserIDView.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_04")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/userIdLabel/userIdLabel.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_05")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/logo/logo.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_06")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/pageHeader/pageHeader.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_07")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/passValidMethod/passValidMethod.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_08")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/passExpire/passExpire.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_09")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userIdHeader/userIdHeader.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_10")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userActivexMessage/userActivexMessage.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_11")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/publicPrivateMode/publicPrivateMode.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_12")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/authMethod/authMethod.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_13")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userExpired/userExpired.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_14")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userSocialLogin/userSocialLogin.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_15")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userIdButton/userIdButton.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_16")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIdView/userViewMessage/userViewMessage.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_17")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/forgotUsernameLink/forgotUsernameLink.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_18")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/forgotPasswordLink/forgotPasswordLink.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_19")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/restartLoginLink/restartLoginLink.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_20")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/copyrightText/copyrightText.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_20")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/eulaLink/eulaLink.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_21")
        .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/disclaimerText/disclaimerText.html")
        .headers(headers_7),
      http("01_05_ACS_Logout_ExtraRequests_22")
        .get(uri1 + "/images/Max6.jpg")
        .headers(headers_5)))



  setUp(acs_main.inject(rampUsers(5)during(1 minutes))).protocols(httpProtocol)

}
