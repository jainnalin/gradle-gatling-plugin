

import java.io.File
import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Calendar

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.core.structure.{ChainBuilder, ScenarioBuilder}

class CWAIF_2 extends Simulation {

  val httpProtocol = http
    .baseUrl("https://www.qa1.swacrewqa.com")
    .inferHtmlResources()

  val csvFeeder = csv("data/IFData.csv").circular
  val epochTime = scenario("acschrome")
  val starttime = System.currentTimeMillis()
  val currdate = new SimpleDateFormat("yyyy-MM-dd")

  val headers_0 = Map(
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_1 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_2 = Map(
    "Origin" -> "https://www.qa1.swacrewqa.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_6 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_9 = Map(
    "Accept" -> "text/plain",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Content-Type" -> "text/plain",
    "Origin" -> "https://www.qa1.swacrewqa.com",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-site",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_10 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-site",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_11 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_12 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "style",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_13 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_16 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_18 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "origin" -> "https://eua-crew-cwa-cs.qa1.swacrewqa.com",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_38 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Origin" -> "https://eua-crew-cwa-cs.qa1.swacrewqa.com",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_41 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "cache-control" -> "max-age=0",
    "if-modified-since" -> "Thu, 20 Aug 2020 13:00:59 GMT",
    "if-none-match" -> """W/"5f3e740b-3bd"""",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-site",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_50 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_51 = Map(
    "Accept" -> "text/html,application/json;charset=ISO-8859-1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36",
    "x-swa-crew-auth" -> "ZTkzMzEzOkJMdEw1Wmdma0VNRTdpeA==",
    "x-swa-x" -> "")

  val headers_52 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_57 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "frame",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_86 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "iframe",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_88 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val uri1 = "https://eua-crew-cwa-cs.qa.swalife.com"
  val uri3 = "https://eua-crew-cwa-cs.qa1.swacrewqa.com"

  val scn = scenario("CWAIF")
    .exec(flushSessionCookies)
    .exec(flushCookieJar)
    .exec(flushHttpCache)
    .exec(_.set("currdate", currdate.format(Calendar.getInstance().getTime())))
    .exec(_.set("epochTime", System.currentTimeMillis / 1000))
    .feed(csvFeeder)
    .exec(http("CWA_IF_CrewBoard_HTML_00_LaunchSecureAuth_Portal")
      .get("/perf1-cmn/portal")
      .headers(headers_0)
      .resources(http("request_1")
        .get("/perf1-cmn/portal/styles.5c441b2c22d8b4c3ab8f.css")
        .headers(headers_1),
        http("request_2")
          .get("/perf1-cmn/portal/runtime-es2015.5cb8ab629be282d7f547.js")
          .headers(headers_2),
        http("request_3")
          .get("/perf1-cmn/portal/polyfills-es2015.cce353c0eeadea917c1c.js")
          .headers(headers_2),
        http("request_4")
          .get("/perf1-cmn/portal/OpenSans-Regular.d7fd16fb1b376bec4944.woff?v=1.1.17")
          .headers(headers_2),
        http("request_5")
          .get("/perf1-cmn/portal/main-es2015.fbf0cf192874530b6294.js")
          .headers(headers_2),
        http("request_6")
          .get("/perf1-cmn/portal/assets/json/runtime.json")
          .headers(headers_6),
        http("request_7")
          .get("/perf1-cmn/portal/favicon.ico")
          .headers(headers_1),
        http("request_8")
          .get("/perf1-cmn/portal/favicon.ico")
          .headers(headers_1),
        http("request_9")
          .get(uri3 + "/oauth2/userInfo")
          .headers(headers_9)
          .check(status.is(400)),
        http("CWA_IF_CrewBoard_HTML_00_LaunchSecureAuth_Portal_EUA_Portal")
          .get(uri3 + "/auth?callback=https://www.qa1.swacrewqa.com/perf1-cmn/portal")
          //.check(css("#__VIEWSTATEGENERATOR", "value").saveAs("ViewStateGen"))
          // .check(css("#__VIEWSTATE", "value").saveAs("ViewState"))
          // .check(css("#hiddenToken", "value").saveAs("hidtoken"))
          //  .check(css("#hiddenServerTime", "value").saveAs("hidServerTime"))
          //.check(regex("client_id=(.*)\" id=").saveAs("clientid"))
          // .check(regex(""version=(.*)\"" />").saveAs("versionid"))
          .headers(headers_10),
        http("request_11")
          .get(uri3 + "/assets/app/scripts/swacrew-common.js")
          .headers(headers_11),
        http("request_12")
          .get(uri1 + "/oauth2/assets/vendors/bootstrap-sass/assets/stylesheets/bootstrap.css")
         // .check(regex("version=(.*)\" />").saveAs("versionid"))
          .headers(headers_12),
        http("request_13")
          .get(uri1 + "/oauth2/WebResource.axd?d=4xrQC_NZncspxebrSEykmTP7ZwRQqlSpB-NxX4Al2kipOGfuWlsOMg6-E6OS7J7NDy3uySclXjikLCh3VcN0CQPg3SuQrUbTgE5DQVqxJOHGJ0qUzfCZlWe-h954e41YkR1oSw2&t=636682175540000000")
          .headers(headers_13),
        http("request_14")
          .get(uri1 + "/oauth2/Themes/2016%20Light/MFAStyleSheet.css?version=${versionid}")
          .headers(headers_12),
        http("request_15")
          .get(uri1 + "/oauth2/Themes/2016%20Light/theme.js")
          .headers(headers_13),
        http("request_16")
          .get(uri1 + "/Images/swa_logo_light.png")
          .headers(headers_16),
        http("request_17")
          .get(uri1 + "/oauth2/Themes/2016%20Light/app.min.js")
          .headers(headers_13),
        http("request_18")
          .get(uri1 + "/oauth2/Themes/2016%20Light/views/UserIDView/UserIDView.html")
          .headers(headers_18),
        http("request_19")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/userIdLabel/userIdLabel.html")
          .headers(headers_18),
        http("request_20")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/passValidMethod/passValidMethod.html")
          .headers(headers_18),
        http("request_21")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/logo/logo.html")
          .headers(headers_18),
        http("request_22")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/pageHeader/pageHeader.html")
          .headers(headers_18),
        http("request_23")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userIdHeader/userIdHeader.html")
          .headers(headers_18),
        http("request_24")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/passExpire/passExpire.html")
          .headers(headers_18),
        http("request_25")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userActivexMessage/userActivexMessage.html")
          .headers(headers_18),
        http("request_26")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/authMethod/authMethod.html")
          .headers(headers_18),
        http("request_27")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userSocialLogin/userSocialLogin.html")
          .headers(headers_18),
        http("request_28")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/publicPrivateMode/publicPrivateMode.html")
          .headers(headers_18),
        http("request_29")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIdView/userViewMessage/userViewMessage.html")
          .headers(headers_18),
        http("request_30")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userExpired/userExpired.html")
          .headers(headers_18),
        http("request_31")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userIdButton/userIdButton.html")
          .headers(headers_18),
        http("request_32")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/forgotPasswordLink/forgotPasswordLink.html")
          .headers(headers_18),
        http("request_33")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/forgotUsernameLink/forgotUsernameLink.html")
          .headers(headers_18),
        http("request_34")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/copyrightText/copyrightText.html")
          .headers(headers_18),
        http("request_35")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/disclaimerText/disclaimerText.html")
          .headers(headers_18),
        http("request_36")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/eulaLink/eulaLink.html")
          .headers(headers_18),
        http("request_37")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/restartLoginLink/restartLoginLink.html")
          .headers(headers_18)))
    .pause(3)
   /* .exec(http("CWA_IF_CrewBoard_HTML_01_CWA_Login")
      .post(uri3 + "/oauth2/SecureAuth.aspx?response_type=code&client_id=2f6412d5fbd64f88b9b036d26926ad8c&redirect_uri=com.southwest.aws.eua%3a%2foauth2%2fidpresponse&scope=openid+profile+email&state=eyJjYWxsYmFjayI6Imh0dHBzOi8vd3d3LnFhMS5zd2FjcmV3cWEuY29tL3BlcmYxLWNtbi9wb3J0YWwiLCJjb2RlX3ZlcmlmaWVyIjoiZ2tGWU5ldmdHQUYuSFp6ZVlHR2M1c2pER1h5VVZYU3ozX3ZJUmxMLU05dXA2TFMyX2MyQmFFN0xCWVZYaHJ0NWpFQy5MU3dQY1B4X1FDUTdYeWFHa09OODlnMl9YZDBtIiwibm9uY2UiOiI2ZWY5MzQxNy1lZjUzLTQ4MjUtN2ZlNi1jMDYyOTk0ZjgyNmMiLCJzZXJ2aWNlIjoieGxxZXVhLWNyZXctY3dhLWNzIiwidGltZSI6MTU5NzkzNzI0M30&nonce=6ef93417-ef53-4825-7fe6-c062994f826c&code_challenge=Dwj2-FDrOWKXYwtz3PKUIOidgE6hYx6RDMaJgvpPMfY&code_challenge_method=S256")
      .headers(headers_38)
      .formParam("__VIEWSTATE", "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")
      .formParam("__VIEWSTATEGENERATOR", "414F924E")
      .formParam("__VIEWSTATEENCRYPTED", "")
      .formParam("ctl00$ContentPlaceHolder1$hiddenjreversion", "")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$hiddenToken", "C141529AEEA5D44F")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$hiddenRet", "")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$hiddenServerTime", "Thursday, August 20, 2020 3:27:23 PM")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$hiddenLocalTime", "")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$ContentPlaceHolder1_MFALoginControl1_UserIDView_txtUserid", "${UserID}")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$ContentPlaceHolder1_MFALoginControl1_UserIDView_tbxPassword", "${Password}")
      .formParam("ctl00$ContentPlaceHolder1$MFALoginControl1$UserIDView$ctl00$ContentPlaceHolder1_MFALoginControl1_UserIDView_btnSubmit", "Submit")
      .resources(http("request_39")
        .get("/perf1-cmn/portal/runtime-es2015.5cb8ab629be282d7f547.js")
        .headers(headers_2),
        http("request_40")
          .get("/perf1-cmn/portal/polyfills-es2015.cce353c0eeadea917c1c.js")
          .headers(headers_2),
        http("request_41")
          .get("/perf1-cmn/portal")
          .headers(headers_41),
        http("request_42")
          .get("/perf1-cmn/portal/OpenSans-Regular.d7fd16fb1b376bec4944.woff?v=1.1.17")
          .headers(headers_2),
        http("request_43")
          .get("/perf1-cmn/portal/main-es2015.fbf0cf192874530b6294.js")
          .headers(headers_2),
        http("request_44")
          .get("/perf1-cmn/portal/assets/json/runtime.json")
          .headers(headers_6),
        http("request_45")
          .get("/perf1-cmn/portal/favicon.ico")
          .headers(headers_1),
        http("request_46")
          .get("/perf1-cmn/portal/favicon.ico")
          .headers(headers_1),
        http("request_47")
          .get(uri3 + "/oauth2/userInfo")
          .headers(headers_9),
        http("request_48")
          .get("/perf1-cmn/portal/cl-icons.deea406e7b41a20487b8.woff?v=1.1.17")
          .headers(headers_2),
        http("request_49")
          .get("/perf1-cmn/portal/favicon.ico")
          .headers(headers_1),
        http("request_50")
          .get("/perf1-cmn/approle-mappings/current-user")
          .headers(headers_50)))
    .pause(26)
    .exec(http("CWA_IF_CrewBoard_HTML_02_SecondaryLogin_LaunchCWA")
      .get("/perf1-if/CSSWebClient/health_check.html")
      .headers(headers_51)
      .resources(http("request_52")
        .get("/perf1-if/CSSWebClient/eipSessionJsp/EipFrameset.jsp?eipFrameUrl=../login.do?isPortal=truehome&role=crew&uid=${UserID}")
        .headers(headers_52),
        http("request_53")
          .get("/perf1-if/CSSWebClient/eipPortletStyles/swalife.css")
          .headers(headers_1),
        http("request_54")
          .get("/perf1-if/CSSWebClient/eipCommonJavaScript/eipGeneralFunctions.js")
          .headers(headers_1),
        http("request_55")
          .get("/perf1-if/CSSWebClient/res/script/jquery-1.3.2.min.js")
          .headers(headers_1),
        http("request_56")
          .get("/perf1-if/CSSWebClient/eipPortletStyles/swalifePrint.css")
          .headers(headers_1),
        http("request_57")
          .get("/perf1-if/CSSWebClient/eipSessionJsp/EipFrameTimer.jsp")
          .headers(headers_57),
        http("request_58")
          .get("/perf1-if/CSSWebClient/eipPortletStyles/swalife.css")
          .headers(headers_1),
        http("request_59")
          .get("/perf1-if/CSSWebClient/eipCommonJavaScript/eipGeneralFunctions.js")
          .headers(headers_1),
        http("request_60")
          .get("/perf1-if/CSSWebClient/eipPortletStyles/swalifePrint.css")
          .headers(headers_1),
        http("request_61")
          .get("/perf1-if/CSSWebClient/eipPortletStyles/swalife.css")
          .headers(headers_1),
        http("request_62")
          .get("/perf1-if/CSSWebClient/eipCommonJavaScript/eipGeneralFunctions.js")
          .headers(headers_1),
        http("request_63")
          .get("/perf1-if/CSSWebClient/res/script/jquery-1.3.2.min.js")
          .headers(headers_1),
        http("request_64")
          .get("/perf1-if/CSSWebClient/res/script/tingle.min.js")
          .headers(headers_1),
        http("request_65")
          .get("/perf1-if/CSSWebClient/eipPortletStyles/swalifePrint.css")
          .headers(headers_1),
        http("request_66")
          .get("/perf1-if/CSSWebClient/res/style/tingle.css")
          .headers(headers_1),
        http("request_67")
          .get("/perf1-if/CSSWebClient/res/style/common.css")
          .headers(headers_1),
        http("request_68")
          .get("/perf1-if/CSSWebClient/res/style/menu.css")
          .headers(headers_1),
        http("request_69")
          .get("/perf1-if/CSSWebClient/res/style/ttga.css")
          .headers(headers_1),
        http("request_70")
          .get("/perf1-if/CSSWebClient/res/script/ttga.js?version=4")
          .headers(headers_1),
        http("request_71")
          .get("/perf1-if/CSSWebClient/res/style/print.css")
          .headers(headers_1),
        http("request_72")
          .get("/perf1-if/CSSWebClient/res/script/menu.js")
          .headers(headers_1),
        http("request_73")
          .get("/perf1-if/CSSWebClient/res/script/common.js")
          .headers(headers_1),
        http("request_74")
          .get("/perf1-if/CSSWebClient/login.do?isPortal=truehome&uid=${UserID}&role=crew")
          .headers(headers_57),
        http("request_75")
          .get("/perf1-if/CSSWebClient/res/images/dropdown.gif")
          .headers(headers_1),
        http("request_76")
          .get("/perf1-if/CSSWebClient/res/images/tripleheart.gif")
          .headers(headers_1),
        http("request_77")
          .get("/perf1-if/CSSWebClient/res/images/heart/heart_anim.gif")
          .headers(headers_1),
        http("request_78")
          .get("/perf1-if/CSSWebClient/res/images/empty.gif")
          .headers(headers_1),
        http("request_79")
          .get("/perf1-if/CSSWebClient/res/images/menucheck.gif")
          .headers(headers_1),
        http("request_80")
          .get("/perf1-if/CSSWebClient/res/images/MTO_LWU_Legality_green.png")
          .headers(headers_1),
        http("request_81")
          .get("/perf1-if/CSSWebClient/res/images/boardIcon.png")
          .headers(headers_1),
        http("request_82")
          .get("/perf1-if/CSSWebClient/res/images/tripIcon_disabled.png")
          .headers(headers_1),
        http("request_83")
          .get("/perf1-if/CSSWebClient/res/images/ttga/delete_disabled.png")
          .headers(headers_1),
        http("request_84")
          .get("/perf1-if/CSSWebClient/res/images/heart.gif")
          .headers(headers_1),
        http("request_85")
          .get("/perf1-if/CSSWebClient/res/images/logo-white.svg")
          .headers(headers_1),
        http("request_86")
          .get("/perf1-if/CSSWebClient/pages/common/openWindowDomain.jsp")
          .headers(headers_86),
        http("request_87")
          .get("/perf1-if/CSSWebClient/res/images/bargradient.png")
          .headers(headers_1),
        http("request_88")
          .get("/favicon.ico")
          .headers(headers_88)
          .check(status.is(403))))
    .pause(4)
    .exec(http("CWA_IF_CrewBoard_HTML_06_Logout")
      .get("/perf1-if/CSSWebClient/endSession.jsp")
      .headers(headers_52)
      .resources(http("request_90")
        .get("/perf1-cmn/portal/styles.5c441b2c22d8b4c3ab8f.css")
        .headers(headers_1),
        http("request_91")
          .get("/perf1-cmn/portal/runtime-es2015.5cb8ab629be282d7f547.js")
          .headers(headers_2),
        http("request_92")
          .get("/perf1-cmn/portal/polyfills-es2015.cce353c0eeadea917c1c.js")
          .headers(headers_2),
        http("request_93")
          .get("/perf1-cmn/portal/OpenSans-Regular.d7fd16fb1b376bec4944.woff?v=1.1.17")
          .headers(headers_2),
        http("request_94")
          .get("/perf1-cmn/portal/cl-icons.deea406e7b41a20487b8.woff?v=1.1.17")
          .headers(headers_2),
        http("request_95")
          .get("/perf1-cmn/portal/main-es2015.fbf0cf192874530b6294.js")
          .headers(headers_2),
        http("request_96")
          .get("/perf1-cmn/portal/assets/json/runtime.json")
          .headers(headers_6),
        http("request_97")
          .get("/perf1-cmn/portal/favicon.ico")
          .headers(headers_1),
        http("request_98")
          .get("/perf1-cmn/portal/favicon.ico")
          .headers(headers_1),
        http("request_99")
          .get("/perf1-cmn/approle-mappings/current-user")
          .headers(headers_50),
        http("request_100")
          .get("/perf1-cmn/portal/favicon.ico")
          .headers(headers_1),
        http("request_101")
          .get(uri3 + "/oauth2/invalidate?callback=https://www.qa1.swacrewqa.com/perf1-cmn/portal")
          .headers(headers_10),
        http("request_102")
          .get("/perf1-cmn/portal/styles.5c441b2c22d8b4c3ab8f.css")
          .headers(headers_1),
        http("request_103")
          .get("/perf1-cmn/portal/runtime-es2015.5cb8ab629be282d7f547.js")
          .headers(headers_2),
        http("request_104")
          .get("/perf1-cmn/portal/polyfills-es2015.cce353c0eeadea917c1c.js")
          .headers(headers_2),
        http("request_105")
          .get("/perf1-cmn/portal/main-es2015.fbf0cf192874530b6294.js")
          .headers(headers_2),
        http("request_106")
          .get("/perf1-cmn/portal/OpenSans-Regular.d7fd16fb1b376bec4944.woff?v=1.1.17"),
        http("request_107")
          .get("/perf1-cmn/portal/cl-icons.deea406e7b41a20487b8.woff?v=1.1.17"),
        http("request_108")
          .get("/perf1-cmn/portal/assets/json/runtime.json")
          .headers(headers_6),
        http("request_109")
          .get("/perf1-cmn/portal/favicon.ico")
          .headers(headers_1),
        http("request_110")
          .get("/perf1-cmn/portal/favicon.ico")
          .headers(headers_1),
        http("request_111")
          .get(uri3 + "/oauth2/userInfo")
          .headers(headers_9)
          .check(status.is(400)),
        http("request_112")
          .get(uri3 + "/auth?callback=https://www.qa1.swacrewqa.com/perf1-cmn/portal")
          .headers(headers_10),
        http("request_113")
          .get(uri1 + "/oauth2/Themes/2016%20Light/MFAStyleSheet.css?version=9.2.0.85")
          .headers(headers_12),
        http("request_114")
          .get(uri1 + "/oauth2/assets/vendors/bootstrap-sass/assets/stylesheets/bootstrap.css")
          .headers(headers_12),
        http("request_115")
          .get(uri1 + "/oauth2/WebResource.axd?d=4xrQC_NZncspxebrSEykmTP7ZwRQqlSpB-NxX4Al2kipOGfuWlsOMg6-E6OS7J7NDy3uySclXjikLCh3VcN0CQPg3SuQrUbTgE5DQVqxJOHGJ0qUzfCZlWe-h954e41YkR1oSw2&t=636682175540000000")
          .headers(headers_13),
        http("request_116")
          .get(uri1 + "/oauth2/Themes/2016%20Light/app.min.js")
          .headers(headers_13),
        http("request_117")
          .get(uri1 + "/oauth2/Themes/2016%20Light/theme.js")
          .headers(headers_13),
        http("request_118")
          .get(uri1 + "/Images/swa_logo_light.png")
          .headers(headers_16),
        http("request_119")
          .get(uri3 + "/assets/app/scripts/swacrew-common.js")
          .headers(headers_11),
        http("request_120")
          .get(uri1 + "/oauth2/Themes/2016%20Light/views/UserIDView/UserIDView.html")
          .headers(headers_18),
        http("request_121")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/userIdLabel/userIdLabel.html")
          .headers(headers_18),
        http("request_122")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/pageHeader/pageHeader.html")
          .headers(headers_18),
        http("request_123")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/logo/logo.html")
          .headers(headers_18),
        http("request_124")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/passValidMethod/passValidMethod.html")
          .headers(headers_18),
        http("request_125")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/passExpire/passExpire.html")
          .headers(headers_18),
        http("request_126")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userIdHeader/userIdHeader.html")
          .headers(headers_18),
        http("request_127")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userActivexMessage/userActivexMessage.html")
          .headers(headers_18),
        http("request_128")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/publicPrivateMode/publicPrivateMode.html")
          .headers(headers_18),
        http("request_129")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/authMethod/authMethod.html")
          .headers(headers_18),
        http("request_130")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/restartLoginLink/restartLoginLink.html")
          .headers(headers_18),
        http("request_131")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/eulaLink/eulaLink.html")
          .headers(headers_18),
        http("request_132")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userExpired/userExpired.html")
          .headers(headers_18),
        http("request_133")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/disclaimerText/disclaimerText.html")
          .headers(headers_18),
        http("request_134")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/copyrightText/copyrightText.html")
          .headers(headers_18),
        http("request_135")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIdView/userViewMessage/userViewMessage.html")
          .headers(headers_18),
        http("request_136")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userSocialLogin/userSocialLogin.html")
          .headers(headers_18),
        http("request_137")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/UserIDView/userIdButton/userIdButton.html")
          .headers(headers_18),
        http("request_138")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/forgotUsernameLink/forgotUsernameLink.html")
          .headers(headers_18),
        http("request_139")
          .get(uri1 + "/oauth2/Themes/2016%20Light/directives/Common/forgotPasswordLink/forgotPasswordLink.html")
          .headers(headers_18)))*/

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
