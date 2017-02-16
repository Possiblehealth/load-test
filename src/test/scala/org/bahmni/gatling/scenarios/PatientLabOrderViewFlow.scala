package org.bahmni.gatling.scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.{ChainBuilder, ScenarioBuilder}
import org.bahmni.gatling.Configuration.Constants._
import org.bahmni.gatling.Configuration
import org.bahmni.gatling.HttpRequests._

object PatientLabOrderViewFlow {

  def patientLabOrder(accession_num: String): ChainBuilder = {
    exec(
      getOrderedSamples(accession_num)
    )
  }

  val scn: ScenarioBuilder = scenario("lab Order")
    .during(Configuration.Load.DURATION) {
      feed(csv("labOrders.csv").circular)
        .exec(patientLabOrder("${ACCESSION_NUMBER}"))
        .pause(30)
    }

}

