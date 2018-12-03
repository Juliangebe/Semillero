package com.casadellibro.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented; // podemos eliminar el llamado a la clase   , solo dejamos el llmado al metodo,  para esto se hace estatico el import del Tasks

import com.casadellibro.certification.userinterfaces.CasaDelLibroPeliculasPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowserOn implements Task  { //Cuando implementamos task nos volvemos hijos de performable

	@Override
	@Step("{0}  Open the browser on (Peliculas page) " ) // Para hacer mas entendible lo que esta pasando dentro del metodo performAs
	public <T extends Actor> void performAs(T actor) { // metodo performAs, no devuelve nada y recibe actor
		actor.attemptsTo(Open.browserOn(new CasaDelLibroPeliculasPage()));			
		
	}

	public static OpenTheBrowserOn on() { //(el .on debe devolver un performable porque es lo que recibe el wasAbleTo
	return instrumented(OpenTheBrowserOn.class);// se le puede dejar el performable, pero lo indicado es que pongamos el nombre de la clase ya que tambien es un performable (Sustitucion de liskov, el hijo reemplaza al padre)
	}

}
