package org.bahmni.gatling.simulations

import io.gatling.core.Predef._
import org.bahmni.gatling.Configuration.HttpConf._
import org.bahmni.gatling.Configuration.Load
import org.bahmni.gatling.scenarios._

class UserSimulation extends Simulation {

  setUp(
    //ClinicalDashboardViewNameSearchFlow.scn.inject(rampUsers(2) over 100).protocols(HTTPS_PROTOCOL),
    PatientCreateAndStartVisitFlow.scn.inject(rampUsers(1) over 1).protocols(HTTPS_PROTOCOL)
    //PatientNameSearchFlow.scn.inject(rampUsers(2) over 100).protocols(HTTPS_PROTOCOL),
    //InPatientFlow.scn.inject(rampUsers(2) over 300).protocols(HTTPS_PROTOCOL),
    //PatientLabOrderViewFlow.scn.inject(rampUsers(2) over 150).protocols(HTTPS_PROTOCOL),
    //ViewPatientERPQuotation.scn.inject(rampUsers(1) over 150).protocols(HTTP_ERP_PROTOCOL)
  )
    .assertions(
	    global.successfulRequests.percent.gte(90),
      //details("Search Patient by Name").successfulRequests.percent.gte(50),
	    details("start visit").responseTime.percentile3.lte(22000)
      //details("view lab order") .successfulRequests.percent.gte(95),
      //details("get quotation").successfulRequests.percent.gte(95)
    )

}
