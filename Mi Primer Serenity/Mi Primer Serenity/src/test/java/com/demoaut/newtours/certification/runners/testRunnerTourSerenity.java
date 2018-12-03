package com.demoaut.newtours.certification.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="Features/LoginSerenity.Feature",
glue="co.com.google.StepsDefinition",
plugin=  {"pretty","json:target/json-report/LoginReport.json",
		"html:target/cucumber-reports"}

)

public class testRunnerTourSerenity {

}
