package co.com.google.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/BuscarEnGoogle.feature",glue="co.com.google.StepDefinition",tags="@tag1")


public class BuscarEnGoogleRunner {
	
	

}
