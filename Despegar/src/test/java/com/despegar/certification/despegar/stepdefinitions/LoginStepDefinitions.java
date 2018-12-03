package com.despegar.certification.despegar.stepdefinitions;

import java.util.List; //liberia de java para usar listas

import org.openqa.selenium.WebDriver;// libreria que permite usar el webdriver
//importaciones de clases necesarias para hacer uso de sus metodos y elementos
import com.despegar.certification.despegar.models.LoginModel;
import com.despegar.certification.despegar.tasks.Log;
import com.despegar.certification.despegar.tasks.OpenTheBrowser;
import com.despegar.certification.despegar.userinterfaces.DespegarHomePage;
//librerias de cucumber para usar y referenciar los pasos Given , when y then
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;//libreria que importa al actor
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;//libreria para darle la habilidad al actor de usar el navegador
import net.thucydides.core.annotations.Managed;//libreria que importa las anotaciones

public class LoginStepDefinitions {
	
	//Definición del driver
			@Managed(driver = "chrome")
			private WebDriver hisBrowser;
			private Actor julian = Actor.named("julian");// referencia de la variable del actor
			private DespegarHomePage despegarHomePage;//instancia de la clase que contiene el homepage
			
			
			@Before//instruccion que se ejecuta antes
			public void setUp() {
				julian.can(BrowseTheWeb.with(hisBrowser));//se le da una habilidad al actor o sea hacer uso del navegador
			}
			
			@Given("^that Julian wants into despegar page$")
			public void thatJulianWantsIntoDespegarPage() throws Exception {
				julian.wasAbleTo(OpenTheBrowser.on(despegarHomePage));//wasAbleTo recibe un performable(ejecutable, es decir una tareay ejecuta un metodo llamado attempsto y para cada una de las tareas que recibe ejecuta el metodo perform que es un metodo privado que recibe una tarea y ejecuta el metodo perform as)
				
			    throw new PendingException();
			}

			@When("^he enter the credentials$")
			public void heEnterTheCredentials(List<LoginModel> loginModel) throws Exception {
				julian.attemptsTo(Log.in(loginModel.get(0)));
			
			    throw new PendingException();
			}

			@Then("^he should see the despegar home page$")
			public void heShouldSeeTheDespegarHomePage() throws Exception {
			    
			    throw new PendingException();
			}
		

}
