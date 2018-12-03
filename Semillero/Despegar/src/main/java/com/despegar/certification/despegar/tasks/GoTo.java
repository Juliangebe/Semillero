package com.despegar.certification.despegar.tasks;

import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.DEPARTURE_BUTTON;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.DESTINY_CITY_OPTION_SHOWED;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.EMERGENT_WINDOW;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.FLIGHTS_BUTTON;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.ORIGIN_CITY_OPTION_SHOWED;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.ORIGIN_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.SEARCH_BUTTON;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.SELECT_DEPARTURE_DATE;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.SELECT_RETURN_DATE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.despegar.certification.despegar.models.FlightFinderModel;
import com.despegar.certification.despegar.userinterfaces.DespegarHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;;

public class GoTo implements Task { // Task es una interfaz(entidad de java que solo contiene las firmas de los
									// metodos , no las implementaciones)
	// Es hijo de performable (lo que recibe el wasAbleTo)

	// modelo de la ciudad origen y destino
	private FlightFinderModel flightFinderModel;

	// constructor de la tarea
	public GoTo(FlightFinderModel flightFinderModel) {
		this.flightFinderModel = flightFinderModel;
	}

	@Override
	@Step("{0} search for a flight")
	public <T extends Actor> void performAs(T actor) {//el metodo performAs no devuelve nada y recibe actor con las interacciones
		actor.attemptsTo(Click.on(EMERGENT_WINDOW));// cierra el anuncio
		actor.attemptsTo(Click.on(FLIGHTS_BUTTON));// da clic en vuelos		
		actor.attemptsTo(Enter.theValue(flightFinderModel.getOrigin()).into(ORIGIN_TEXTBOX));// Ingresa el origen en el campo ORIGIN_TEXTBOX
		actor.attemptsTo(Click.on(DESTINY_CITY_OPTION_SHOWED));//Clic en la lista de ciudades destino mostrada
		actor.attemptsTo(Enter.theValue(flightFinderModel.getDestiny()).into(DespegarHomePage.DESTINY_TEXTBOX));// Ingresa el destino en el campo DESTINY_TEXTBOX
		actor.attemptsTo(Click.on(ORIGIN_CITY_OPTION_SHOWED));		//Clic en la lista de ciudades origen mostrada
		actor.attemptsTo(Click.on(DEPARTURE_BUTTON));// Clic en el boton de calendario "ida"
		actor.attemptsTo(Click.on(SELECT_DEPARTURE_DATE));// clic en la fecha de ida
		actor.attemptsTo(Click.on(SELECT_RETURN_DATE));// clic en la fecha de regreso
		actor.attemptsTo(Click.on(SEARCH_BUTTON));// clic en el boton buscar
	}
	// metodo que llama al instrumented que crea una instancia en tiempo de
		// ejecución, con el parametro de tipo flightFinderModel
	public static GoTo theFlights(FlightFinderModel flightFinderModel) {
		return instrumented(GoTo.class, flightFinderModel);// esto equivalente a decir new GoTo
	}// instrumented permite crear una instancia de la clase , para el informe
		// ,debug, hallazgode errores en tareas
		// el atributo que llega al metodo on tiene que ser igual al del contructor

}
