package com.despegar.certification.despegar.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import org.openqa.selenium.WebDriver; // libreria que permite usar el webdriver

//importaciones de clases necesarias para hacer uso de sus metodos y elementos
import com.despegar.certification.despegar.models.FlightFinderModel;
import com.despegar.certification.despegar.questions.DespegarPageVisible;
import com.despegar.certification.despegar.tasks.GoTo;
import com.despegar.certification.despegar.tasks.OpenTheBrowser;
import com.despegar.certification.despegar.userinterfaces.DespegarHomePage;

//librerias de cucumber para usar y referenciar los pasos Given , when y then
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;//libreria que importa al actor
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;//libreria para darle la habilidad al actor de usar el navegador
import net.thucydides.core.annotations.Managed; //libreria que importa las anotaciones

public class FindYourFlightStepDefinitions {
	
	//Definición del driver
		@Managed(driver = "chrome")
		private WebDriver hisBrowser;
		private Actor julian = Actor.named("julian");//Primero se referencia la variable del actor
		private DespegarHomePage despegarHomePage;
		
		
		@Before //instruccion que se ejecuta antes
		public void setUp() {
			julian.can(BrowseTheWeb.with(hisBrowser)); //se le da una habilidad al actor o sea hacer uso del navegador
		}
	
	@Given("^thath Julian wants to select a flight$")
	public void thathJulianWantsToSelectAFlight() throws Exception {
		//Abrir el navegador
		julian.wasAbleTo(OpenTheBrowser.on(despegarHomePage));//wasAbleTo recibe un performable(ejecutable, es decir una tareay ejecuta un metodo llamado attempsto y para cada una de las tareas que recibe ejecuta el metodo perform que es un metodo privado que recibe una tarea y ejecuta el metodo perform as)
		
		
	   
	}

	@When("^He choose the origin  and  destiny city$")
	public void heChooseTheOriginAndDestinyCity(List<FlightFinderModel> flightFinderModel) throws Exception {
		julian.attemptsTo(GoTo.theFlights(flightFinderModel.get(0))); 
		//ingresa la ciudad destino y origen con los datos traidos desde la tabla FlightFinderModel
		
	}

	@Then("^he should see the flight finder screen$")
	public void heShouldSeeTheFlightFinderScreen() throws Exception {
		julian.should(seeThat(DespegarPageVisible.page()));
		//julian.should(seeThat(DespegarPageVisible.isVisible()).orComplainWith(WithoutConnectionToTheNetwork.class));
		
	
	}

}
