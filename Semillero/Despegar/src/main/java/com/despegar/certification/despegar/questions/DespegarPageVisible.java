package com.despegar.certification.despegar.questions;



import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.despegar.certification.despegar.userinterfaces.DespegarHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DespegarPageVisible implements Question<Boolean> {

	@Override //verifica si el boton de vuelos  es visible por el actor
	public Boolean answeredBy(Actor actor) {
		
		
		return the(DespegarHomePage.FLIGHTS_BUTTON).answeredBy(actor).isCurrentlyVisible();
	}
	
	public static Question<Boolean> isVisible() {
		return new DespegarPageVisible();
	}
	
	public static DespegarPageVisible page() {
		return new DespegarPageVisible();
	}

}
