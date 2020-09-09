
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SWADotCom extends Simulation {

  val httpProtocol = http
    .baseUrl("https://173e250c.akstat.io")
    .inferHtmlResources()
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.9")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

  val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "none",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val headers_1 = Map(
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_3 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "sec-fetch-dest" -> "style",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_15 = Map(
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_17 = Map(
    "accept" -> "application/json, text/javascript, */*; q=0.01",
    "authorization" -> "null null",
    "content-type" -> "application/json",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-api-idtoken" -> "null",
    "x-api-key" -> "l7xx944d175ea25f4b9c903a583ea82a1c4c",
    "x-app-id" -> "landing-home-page",
    "x-channel-id" -> "southwest",
    "x-user-experience-id" -> "174b4974-9e18-45e6-b542-dc8f67f9fe65")

  val headers_18 = Map(
    "accept" -> "application/json, text/javascript, */*; q=0.01",
    "authorization" -> "null null",
    "content-type" -> "application/json",
    "origin" -> "https://www.southwest.com",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-api-idtoken" -> "null",
    "x-api-key" -> "l7xx944d175ea25f4b9c903a583ea82a1c4c",
    "x-app-id" -> "landing-home-page",
    "x-channel-id" -> "southwest",
    "x-user-experience-id" -> "174b4974-9e18-45e6-b542-dc8f67f9fe65")

  val headers_19 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_22 = Map(
    "Content-Type" -> "application/x-www-form-urlencoded",
    "Origin" -> "https://www.southwest.com",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_24 = Map(
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_25 = Map(
    "origin" -> "https://www.southwest.com",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_27 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Sec-Fetch-Dest" -> "iframe",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "cross-site",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_28 = Map(
    "Origin" -> "https://www.southwest.com",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_29 = Map(
    "content-type" -> "application/x-www-form-urlencoded",
    "origin" -> "https://www.southwest.com",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-site")

  val headers_33 = Map(
    "origin" -> "https://www.southwest.com",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-site")

  val headers_46 = Map(
    "accept" -> "application/json, text/javascript, */*; q=0.01",
    "content-type" -> "application/json",
    "origin" -> "https://www.southwest.com",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-api-key" -> "l7xx944d175ea25f4b9c903a583ea82a1c4c",
    "x-app-id" -> "landing-home-page",
    "x-channel-id" -> "southwest",
    "x-user-experience-id" -> "174b4974-9e18-45e6-b542-dc8f67f9fe65")

  val headers_48 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_56 = Map(
    "origin" -> "https://www.southwest.com",
    "sec-fetch-dest" -> "font",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin")

  val headers_74 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_76 = Map(
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-site")

  val headers_89 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "sec-fetch-dest" -> "style",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_90 = Map(
    "origin" -> "https://www.booking.com",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_93 = Map(
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_94 = Map(
    "Origin" -> "https://www.southwest.com",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site")

  val uri01 = "https://swa-dc.zeronaught.com/dc"
  val uri02 = "https://southwestairlines.mpeasylink.com/mpel"
  val uri03 = "https://www.booking.com"
  val uri04 = "https://dpm.demdex.net"
  val uri05 = "https://content.zeronaught.com/js/southwest.js"
  val uri06 = "https://www.facebook.com/tr"
  val uri07 = "https://aff.bstatic.com/static/affiliate_base/js/booking_sp_widget.js"
  val uri08 = "https://s-a.innovid.com/conversion/1hk2j3"
  val uri09 = "https://swa.demdex.net/dest5.html"
  val uri10 = "https://rn9nhnpa.micpn.com/p/cp/-1/track.gif"
  val uri11 = "https://cm.everesttech.net/cm/dd"
  val uri12 = "https://r.turn.com/r/beacon"
  val uri13 = "https://s2.go-mpulse.net/boomerang/7WRRJ-SW4DM-BC2LK-ZQ8AG-3NJHN"
  val uri14 = "https://c.go-mpulse.net/api/config.json"
  val uri15 = "https://soptimize.southwest.com/m2/southwestairlines/mbox/json"
  val uri16 = "https://ag.innovid.com/retargeting/pixel"
  val uri18 = "https://servedby.flashtalking.com/spot/1/15214;112033;11638"
  val uri19 = "https://dc.ads.linkedin.com/collect"
  val uri20 = "https://smetrics.southwest.com"
  val uri21 = "https://rtd-tm.everesttech.net"
  val uri22 = "https://zn6fetw4rxykndjoz-southwest.siteintercept.qualtrics.com/WRSiteInterceptEngine"
  val uri23 = "https://www.southwest.com"
  val uri24 = "https://cf.bstatic.com/static"
  val uri25 = "https://d9.flashtalking.com/img/img.png"
  val uri26 = "https://siteintercept.qualtrics.com"

  val scn = scenario("SWADotCom")
    .exec(http("request_0")
      .get(uri23 + "/")
      .headers(headers_0)
      .resources(http("request_1")
        .get(uri23 + "/swa-resources/config/status.js")
        .headers(headers_1),
        http("request_2")
          .get(uri23 + "/swa-resources/scripts/analytics/analytics.js")
          .headers(headers_1),
        http("request_3")
          .get(uri23 + "/landing/home-page/assets/29.0.0-6/styles/app.css")
          .headers(headers_3),
        http("request_4")
          .get(uri23 + "/swa-resources/styles/landing-home-page-theme.css")
          .headers(headers_3),
        http("request_5")
          .get(uri23 + "/swa-resources/scripts/motion-point/mp_linkcode.js")
          .headers(headers_1),
        http("request_6")
          .get(uri23 + "/assets/app/scripts/swa-common.js")
          .headers(headers_1),
        http("request_7")
          .get(uri23 + "/landing/home-page/assets/29.0.0-6/scripts/en.js")
          .headers(headers_1),
        http("request_8")
          .get(uri23 + "/swa-ui/bootstrap/landing-home-page/1/i18n/en.js")
          .headers(headers_1),
        http("request_9")
          .get(uri23 + "/swa-ui/bootstrap/landing-home-page/1/content/en.js")
          .headers(headers_1),
        http("request_10")
          .get(uri23 + "/swa-ui/bootstrap/landing-home-page/1/data.js")
          .headers(headers_1),
        http("request_11")
          .get(uri23 + "/landing/home-page/assets/29.0.0-6/scripts/vendor.js")
          .headers(headers_1),
        http("request_12")
          .get(uri23 + "/landing/home-page/assets/29.0.0-6/scripts/app.js")
          .headers(headers_1),
        http("request_13")
          .get(uri23 + "/swa-resources/scripts/ads.js")
          .headers(headers_1),
        http("request_14")
          .get(uri23 + "/swa-resources/scripts/analytics//b52dfd6476cb/21df05686c51/0712c740c735/hostedLibFiles/EP308220a2a4c4403f97fc1960100db40f/AppMeasurement.min.js")
          .headers(headers_1),
        http("request_15")
          .get(uri05)
          .headers(headers_15),
        http("request_16")
          .get(uri13)
          .headers(headers_15),
        http("request_17")
          .get(uri23 + "/landing/home-page/version.json?application=landing-home-page&site=southwest&_=1598032212057")
          .headers(headers_17),
        http("request_18")
          .post(uri23 + "/api/landing-page/v1/landing-page/feature/uimetadata")
          .headers(headers_18)
          .body(RawFileBody("/swadotcom/0018_request.json")),
        http("request_19")
          .get(uri23 + "/swa-resources/images/globalnav/logos/swa_logo_dark.svg")
          .headers(headers_19),
        http("request_20")
          .get(uri23 + "/assets/images/globalnav/logos/swa_footer_logo_business_travel.svg")
          .headers(headers_19),
        http("request_21")
          .get(uri23 + "/assets/images/globalnav/logos/swa_footer_logo_swa_cargo.svg")
          .headers(headers_19),
        http("request_22")
          .get(uri04 + "/id?d_visid_ver=4.6.0&d_fieldgroup=MC&d_rtbd=json&d_ver=2&d_verify=1&d_orgid=65D316D751E563EC0A490D4C%40AdobeOrg&d_nsid=0&ts=1598032211638")
          .headers(headers_22),
        http("request_23")
          .get(uri04 + "/id/rd?d_visid_ver=4.6.0&d_fieldgroup=MC&d_rtbd=json&d_ver=2&d_verify=1&d_orgid=65D316D751E563EC0A490D4C%40AdobeOrg&d_nsid=0&ts=1598032211638")
          .headers(headers_22),
        http("request_24")
          .get(uri02 + "/mpel.js")
          .headers(headers_24),
        http("request_25")
          .get(uri01 + "?key=AIzaSyD6bEKLWVjAK0AlU_ubyD_mPZ58xFxmxlg&sc=AD5rJBJ0AQAA6_Cwu7ihreQ5q6B4kQd5pLA1JH0G6uYHuJBY6sn7f4NAIwkL%7C1%7C0%7C67b5f8d38821331134d6bc5826645e75fbf865e5&si=%7B%22ts%22%3A1598032212%2C%22p%22%3A1%2C%22v%22%3A%7B%22sq%22%3A101432801%7D%2C%22c%22%3A%7B%22tk%22%3A0%2C%22sc%22%3A0%7D%7D")
          .headers(headers_25),
        http("request_26")
          .get(uri23 + "/swa-resources/scripts/analytics//b52dfd6476cb/21df05686c51/0712c740c735/hostedLibFiles/EP308220a2a4c4403f97fc1960100db40f/AppMeasurement_Module_AudienceManagement.min.js")
          .headers(headers_1),
        http("request_27")
          .get(uri02 + "/mpel_storage.html?cmd=getpref&href=https%3A%2F%2Fwww.southwest.com%2F")
          .headers(headers_27),
        http("request_28")
          .get(uri14 + "?key=7WRRJ-SW4DM-BC2LK-ZQ8AG-3NJHN&d=www.southwest.com&t=5326774&v=1.632.0&sl=0&si=7wxkqaf0yyg-qffdjo&plugins=AK,ConfigOverride,Continuity,PageParams,IFrameDelay,AutoXHR,SPA,Angular,Backbone,Ember,History,RT,CrossDomain,BW,PaintTiming,NavigationTiming,ResourceTiming,Memory,CACHE_RELOAD,Errors,TPAnalytics,UserTiming,Akamai,LOGN&acao=&ak.ai=603494")
          .headers(headers_28),
        http("request_29")
          .get(uri20 + "/id?d_visid_ver=4.6.0&d_fieldgroup=MC&mcorgid=65D316D751E563EC0A490D4C%40AdobeOrg&ts=1598032213127")
          .headers(headers_29),
        http("request_30")
          .get(uri04 + "/id?d_visid_ver=4.6.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=65D316D751E563EC0A490D4C%40AdobeOrg&d_nsid=0&d_mid=74381651004597411201652656920552383315&ts=1598032213912")
          .headers(headers_22),
        http("request_31")
          .get(uri22 + "/?Q_ZID=ZN_6fEtw4RXYKndJOZ")
          .headers(headers_15),
        http("request_32")
          .post(uri26 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_6fEtw4RXYKndJOZ&Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch")
          .headers(headers_25)
          .formParam("Q_LOC", "https://www.southwest.com/"),
        http("request_33")
          .get(uri15 + "?mbox=globalNavRRPromo&mboxSession=8496c44d2678446c81e82580003462b7&mboxPC=&mboxPage=eafe9e8041d340d381c5ca91284c0ae0&mboxRid=5b67024822e9405686701d5990f78d30&mboxVersion=1.8.1&mboxCount=5&mboxTime=1598014212319&mboxHost=www.southwest.com&mboxURL=https%3A%2F%2Fwww.southwest.com%2F&mboxReferrer=&browserHeight=625&browserWidth=637&browserTimeOffset=-300&screenHeight=768&screenWidth=1366&colorDepth=24&devicePixelRatio=1&screenOrientation=landscape&webGLRenderer=ANGLE%20(Intel(R)%20UHD%20Graphics%20620%20Direct3D11%20vs_5_0%20ps_5_0)&appId=landing-home-page&lang=en&pageId=landing-home-page-index&site=southwest&offerId=&acquisitionSourceCodes=&inflight=false&mboxMCSDID=51C4956C5462CC3C-15632193F1FAE2DB&vst.trk=metrics.southwest.com&vst.trks=smetrics.southwest.com&mboxMCGVID=74381651004597411201652656920552383315")
          .headers(headers_33),
        http("request_34")
          .get(uri15 + "?mbox=landingHomePageIndexPromo2&mboxSession=8496c44d2678446c81e82580003462b7&mboxPC=&mboxPage=eafe9e8041d340d381c5ca91284c0ae0&mboxRid=79ce6584f8bf4e27aeb7dd69901898b0&mboxVersion=1.8.1&mboxCount=3&mboxTime=1598014212305&mboxHost=www.southwest.com&mboxURL=https%3A%2F%2Fwww.southwest.com%2F&mboxReferrer=&browserHeight=625&browserWidth=637&browserTimeOffset=-300&screenHeight=768&screenWidth=1366&colorDepth=24&devicePixelRatio=1&screenOrientation=landscape&webGLRenderer=ANGLE%20(Intel(R)%20UHD%20Graphics%20620%20Direct3D11%20vs_5_0%20ps_5_0)&appId=landing-home-page&lang=en&pageId=landing-home-page-index&site=southwest&offerId=&acquisitionSourceCodes=&inflight=false&mboxMCSDID=51C4956C5462CC3C-15632193F1FAE2DB&vst.trk=metrics.southwest.com&vst.trks=smetrics.southwest.com&mboxMCGVID=74381651004597411201652656920552383315")
          .headers(headers_33),
        http("request_35")
          .get(uri15 + "?mbox=landingHomePageIndexPoloroid3&mboxSession=8496c44d2678446c81e82580003462b7&mboxPC=&mboxPage=eafe9e8041d340d381c5ca91284c0ae0&mboxRid=85f7d741f7a040a1a056e29f42041108&mboxVersion=1.8.1&mboxCount=4&mboxTime=1598014212311&mboxHost=www.southwest.com&mboxURL=https%3A%2F%2Fwww.southwest.com%2F&mboxReferrer=&browserHeight=625&browserWidth=637&browserTimeOffset=-300&screenHeight=768&screenWidth=1366&colorDepth=24&devicePixelRatio=1&screenOrientation=landscape&webGLRenderer=ANGLE%20(Intel(R)%20UHD%20Graphics%20620%20Direct3D11%20vs_5_0%20ps_5_0)&appId=landing-home-page&lang=en&pageId=landing-home-page-index&site=southwest&offerId=&acquisitionSourceCodes=&inflight=false&mboxMCSDID=51C4956C5462CC3C-15632193F1FAE2DB&vst.trk=metrics.southwest.com&vst.trks=smetrics.southwest.com&mboxMCGVID=74381651004597411201652656920552383315")
          .headers(headers_33),
        http("request_36")
          .get(uri15 + "?mbox=landingHomePageIndexPromo1&mboxSession=8496c44d2678446c81e82580003462b7&mboxPC=&mboxPage=eafe9e8041d340d381c5ca91284c0ae0&mboxRid=47568bedeb104913830ed9602b043098&mboxVersion=1.8.1&mboxCount=2&mboxTime=1598014212297&mboxHost=www.southwest.com&mboxURL=https%3A%2F%2Fwww.southwest.com%2F&mboxReferrer=&browserHeight=625&browserWidth=637&browserTimeOffset=-300&screenHeight=768&screenWidth=1366&colorDepth=24&devicePixelRatio=1&screenOrientation=landscape&webGLRenderer=ANGLE%20(Intel(R)%20UHD%20Graphics%20620%20Direct3D11%20vs_5_0%20ps_5_0)&appId=landing-home-page&lang=en&pageId=landing-home-page-index&site=southwest&offerId=&acquisitionSourceCodes=&inflight=false&mboxMCSDID=51C4956C5462CC3C-15632193F1FAE2DB&vst.trk=metrics.southwest.com&vst.trks=smetrics.southwest.com&mboxMCGVID=74381651004597411201652656920552383315")
          .headers(headers_33),
        http("request_37")
          .get(uri15 + "?mbox=landingHomePageHpBanner&mboxSession=8496c44d2678446c81e82580003462b7&mboxPC=&mboxPage=eafe9e8041d340d381c5ca91284c0ae0&mboxRid=ee41ce1b91104efd800405519a2d2024&mboxVersion=1.8.1&mboxCount=6&mboxTime=1598014212326&mboxHost=www.southwest.com&mboxURL=https%3A%2F%2Fwww.southwest.com%2F&mboxReferrer=&browserHeight=625&browserWidth=637&browserTimeOffset=-300&screenHeight=768&screenWidth=1366&colorDepth=24&devicePixelRatio=1&screenOrientation=landscape&webGLRenderer=ANGLE%20(Intel(R)%20UHD%20Graphics%20620%20Direct3D11%20vs_5_0%20ps_5_0)&appId=landing-home-page&lang=en&pageId=landing-home-page-index&site=southwest&offerId=&acquisitionSourceCodes=&inflight=false&mboxMCSDID=51C4956C5462CC3C-15632193F1FAE2DB&vst.trk=metrics.southwest.com&vst.trks=smetrics.southwest.com&mboxMCGVID=74381651004597411201652656920552383315")
          .headers(headers_33),
        http("request_38")
          .get(uri15 + "?mbox=landingHomePageIndexHero&mboxSession=8496c44d2678446c81e82580003462b7&mboxPC=&mboxPage=eafe9e8041d340d381c5ca91284c0ae0&mboxRid=4a593b974a7045e4978b4afb54368a3b&mboxVersion=1.8.1&mboxCount=1&mboxTime=1598014212288&mboxHost=www.southwest.com&mboxURL=https%3A%2F%2Fwww.southwest.com%2F&mboxReferrer=&browserHeight=625&browserWidth=637&browserTimeOffset=-300&screenHeight=768&screenWidth=1366&colorDepth=24&devicePixelRatio=1&screenOrientation=landscape&webGLRenderer=ANGLE%20(Intel(R)%20UHD%20Graphics%20620%20Direct3D11%20vs_5_0%20ps_5_0)&appId=landing-home-page&lang=en&pageId=landing-home-page-index&site=southwest&offerId=&acquisitionSourceCodes=&inflight=false&mboxMCSDID=51C4956C5462CC3C-15632193F1FAE2DB&vst.trk=metrics.southwest.com&vst.trks=smetrics.southwest.com&mboxMCGVID=74381651004597411201652656920552383315")
          .headers(headers_33),
        http("request_39")
          .get(uri26 + "/dxjsmodule/CoreModule.js?Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch")
          .headers(headers_15),
        http("request_40")
          .get(uri09 + "?d_nsid=0")
          .headers(headers_27),
        http("request_41")
          .post(uri26 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_6fEtw4RXYKndJOZ&Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch&t=1598032214413&Q_VSI=%7B%22SI_bpguszrqF6sV6Cx%22%3A%22DependencyResolver%22%2C%22SI_5yVw4GOJpYx0RUx%22%3A%22AS_07676101%22%2C%22SI_9tPFEECbWLIkRs9%22%3A%22DependencyResolver%22%7D&Q_DPR=true")
          .headers(headers_25)
          .formParam("", "")
          .formParam("Q_INTER", "")
          .formParam("Q_RJS", "QID_66412229*:**|*QID_65043996*:**|*QID_02840331*:**|*QID_44014141*:**|*QID_27084086*:**|*QID_95645215*:**|*QID_06377160*:**|*QID_32421020*:**|*QID_88447204*:**|*QID_55427041*:**|*QID_88496318*:**|*QID_42238804*:**|*QID_67236702*:**|*QID_19203334*:**|*QID_34014346*:**|*QID_73234280*:**|*QID_34852476*:**|*QID_84462919*:**|*QID_69351013*:**|*QID_00169413*:*")
          .formParam("Q_ASC", "pageName*|*")
          .formParam("Q_LOC", "https://www.southwest.com/"),
        http("request_42")
          .get(uri26 + "/dxjsmodule/12.e6c6f9aa65272bcbcd07.chunk.js?Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=web")
          .headers(headers_15),
        http("request_43")
          .get(uri26 + "/dxjsmodule/1.fe6ee5251dbb499b909e.chunk.js?Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=web")
          .headers(headers_15),
        http("request_44")
          .get(uri26 + "/WRSiteInterceptEngine/Asset.php?Module=SI_5yVw4GOJpYx0RUx&Version=175&Q_ORIGIN=https://www.southwest.com&Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch")
          .headers(headers_25),
        http("request_45")
          .get(uri26 + "/dxjsmodule/FeedbackButtonModule.js?Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch")
          .headers(headers_15),
        http("request_46")
          .post(uri23 + "/api/content-delivery/v1/content-delivery/query/placements")
          .headers(headers_46)
          .body(RawFileBody("/swadotcom/0046_request.json")),
        http("request_47")
          .get(uri26 + "/WRSiteInterceptEngine/Asset.php?Module=CR_2gJhqDWQ54wnbM1&Version=35&Q_InterceptID=SI_5yVw4GOJpYx0RUx&Q_ORIGIN=https://www.southwest.com&Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch")
          .headers(headers_25),
        http("request_48")
          .get(uri11 + "?d_uuid=74539705151285133511632295078137012180")
          .headers(headers_48),
        http("request_49")
          .get(uri23 + "/swa-resources/images/heroes/hero_shots/rr-plus-card-contactless-angled.png")
          .headers(headers_19),
        http("request_50")
          .get(uri23 + "/swa-resources/images/heroes/hero_shots/swa-promise-logo-lockup-ffffff.svg")
          .headers(headers_19),
        http("request_51")
          .get(uri23 + "/swa-resources/images/promotions/2020-rr-chase-plus-contactless-md.png")
          .headers(headers_19),
        http("request_52")
          .get(uri04 + "/demconf.jpg?et:ibs%7cdata:dpid=411&dpuuid=X0AJVgAAAD7oKBhU")
          .headers(headers_48),
        http("request_53")
          .get(uri23 + "/swa-resources/images/polaroids/homepage/Hotel-2K-HpPolo1-img-20200811.png")
          .headers(headers_19),
        http("request_54")
          .get(uri23 + "/swa-resources/images/polaroids/homepage/HpPolo2-car-20200114-2.jpg")
          .headers(headers_19),
        http("request_55")
          .get(uri07 + "?checkin=2020-08-22&checkout=2020-08-25&iata_orr=1&iata=&lang=en_us")
          .headers(headers_24),
        http("request_56")
          .get(uri23 + "/swa-resources/fonts/SouthwestSans-Bold.otf")
          .headers(headers_56),
        http("request_57")
          .get(uri23 + "/swa-resources/fonts/SouthwestSans-Regular.otf")
          .headers(headers_56),
        http("request_58")
          .get(uri23 + "/swa-resources/images/heroes/hero_shots/HpHero-bg-chase-wave3-65k-bg.jpg")
          .headers(headers_19),
        http("request_59")
          .get(uri23 + "/swa-resources/images/polaroids/homepage/HpPolaroid1-swav-20200113.jpg")
          .headers(headers_19),
        http("request_60")
          .get(uri23 + "/swa-resources/images/icons/HpIcon1_WhyFly_190305.png")
          .headers(headers_19),
        http("request_61")
          .get(uri23 + "/swa-resources/images/icons/HpIcon2_EB.gif")
          .headers(headers_19),
        http("request_62")
          .get(uri23 + "/swa-resources/images/icons/HpIcon4_mobileapp.gif")
          .headers(headers_19),
        http("request_63")
          .get(uri23 + "/swa-resources/images/icons/HpIcon_SWABIZ.jpg")
          .headers(headers_19),
        http("request_64")
          .get(uri23 + "/swa-resources/scripts/analytics/b52dfd6476cb/21df05686c51/0712c740c735/RC8743edb48de34c9aa7a8307de3042208-source.min.js")
          .headers(headers_1),
        http("request_65")
          .get(uri23 + "/swa-resources/scripts/analytics/b52dfd6476cb/21df05686c51/0712c740c735/RCa611b4388c2141b8ba31249016bc5224-source.min.js")
          .headers(headers_1),
        http("request_66")
          .get(uri23 + "/swa-resources/scripts/analytics/b52dfd6476cb/21df05686c51/0712c740c735/RC920879d3e20e486c839507c1293cb626-source.min.js")
          .headers(headers_1),
        http("request_67")
          .get(uri23 + "/swa-resources/scripts/analytics/b52dfd6476cb/21df05686c51/0712c740c735/RC99d18622fc2344369d83972bbe6008d8-source.min.js")
          .headers(headers_1),
        http("request_68")
          .get(uri23 + "/swa-resources/scripts/analytics/b52dfd6476cb/21df05686c51/0712c740c735/RC7dd4d090a42743709b8f2f4830c23dc0-source.min.js")
          .headers(headers_1),
        http("request_69")
          .get(uri23 + "/swa-resources/scripts/analytics/b52dfd6476cb/21df05686c51/0712c740c735/RCb57a62ade1d94590be15da3b0302b549-source.min.js")
          .headers(headers_1),
        http("request_70")
          .get(uri23 + "/swa-resources/scripts/analytics/b52dfd6476cb/21df05686c51/0712c740c735/RC585f3ed37d2e4ba0a89f687ec475a842-source.min.js")
          .headers(headers_1),
        http("request_71")
          .get(uri23 + "/swa-resources/scripts/analytics/b52dfd6476cb/21df05686c51/0712c740c735/RC8fa92e829fde43799fc5c81d27c02f6d-source.min.js")
          .headers(headers_1),
        http("request_72")
          .get(uri23 + "/swa-resources/scripts/analytics/b52dfd6476cb/21df05686c51/0712c740c735/RCdeaea88888f7402cbb517598570ef6e6-source.min.js")
          .headers(headers_1),
        http("request_73")
          .get(uri23 + "/swa-resources/scripts/analytics/b52dfd6476cb/21df05686c51/0712c740c735/RCac95860521534775b751519eecde9e52-source.min.js")
          .headers(headers_1),
        http("request_74")
          .get(uri26 + "/WRQualtricsShared/Graphics/siteintercept/wr-dialog-close-btn-white.png")
          .headers(headers_74),
        http("request_75")
          .post(uri26 + "/WRSiteInterceptEngine/?Q_Impress=1&Q_CID=CR_2gJhqDWQ54wnbM1&Q_SIID=SI_5yVw4GOJpYx0RUx&Q_ASID=AS_07676101&Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch&r=1598032215794")
          .headers(headers_25),
        http("request_76")
          .get(uri20 + "/b/ss/swaprod/10/JS-2.20.0-LAUN/s53340002849699?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=21%2F7%2F2020%2012%3A50%3A15%205%20300&d.&nsid=0&jsonv=1&.d&sdid=51C4956C5462CC3C-15632193F1FAE2DB&mid=74381651004597411201652656920552383315&aamlh=7&ce=UTF-8&pageName=HP%3ASWA%3ASouthwest%20Homepage&g=https%3A%2F%2Fwww.southwest.com%2F&cc=USD&ch=HP&events=event136%3D1%2Cevent156%3D6&aamb=j8Odv6LonN4r3an7LhD3WZrU1bUpAkFkkiY1ncBR96t2PTI&c1=D%3Dv1&v1=FullSite&l1=3675062%3A4956042%3A4956042%3A3832104%3A4867152%3A4634105%3A4891036%3A4125032%3A4633127%3A4810032%3A3258043%3A3832102%3A4956042%3A4956042%3A4609032%3A4689037%3A4926060%3A4869152&c4=54&c5=cold&v5=000&v7=https%3A%2F%2Fwww.southwest.com%2F&c19=launch%7CSouthwest%20.com%20and%20swabiz%7Cproduction%7CMon%2C%2013%20Jul%202020%2016%3A28%3A29%20GMT&c25=D%3DpageName&v25=%7C%7C%7C%7C%7C%7C%7C%7C&c38=3675062%3A4956042%3A4956042%3A3832104%3A4867152%3A4634105%3A4891036%3A4125032%3A4633127%3A4810032%3A3258043%3A3832102%3A4956042%3A4956042%3A4609032%3A4689037%3A4926060%3A4869152&c50=HP%3ASWA&c55=D%3Dg&v55=D%3Dg&c56=en&c74=74381651004597411201652656920552383315&c75=FullSite&v190=default&s=1366x768&c=24&j=1.6&v=N&k=Y&bw=637&bh=625&mcorgid=65D316D751E563EC0A490D4C%40AdobeOrg&AQE=1")
          .headers(headers_76),
        http("request_77")
          .get(uri18 + "/?spotName=SOUTHWEST_2019_SWA_HOME_PAGE_LP&U13=74381651004597411201652656920552383315&cachebuster=8689774186491.987")
          .headers(headers_48),
        http("request_78")
          .get(uri19 + "/?pid=464562&conversionId=643169&fmt=gif")
          .headers(headers_74),
        http("request_79")
          .get(uri08 + "?param1=74381651004597411201652656920552383315")
          .headers(headers_48),
        http("request_80")
          .get(uri12 + "?b2=GjxEjvkxzuFv-g57WdD-VVr6ZBXkH_lbmV2h8x_YqshzlS2O-oAbI94xWiSFCn0mK9wjTPwzl5Q4GUzTrD4tPA&cid=")
          .headers(headers_74),
        http("request_81")
          .get(uri19 + "/?pid=464562&conversionId=643169&fmt=gif&cookiesTest=true")
          .headers(headers_74),
        http("request_82")
          .get(uri21 + "/upi/?sid=htGlHngZ1MrGrY4094lt&cs=1")
          .headers(headers_74),
        http("request_83")
          .get(uri06 + "?id=125603944727793&ev=PageView&noscript=1&dl=www.southwest.com/")
          .headers(headers_74),
        http("request_84")
          .get(uri10 + "?t=1598032216138&mi_u=anon-1598032216134-1442513944&mi_cid=4971&page_title=Southwest%20Airlines%20%7C%20Book%20Flights%20%26%20More%20-%20Wanna%20Get%20Away%3F&timezone_offset=300&event_type=pageview&cdate=1598032216134&ck=false")
          .headers(headers_74),
        http("request_85")
          .get(uri21 + "/ct/upi/?sid=htGlHngZ1MrGrY4094lt&cs=1&_test=X0AJWAAAAEvmZAmJ")
          .headers(headers_74),
        http("request_86")
          .get(uri25 + "?D9v.AdvID=1121&D9r.DeviceID=true&D9c=ftSpot&D9v.SiteID=15214&D9c.spotlightId=112033&D9c.spotlightGroupId=11638&D9cc.U13=74381651004597411201652656920552383315&cb=6175548018047.004")
          .headers(headers_48),
        http("request_87")
          .get(uri16 + "?ownerId=2029&eventId=SW31&ecid=74381651004597411201652656920552383315")
          .headers(headers_74),
        http("request_88")
          .get(uri03 + "/_af41d5ef523b14bf?fid=1598032215470&checkin=2020-08-22&checkout=2020-08-25&iata_orr=1&iata=&lang=en_us&dsize=938,222&dtpncy=&dtsize=&dmsize=")
          .headers(headers_27),
        http("request_89")
          .get(uri24 + "/affiliate_base/css/affiliatewidget_cloudfront_sd/108ec64d505c0f6dc987cc8ba04997dfdd3a7c69.css")
          .headers(headers_89),
        http("request_90")
          .get(uri24 + "/js/error_catcher_bec_cloudfront_sd/f56f7a2e7854715ad5ecc2f07a1a4c7b4a49970d.js")
          .headers(headers_90),
        http("request_91")
          .get(uri24 + "/js/affiliatewidget_cloudfront_sd/96b1605c19341258bf82588037ea83a8f55a4b80.js")
          .headers(headers_90),
        http("request_92")
          .get(uri24 + "/affiliate_base/img/jui/ui-bg_flat_75_ffffff_40x100/882c78c4f389908c4211b7b54eab4a5dabcc8031.png")
          .headers(headers_74),
        http("request_93")
          .get(uri03 + "/load_times?jquery_ready=263&window_onload=266&sid=950fb216d88e63bc8ebca71af1b97761&pid=28e17d6cb13d01c4&first=1&cdn=cf&dc=1&lang=en-us&aid=1146301&ref_action=affiliatewidget&stype=1&ch=&info=&screen_size=1366x768&m=UmFuZG9tSVYkc2RlIyh9YeeP1Tu7GT53wEihqy_R3XgRf3AzqrZ95mECMMoxrUzQoLCPvIhk3K_82NVrLVsiORe4kYYhb7XvqwOgneQxgMh171Eswl0BVP4Vf32GwQ3j__2TTMVUxWD5LKwVDiFdw_xzWUo4rfumkWXhNSUVDsVYMatzSOYKkqV-XVR67SOXfhm5MOtmJZcA-ejqISwXcQ")
          .headers(headers_93)))
    .pause(1)
    .exec(http("request_94")
      .post("/")
      .headers(headers_94)
      .formParam("h.d", "southwest.com")
      .formParam("h.key", "7WRRJ-SW4DM-BC2LK-ZQ8AG-3NJHN")
      .formParam("h.t", "1598032213791")
      .formParam("c.o", "")
      .formParam("pci", "1")
      .formParam("c.e", "ke4j492g")
      .formParam("c.tti.m", "lt")
      .formParam("t_configjs", "291")
      .formParam("t_configfb", "283")
      .formParam("rt.start", "manual")
      .formParam("mob.etype", "4g")
      .formParam("mob.dl", "10")
      .formParam("mob.rtt", "50")
      .formParam("spa.missed", "1")
      .formParam("restiming", """{"https://":{"c":{"ontent.zeronaught.com/js/southwest.js":"3oj,l5*21","m.everesttech.net/cm/dd?d_uuid=74539705151285133511632295078137012180":"13pu,1z","t.pinterest.com/v3/?tid=2617072137155&event=page_visit&noscript=1":"149l,61"},"s":{"o":{"uthwestairlines.mpeasylink.com/mpel/mpel":{".js":"31jk,a7*25","_storage.html?cmd=getpref&h":{"ref=https%3A%2F%2Fwww.southwest.com%2F":"a2fq,22"}},"ptimize.southwest.com/m2/southwestairlines/mbox/json?...":"52pl,b6,b5,6z,6t,2n,l,l,1*17h,9i,3c|52po,b1,9b,6w*12o,8d|52pr,97,96,6t*12o,8d|52pu,95,95,6r*12o,8d|52pw,91,8z,6p*12o,8d|52pz,as,as,6m*12o,8c"},"metrics.southwest.com/":{"id?d_visid_ver=4.6.0&d_fieldgroup=MC&mcorgid=65D316D751E563EC0A490D4C%40AdobeOrg&ts=1598032213127":"523m,l4","b/ss/swaprod/10/JS-2.20.0-LAUN/s53340002849699?...":"3486,1o*21"},"wa":{"-dc.zeronaught.com/dc?key=AIzaSyD6bEKLWVjAK0AlU_ubyD_mPZ58xFxmxlg&sc=AD5rJBJ0AQAA6_Cwu7ihreQ5q6B4kQd5pLA1JH0G6uYHuJBY6sn7f4NAIwkL%7C1%7C0%7C67b5f8d38821331134d6bc5826645e75fbf865e5&si=%7B%22ts%22%3A1598032212%2C%22p%22%3A1%2C%22v%22%3A%7B%22sq%22%3A101432801%7D%2C%22c%22%3A%7B%22tk%22%3A0%2C%22sc%22%3A0%7D%7D":"523r,54",".demdex.net/dest5.html?d_nsid=0#https%3A%2F%2Fwww.southwest.com":"a2rh,9g"},"iteintercept.qualtrics.com/":{"WR":{"SiteInterceptEngine/":{"Targeting.php?Q_ZoneID=ZN_6fEtw4RXYKndJOZ&Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch":{"|":"52sq,5y","&t=1598032214413&Q_VSI=%7B%22SI_bpguszrqF6sV6Cx%22%3A%22DependencyResolver%22%2C%22SI_5yVw4GOJpYx0RUx%22%3A%22AS_07676101%22%2C%22SI_9tPFEECbWLIkRs9%22%3A%22DependencyResolver%22%7D&Q_DPR=true":"533i,2u"},"Asset.php?Module=":{"SI_5yVw4GOJpYx0RUx&Version=175&Q_ORIGIN=https://www.southwest.com&Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch":"536l,12","CR_2gJhqDWQ54wnbM1&Version=35&Q_InterceptID=SI_5yVw4GOJpYx0RUx&Q_ORIGIN=https://www.southwest.com&Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch":"536o,23"},"?Q_Impress=1&Q_CID=CR_2gJhqDWQ54wnbM1&Q_SIID=SI_5yVw4GOJpYx0RUx&Q_ASID=AS_07676101&Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch&r=1598032215794":"545z,2d"},"QualtricsShared/Graphics/siteintercept/wr-dialog-close-btn-white.png":"*0h,h,gw,gh,10,10|1462,19"},"dxjsmodule/":{"1":{"2.e6c6f9aa65272bcbcd07.chunk.js?Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=web":"336g,12*21",".fe6ee5251dbb499b909e.chunk.js?Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=web":"336h,15*21"},"CoreModule.js?Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch":"32z1,2g*27","FeedbackButtonModule.js?Q_CLIENTVERSION=1.32.1&Q_CLIENTTYPE=webAdobeLaunch":"336i,1g*27"}},"ervedby.flashtalking.com/spot/1/15214;112033;11638/?spotName=SOUTHWEST_2019_SWA_HOME_PAGE_LP&U13=74381651004597411201652656920552383315&cachebuster=8689774186491.987":"148f,4q","-a.innovid.com/conversion/1hk2j3?param1=74381651004597411201652656920552383315":"148y,57"},"d":{"9.flashtalking.com/img/img.png?D9v.AdvID=1121&D9r.DeviceID=true&D9c=ftSpot&D9v.SiteID=15214&D9c.spotlightId=112033&D9c.spotlightGroupId=11638&D9cc.U13=74381651004597411201652656920552383315&cb=6175548018047.004":"148f,93","pm.demdex.net/id?d_visid_ver=4.6.0&d_fieldgroup=":{"MC&d_rtbd=json&d_ver=2&d_verify=1&d_orgid=65D316D751E563EC0A490D4C%40AdobeOrg&d_nsid=0&ts=1598032211638":"51nh,21","AAM&d_rtbd=json&d_ver=2&d_orgid=65D316D751E563EC0A490D4C%40AdobeOrg&d_nsid=0&d_mid=74381651004597411201652656920552383315&ts=1598032213912":"52pf,1u"},"c.ads.linkedin.com/collect/?pid=464562&conversionId=643169&fmt=gif":"14e8,1h"},"a":{"ff.bstatic.com/static/affiliate_base/js/booking_sp_widget.js?checkin=2020-08-22&checkout=2020-08-25&iata_orr=1&iata=&lang=en_us":"33gi,g2,g2,br,bq,74,p,p,1*110m,bt,1rw","g.innovid.com/retargeting/pixel?ownerId=2029&eventId=SW31&ecid=74381651004597411201652656920552383315":"1490,7q"},"r":{".turn.com/r/beacon?b2=GjxEjvkxzuFv-g57WdD-VVr6ZBXkH_lbmV2h8x_YqshzlS2O-oAbI94xWiSFCn0mK9wjTPwzl5Q4GUzTrD4tPA&cid=":"1496,5m","n9nhnpa.micpn.com/p/":{"js/1.js":"34a1,3x*21","cp/-1/track.gif?t=1598032216138&mi_u=anon-1598032216134-1442513944&mi_cid=4971&page_title=Southwest%20Airlines%20%7C%20Book%20Flights%20%26%20More%20-%20Wanna%20Get%20Away%3F&timezone_offset=300&event_type=pageview&cdate=1598032216134&ck=false":"14fd,20"},"td-tm.everesttech.net/upi/?sid=htGlHngZ1MrGrY4094lt&cs=1":"14fj,2l"},"www.":{"southwest.com/":{"|":"6,4x,4v,2z,2z,1z,z,z,d*12v2,9j,49b*30,1:1","a":{"ssets/":{"app/scripts/swa-common.js":"36q,by,a2,5*1298n,j9,1roa*20*30:.1,34:1,59:2","images/globalnav/logos/swa_footer_logo_":{"business_travel.svg":"71mr,1b,18,2*122p,85,2r4*30,1:1","swa_cargo.svg":"71mr,1d,1c,3*12pv,8d,3or*30,1:1"}},"pi/":{"landing-page/v1/landing-page/feature/uimetadata":"51ho,3h,3g,1*13d,io,-1*30:.1,41:1,51:2","content-delivery/v1/content-delivery/query/placements":"5326,5y,5q,1*1aw2,ao,1f3r*30:.1,41:1,94:2"}},"landing/home-page/":{"assets/29.0.0-6/s":{"tyles/":{"app.css":"26q,9v,87,8*1ik2,9b,2y6z*30,1:1*44","fonts/swa-icon.woff":"41ji,60,55,41*1ft9,92,-p*30,1:1"},"cripts/":{"vendor.js":"36s,ua,bw,l*18g9g,106,qxar*24*30,1:1","en.js":"36t,ru,o8,k*11s4q,do,70ta*24*30,1:1","app.js":"36u,100,sv,l*15gkv,px,igws*24*30,1:1"}},"version.json?application=landing-home-page&site=southwest&_=1598032212057":"51jc,v,v,3*17s,7r*30,1:1"},"swa-":{"resources/":{"s":{"tyles/landing-home-page-theme.css":"26r,a0,9u,a*1mz,94,2nt*30,1:1*44","cripts/":{"a":{"nalytics/":{"analytics.js":"36r,8c,26,k*12k5j,g7,ak90*20*30,1:1","/b52dfd6476cb/21df05686c51/0712c740c735/hostedLibFiles/EP308220a2a4c4403f97fc1960100db40f/AppMeasurement":{".min.js":"3ye,az,au,8l,8l,8l,8l,8l,8l,8h*1aam,hx,hx3*21*30,1:1","_Module_AudienceManagement.min.js":"326d,af,ab,9m,9l,9l,9l,9l,9l,1d*16re,i6,cm9*21*30,1:1"},"b52dfd6476cb/21df05686c51/0712c740c735/RC":{"8":{"743edb48de34c9aa7a8307de3042208-source.min.js":"33pp,c1,c1,4*164,8t,1k*21*30,1:1","fa92e829fde43799fc5c81d27c02f6d-source.min.js":"343k,1p,1o,4*1bd,8u,4z*21*30,1:1"},"9":{"20879d3e20e486c839507c1293cb626-source.min.js":"343b,1h,1g,3*18k,8u,2q*21*30,1:1","9d18622fc2344369d83972bbe6008d8-source.min.js":"343e,1f,1e,3*1ab,8u,2l*21*30,1:1"},"a":{"611b4388c2141b8ba31249016bc5224-source.min.js":"3437,1a,19,2*1g0,8u,fr*21*30,1:1","c95860521534775b751519eecde9e52-source.min.js":"343w,1o,1n,3*1h9,89*21*30,1:1"},"585f3ed37d2e4ba0a89f687ec475a842-source.min.js":"343i,1q,1p,4*18t,8u,36*21*30,1:1","7dd4d090a42743709b8f2f4830c23dc0-source.min.js":"3439,1p,1o,3*1cl,8u,cs*21*30,1:1","b57a62ade1d94590be15da3b0302b549-source.min.js":"343g,1j,1i,3*18u,8u,34*21*30,1:1","deaea88888f7402cbb517598570ef6e6-source.min.js":"343t,1q,1p,3*16q,8t,24*21*30,1:1"}},"ds.js":"36v,zz,zz,k*126,8s,-1*24*30,1:1"},"motion-point/mp_linkcode.js":"36s,a0,9z,l*1k5,8u,va*20*30,1:1"}},"config/status.js":"36r,25,23,g*12t,8r,1c*20*30,1:1","images/":{"p":{"romotions/2020-rr-chase-plus-contactless-md.png":"*02n,46,pn,m4,4e,6y|13o7,3i,2z,3*1l2m,9t*30,1:1","olaroids/homepage/H":{"otel-2K-HpPolo1-img-20200811.png":"*06j,8o,ws,q|13o8,7o,3i,3*14av2,kc*30,1:1","pPol":{"o2-car-20200114-2.jpg":"*06j,8o,ws,9e|13o9,8f,7n,4*1123h,b4*30,1:1","aroid1-swav-20200113.jpg":"*06j,8o,ws,i3|13o9,d7,8f,8*127wx,ee*30,1:1"}}},"globalnav/logos/swa_logo_dark.svg":"71mq,18,12,2*126x,8q,2oe*30,1:1","heroes/hero_shots/":{"HpHero-bg-chase-wave3-65k-bg.jpg":"13o6,27,t,2*11dcr,bu*30,1:1|43rk,8m,5h,3*11dcr,cc*30,1:1","rr-plus-card-contactless-angled.png":"*030,4q,64,be,45,6i|13o6,2w,27,3*1qf1,a2*30,1:1","swa-promise-logo-lockup-ffffff.svg":"73o7,2z,2y,3*11rh,8q,28e*30,1:1"},"icons/HpIcon":{"1_WhyFly_190305.png":"*028,28,1bw,ao,26,26|13oa,d8,d6,e*11md,81*30,1:1","2_EB.gif":"*026,26,1bw,nr|13oa,d8,d8,e*11f9,81*30,1:1","4_mobileapp.gif":"*026,26,1j9,aq|13ob,da,d8,e*14pq,8a*30,1:1","_SWABIZ.jpg":"*02a,2t,1j9,n4|13ob,de,da,e*1433,8b*30,1:1"}},"fonts/SouthwestSans-":{"Bold.otf":"43dk,ks,jj,ce*11be4,cx*30:.1,31:1,50:2","Regular.otf":"43dl,lo,kr,cd*11azo,cx*30:.1,91:1,44:2"}},"ui/bootstrap/landing-home-page/1/":{"i18n/en.js":"36t,rv,ru,l*1f8,8i,f7*24*30,1:1","content/en.js":"36u,s2,ru,k*16t5,90,1ohq*24*30,1:1","data.js":"36u,su,rv,l*1sim,b2,5gfh*24*30,1:1"}}},"facebook.com/tr?id=125603944727793&ev=PageView&noscript=1&dl=www.southwest.com/":"149u,65","booking.com/_af41d5ef523b14bf?fid=1598032215470&checkin=2020-08-22&checkout=2020-08-25&iata_orr=1&iata=&lang=en_us&dsize=938,222&dtpncy=&dtsize=&dmsize=":"a4j3,gs"},"zn6fetw4rxykndjoz-southwest.siteintercept.qualtrics.com/WRSiteInterceptEngine/?Q_ZID=ZN_6fEtw4RXYKndJOZ":"32kz,77*25"}}""")
      .formParam("servertiming", "~(~(~'cdn-cache~'HIT~'MISS)~'edge~'origin)")
      .formParam("h.pg", "landing-home-page-index")
      .formParam("cdim.Domain", "www.southwest.com")
      .formParam("custom3_st", "4758")
      .formParam("custom7_st", "242")
      .formParam("custom8_st", "246")
      .formParam("rt.bmr", "1261,388,293,271,271,184,46,46,1")
      .formParam("rt.cnf", "3165,236,234,136,136,88,69,69,5")
      .formParam("rt.tstart", "1598032210408")
      .formParam("rt.bstart", "1598032213113")
      .formParam("rt.blstart", "1598032211669")
      .formParam("rt.end", "1598032217107")
      .formParam("t_resp", "175")
      .formParam("t_page", "6524")
      .formParam("t_done", "6699")
      .formParam("t_other", "custom3|80,custom7|430,custom8|1295,boomerang|7,boomr_fb|2705,boomr_ld|1261,boomr_lat|1444")
      .formParam("u", "https://www.southwest.com/")
      .formParam("http.initiator", "spa_hard")
      .formParam("rt.tt", "6699")
      .formParam("rt.obo", "0")
      .formParam("pt.fp", "2136")
      .formParam("pt.fcp", "2136")
      .formParam("nt_nav_st", "1598032210408")
      .formParam("nt_fet_st", "1598032210415")
      .formParam("nt_dns_st", "1598032210420")
      .formParam("nt_dns_end", "1598032210443")
      .formParam("nt_con_st", "1598032210443")
      .formParam("nt_con_end", "1598032210514")
      .formParam("nt_req_st", "1598032210514")
      .formParam("nt_res_st", "1598032210582")
      .formParam("nt_res_end", "1598032210585")
      .formParam("nt_domloading", "1598032210606")
      .formParam("nt_domint", "1598032212536")
      .formParam("nt_domcontloaded_st", "1598032212536")
      .formParam("nt_domcontloaded_end", "1598032212539")
      .formParam("nt_domcomp", "1598032213752")
      .formParam("nt_load_st", "1598032213752")
      .formParam("nt_load_end", "1598032213758")
      .formParam("nt_ssl_st", "1598032210479")
      .formParam("nt_enc_size", "3710")
      .formParam("nt_dec_size", "9229")
      .formParam("nt_trn_size", "4053")
      .formParam("nt_protocol", "h2")
      .formParam("nt_first_paint", "1598032212544")
      .formParam("nt_red_cnt", "0")
      .formParam("nt_nav_type", "0")
      .formParam("v", "1.632.0")
      .formParam("rt.si", "32097774-7175-4285-86dc-df3cf06290e5-qffdjm")
      .formParam("rt.ss", "1598032210408")
      .formParam("rt.sl", "1")
      .formParam("vis.st", "visible")
      .formParam("ua.plt", "Win32")
      .formParam("ua.vnd", "Google Inc.")
      .formParam("pid", "fwzgitfj")
      .formParam("n", "1")
      .formParam("ak.v", "28")
      .formParam("ak.cp", "464178")
      .formParam("ak.ai", "603494")
      .formParam("ak.ol", "0")
      .formParam("ak.cr", "24")
      .formParam("ak.ipv", "4")
      .formParam("ak.proto", "h2")
      .formParam("ak.rid", "18fefe34")
      .formParam("ak.r", "35731")
      .formParam("ak.a2", "0")
      .formParam("ak.m", "a")
      .formParam("ak.n", "essl")
      .formParam("ak.bpcip", "65.170.41.0")
      .formParam("ak.cport", "45973")
      .formParam("ak.gh", "172.232.3.60")
      .formParam("ak.quicv", "")
      .formParam("ak.tlsv", "tls1.3")
      .formParam("ak.0rtt", "")
      .formParam("ak.csrc", "-")
      .formParam("ak.acc", "")
      .formParam("ak.t", "1598032210")
      .formParam("ak.ak", "hOBiQwZUYzCg5VSAfCLimQ==lR/abChVaRULGOJ7r8WB6TPADqSMkCBxE8nZl2d5Tg30ZR8drMRDYpYB80tyuiAgx5wRpS+ISRdKFftNxTUtSb27SgpHqERVjRDckiDRE+5kma+j7S0Xck/t3/9CFMFnsHtpicMj/OGa5CM5Gv1yoGhMkGG66qFg+/t3tm9rr9yrmwrLtBHrU11uXKcz9VBZEjspRfy+4Xg+vICrJk3k5y3E5kZX9A50eMfFgg7Jx+0tZxSVnTGsK1f7OF0sV2LbMkPCEWSbbZJlI7A/c8zS2Zvl88vsN8AvqJ0ZH5WzxWqEFAgo3MzUj4QoLIbfKneCFIyeQwJbv9LQbCS0lwt8EZfh9rWD+m23UtK2HuX9RAnvtRAvQuCskC5OiiS9mX+KzfNqETN9HRZcxz2xqBEXcAe704wiRMRxoriT3UnxWpU=")
      .formParam("ak.pv", "6")
      .formParam("ak.dpoabenc", "")
      .formParam("ak.feo", "0")
      .formParam("dom.res", "88")
      .formParam("dom.doms", "25")
      .formParam("mem.total", "42970701")
      .formParam("mem.limit", "2172649472")
      .formParam("mem.used", "26509185")
      .formParam("mem.lsln", "8")
      .formParam("mem.ssln", "6")
      .formParam("mem.lssz", "1959")
      .formParam("mem.sssz", "1258")
      .formParam("scr.xy", "1366x768")
      .formParam("scr.bpp", "24/24")
      .formParam("scr.orn", "0/landscape-primary")
      .formParam("cpu.cnc", "8")
      .formParam("bat.lvl", "0.38")
      .formParam("dom.ln", "999")
      .formParam("dom.sz", "110161")
      .formParam("dom.ck", "1101")
      .formParam("dom.img", "19")
      .formParam("dom.script", "45")
      .formParam("dom.script.ext", "33")
      .formParam("dom.iframe", "2")
      .formParam("dom.link", "5")
      .formParam("dom.link.css", "2")
      .formParam("c.t.longtask", "0001*a*01000111*n*01")
      .formParam("c.t.fps", "066356663*5*023021010654443*f*6476663001")
      .formParam("c.t.mem", "1*d*0,*8*krktn,*9*j2ndl,*a*jjwph,*a*jq2vd,ey27q")
      .formParam("c.t.domsz", "1*d*0,*8*34ve,*9*3ddp,*a*2cuz,*a*2cwv,2d01")
      .formParam("c.t.domln", "1*d*0,*8*130,*9*142,*k*rq,rr")
      .formParam("c.t.mut", "0*d*0.2s.*7*03*8*01")
      .formParam("c.tti.vr", "2137")
      .formParam("c.tti", "3646")
      .formParam("c.lt.n", "6")
      .formParam("c.lt.tt", "897.66499993857")
      .formParam("c.lt", "~(~(a~(~(a~0~s~'~t~0))~d~'1m~n~1~s~'2tf)~(a~(~(a~0~s~'~t~0))~d~'g5~n~1~s~'38c)~(a~(~(a~0~s~'~t~0))~d~'1j~n~1~s~'3yh)~(a~(~(a~0~s~'~t~0))~d~'2h~n~1~s~'40b)~(a~(~(a~0~s~'~t~0))~d~'1j~n~1~s~'44k)~(a~(~(a~0~s~'~t~0))~d~'1n~n~1~s~'5xx))")
      .formParam("c.f", "39")
      .formParam("c.f.d", "5060")
      .formParam("c.f.m", "1")
      .formParam("c.f.l", "8")
      .formParam("c.f.s", "ke4j4bq6")
      .formParam("h.cr", "a31e84004f902c2ea1552022926aaec3a40eebb3")
      .formParam("sb", "1"))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
