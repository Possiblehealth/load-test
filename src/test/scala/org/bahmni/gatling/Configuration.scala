package org.bahmni.gatling

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Configuration {

  object Constants {
    val BASE_HTTPS_URL = "https://10.136.22.97:8084"
    val BASE_HTTP_URL = "http://10.136.22.97:8084"
    val LOGIN_USER = "armanvuiyan"
    val LOGIN_USER_UUID = "12a02226-5bb1-4ad0-bcca-14e74e1f755b"
    val PROVIDER_UUID = "cfdc8af5-5847-4ec4-ae85-6c81ed6d814a"
    val LOGIN_LOCATION_UUID = "8abeebf1-0e95-4f0c-8553-a153bf1dc6e5"
    val PATIENT_IDENTIFIER = "GAN179326"
    val PATIENT_IDENTIFIER1 = "SIV156624"
    val PATIENT_IDENTIFIER2 = "BAM118663"
    /*val PATIENT_IDENTIFIER = "Sujan Singh"
    val PATIENT_IDENTIFIER1 = "Nidhi"
    val PATIENT_IDENTIFIER2 = "kirtanjli"*/
    val PATIENT_UUID = "727ab416-4916-40b3-bd00-b116e73f7cd9"
    val VISIT_UUID = "33132f71-5f07-49a6-bdc5-f6ba240dcfd7"
    val ANOTHER_PATIENT_UUID = "08047a4e-bb16-42a3-ab0a-b83674756d62"
    val ANOTHER_VISIT_UUID = "71a7e789-1741-44f5-b54e-42e88c3b8e82"
    //val RADIOLOGY_ORDER_TYPE_UUID = "244b43be-28f1-11e4-86a0-005056822b0b" // possible DB
    val RADIOLOGY_ORDER_TYPE_UUID = "8189dbdd-3f10-11e4-adec-0800271c1b75"
    val USG_ORDER_TYPE_UUID = "c39840d9-57a1-11e6-8158-d4ae52d4c69b"
    var ENCOUNTER_TYPE_UUID = "da7a4fe0-0a6a-11e3-939c-8c50edb4be99"
    var ATOMFEED_ENCOUNTER_UUID = "5ec7042b-3998-4eec-95a7-74d81a871057"
    //val ALL_TESTS_AND_PANELS ="24d98284-28f1-11e4-86a0-005056822b0b" //possible DB
    val ALL_TESTS_AND_PANELS ="e4edc5a4-e349-11e3-983a-91270dcbd3bf"
  }

  object HttpConf {
    val HTTPS_PROTOCOL = http
      .baseURL(Configuration.Constants.BASE_HTTPS_URL)

      .inferHtmlResources()
      .basicAuth("armanvuiyan", "Dghs1234")
      .acceptHeader("application/json, text/plain, */*")
      .acceptEncodingHeader("gzip, deflate, sdch, br")
      .acceptLanguageHeader("en-US,en;q=0.8")
      .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36");

    val HTTP_ERP_PROTOCOL = http
      .baseURL("http://possible-master.mybahmni.org:8069")

      .inferHtmlResources()
      .basicAuth("admin", "password")
      .acceptHeader("application/json, text/plain, */*")
      .acceptEncodingHeader("gzip, deflate, sdch, br")
      .acceptLanguageHeader("en-US,en;q=0.8")
      .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36");
  }

  object Load {
    var ATOMFEED_USER_PROFILE = rampUsers(1) over 10
    var DURATION = 1900

  }

}
