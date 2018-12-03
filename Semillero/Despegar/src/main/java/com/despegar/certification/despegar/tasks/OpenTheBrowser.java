package com.despegar.certification.despegar.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.despegar.certification.despegar.questions.DespegarPageVisible;

import com.despegar.certification.despegar.exceptions.WithoutConnectionToTheNetwork;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;;
/*Clase Task (tarea) para realizar la apertura del navegador en la pagina
 * recibida como parametro PageObject en el metodo on.*/
public class OpenTheBrowser implements Task { 
	private PageObject page; //intancia de un pageObject
	 public OpenTheBrowser(PageObject page) { //contructor de la clase
		this.page=page;
	}
	
	//Task es una interfaz(entidad de java que solo contiene las firmas de los metodos , no las implementaciones)
											//Es hijo de performable (lo que recibe el wasAbleTo)
	@Override // en el interior de este metodo van todas las acciones e interacciones para cumplir con la tarea
	@Step("{0} opens the browser on Despegar Home Page") // para el informe 
	
	public <T extends Actor> void performAs(T actor) {//el metodo performAs no devuelve nada y recibe actor con las interacciones
		actor.wasAbleTo(Open.browserOn(page));//abrir la pagina principal de despegar
		
		// Verifica que efectivamente se abre la pagina, de lo contrario arroja un
				// AssertionError
		actor.should(seeThat(DespegarPageVisible.isVisible()).orComplainWith(WithoutConnectionToTheNetwork.class,
				getNoInternetConectionMessage()));
	}

	public String getNoInternetConectionMessage() {
		return String.format(WithoutConnectionToTheNetwork.getErrorNetworkMessage());

	}
		
		
	

	public static OpenTheBrowser on(PageObject page) {//instrumented permite crear una instancia de la clase , para el informe ,debug, hallazgode errores en tareas
	return instrumented(OpenTheBrowser.class,page);// instrumented recibe como parametro la clase
	}//el atributo que llega al metodo on tiene que ser igual al del contructor
		

}
