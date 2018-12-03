package co.com.google.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/Prueba.feature",glue="co.com.google.PruebasStepDefinition",tags="@tag1")

public class PruebaRunner {
	

	
}
