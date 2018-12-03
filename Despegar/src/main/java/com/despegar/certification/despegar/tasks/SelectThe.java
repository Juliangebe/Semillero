package com.despegar.certification.despegar.tasks;

import static com.despegar.certification.despegar.userinterfaces.AvailableFlights.PRICE_OPTION;
import static com.despegar.certification.despegar.userinterfaces.AvailableFlights.SELECT_BUY_OPTION_BUTTON;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

public class SelectThe implements Task {//Task es una interfaz(entidad de java que solo contiene las firmas de los metodos , no las implementaciones)
	//Es hijo de performable (lo que recibe el wasAbleTo)

	@Override
	@Step("{0} select the flight")
	public <T extends Actor> void performAs(T actor) {//el metodo performAs no devuelve nada y recibe actor con las interacciones
		actor.attemptsTo(Scroll.to(PRICE_OPTION));//el actor hace scroll hasta la opcion de precio
		actor.attemptsTo(Click.on(SELECT_BUY_OPTION_BUTTON));//da clic al boton de seleccionar vuelo para comprar
		
		
		
	}

	public static SelectThe AvailableFlight() {
		return Tasks.instrumented(SelectThe.class);
	}//instrumented permite crear una instancia de la clase , para el informe ,debug, hallazgode errores en tareas
	//el atributo que llega al metodo on tiene que ser igual al del contructor

}
