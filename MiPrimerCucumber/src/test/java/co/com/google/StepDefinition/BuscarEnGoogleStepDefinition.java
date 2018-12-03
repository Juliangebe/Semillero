package co.com.google.StepDefinition;

import co.com.google.pages.BuscarEnGooglePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class BuscarEnGoogleStepDefinition {
	
	BuscarEnGooglePOM robot = new BuscarEnGooglePOM();
	
	
	
	@Given("Que puedo abrir el navegador")
	
	public void que_puedo_abrir_el_navegador() {
		BuscarEnGooglePOM.AbrirNavegador("http://www.google.com"); // aca solo tengo que abrir el navegador
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("Voy a google")
	public void voy_a_google() {
		BuscarEnGooglePOM.AbrirNavegador("http://www.google.com");
	    // Write code here that turns the phrase above into concrete actions //aca le tengo que mandar la instruccion de ir a google
	 
	}

	@When("realizo una busqueda")
	public void realizo_una_busqueda() {
		BuscarEnGooglePOM.Digitar("lst-ib", "correo");
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("valido que el resultado sea el esperado")
	public void valido_que_el_resultado_sea_el_esperado() {
		BuscarEnGooglePOM.VerificarTitulo("Google");
		
	    // Write code here that turns the phrase above into concrete actions
	  
	}


}
