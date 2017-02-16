package org.bahmni.gatling.scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.{ChainBuilder, ScenarioBuilder}
import org.bahmni.gatling.Configuration.Constants._
import org.bahmni.gatling.Configuration
import org.bahmni.gatling.HttpRequests._

object ViewPatientERPQuotation{

  val scn: ScenarioBuilder = scenario("get quotation")
    .during(Configuration.Load.DURATION) {
      exec(getQuotations)
    }
}

