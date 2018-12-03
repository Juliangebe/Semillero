package com.despegar.certification.despegar.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.despegar.certification.despegar.userinterfaces.PaymentDetails;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DespegarRegisterResult implements Question<Boolean> {
	//Clase Question para verificar la compra del actor
	@Override
	public Boolean answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return the(PaymentDetails.BUY_BUTTON).answeredBy(actor).isCurrentlyVisible();
	 //verifica si el boton de comprar es visible
	}
	public static Question<Boolean> isVisible() {
		return new DespegarRegisterResult();
	}
	
	public static DespegarRegisterResult page() {
		return new DespegarRegisterResult();
	}
	
}
