package co.com.google.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PruebasStepDefinition {
	
	@Given("Precondiciones")
	public void precondiciones() {
		 System.out.println("Resultado");
		
	}

	@When("Realizo acciones")
	public void realizo_acciones() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Acciones");
	}

	@Then("Valido el resultado")
	public void valido_el_resultado() {
	    System.out.println("Resultado");
	    
	}

	@Given("Precondiciones {int}")
	public void precondiciones(Integer int1) {
		 System.out.println("Precondiciones");
	    
	}

	@When("Realizo acciones {int}")
	public void realizo_acciones(Integer int1) {
		 System.out.println("Acciones");
	  
	}

	@Then("Valido el resultado {int}")
	public void valido_el_resultado(Integer int1) {
		 System.out.println("Resultado");
	    
	}
}
