package com.despegar.certification.despegar.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List; //libreria de java para usar listas

import org.openqa.selenium.WebDriver;// libreria que permite usar el webdriver

//importaciones de clases necesarias para hacer uso de sus metodos y elementos
import com.despegar.certification.despegar.models.RegisterModel;
import com.despegar.certification.despegar.questions.DespegarRegisterResult;
import com.despegar.certification.despegar.tasks.CompleteYour;
import com.despegar.certification.despegar.tasks.OpenTheBrowser;
import com.despegar.certification.despegar.tasks.SelectThe;
import com.despegar.certification.despegar.userinterfaces.AvailableFlights;

//librerias de cucumber para usar y referenciar los pasos Given , when y then
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;//libreria que importa al actor
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;//libreria para darle la habilidad al actor de usar el navegador
import net.thucydides.core.annotations.Managed;//libreria que importa las anotaciones

public class CompletePurchaseStepDefinitions {
	
	//Definición del driver
			@Managed(driver = "chrome")
			private WebDriver hisBrowser;
			private Actor julian = Actor.named("julian");// referencia de la variable del actor
			private AvailableFlights availableFlights;
			
			@Before//instruccion que se ejecuta antes
			public void setUp() {
				julian.can(BrowseTheWeb.with(hisBrowser));//se le da una habilidad al actor o sea hacer uso del navegador
			}
	
	@Given("^thath Julian wants to finalize the purchase$")
	public void thathJulianWantsToFinalizeThePurchase() throws Exception {
		julian.wasAbleTo(OpenTheBrowser.on(availableFlights));//wasAbleTo recibe un performable(ejecutable, es decir una tareay ejecuta un metodo llamado attempsto y para cada una de las tareas que recibe ejecuta el metodo perform que es un metodo privado que recibe una tarea y ejecuta el metodo perform as)
		
	}

	@When("^he enter the data$")
	public void heEnterTheData(List<RegisterModel> data) throws Exception {	
		julian.attemptsTo(SelectThe.AvailableFlight());
		julian.attemptsTo(CompleteYour.data(data.get(0)));
		//ingresa los datos personales solicitados, traidos desde la tabla RegisterModel
	}

	@Then("^he see the buy details$")
	public void heSeeTheBuyDetails() throws Exception {
		julian.should(seeThat(DespegarRegisterResult.page()));
 
	}

}
