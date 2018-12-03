package co.com.bancolombia.certification.googlesuite.stepdefinitions;


import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.tasks.Translate;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	@Managed(driver ="chrome")
	
	private WebDriver herBrowser; // variable de clase  instanciada
	
	private Actor susan = Actor.named("Susan");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));//  a nuestro actor le daremos una habilidad
												  //para usar el navegador usando screenplay se usa la clase browse the web con el metodo with, recibe el driver 
		//Ya no se hablara del driver sino del actor y este por debajo harà uso del diver para llevar a cabo las tareas
	}
	
	
	
	//Precondiciones : Estar en google trasnslate 
	//1.Abrir el navegador en el home de google : http:/www.google.com
    //2.Ir a google translate (Click, etc,...)
	@Given("^that susan wants yo translate a word$")
	public void thatSusanWantsYoTranslateAWord() throws Exception {		
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE)); 
		
		
		
		
		
	   
	}


	@When("^she translates the word cheese from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
		susan.wasAbleTo(Translate.the());
		//Condicion : llevar a cabo la traduccion, traducir una palavbra de ingles a español
	   
	}

	@Then("^she should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {
		//Consecuencia : aparece la palabra traducida -> Verificado 
	   
	}

}
