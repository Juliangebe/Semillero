package co.com.google.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/PruebaGoogle.feature",glue="co.com.google.StepDefinition",tags="@tag1")



public class GoogleRunner {
	

	
	

}
