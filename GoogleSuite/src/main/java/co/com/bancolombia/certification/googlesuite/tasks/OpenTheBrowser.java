package co.com.bancolombia.certification.googlesuite.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;;

public class OpenTheBrowser implements Task {
	
	private PageObject page;
	
	public  OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	//Hacer uso de constructor o setter
	@Override
	@Step("{0} opens the browser on Google Home Page")  // {0} para referenciar al actor
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		//en el interior las interacciones, algunas son :  Open, clic, enter, hit, 
		
	}

	public static OpenTheBrowser on(PageObject page) {
		
		//return new OpenTheBrowser();//crea una nueva instancia de OpenTheBrowser
		return instrumented(OpenTheBrowser.class,page); //Parametros : clase de la cual se va a crear la instancia y los parametros
		//Instrumented por debajo llama al constructor de la clase que se ajuste a los parametros 
		
	}

}
