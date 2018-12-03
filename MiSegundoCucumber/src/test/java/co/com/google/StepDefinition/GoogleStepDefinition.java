package co.com.google.StepDefinition;

import co.com.google.pages.GooglePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepDefinition {
	
	@Given("Yo abro el navegador")
	public void yo_abro_el_navegador() {
	    GooglePOM.InicializarNavegador();
	}

	@When("Abro la pagina de inicio de google")
	public void abro_la_pagina_de_inicio_de_google() {
		GooglePOM.AbrirGoogle("http://www.google.com");
		
	
	}

	@Then("Busco 'string' una busqueda")
	public void busco_una_busqueda(String string) {
		GooglePOM.Digitar("lst-ib", string);
	    
	}

}
