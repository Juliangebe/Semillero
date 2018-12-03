	package com.despegar.certification.despegar.tasks;

import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.ADDRESS_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.ADULT_IDENTIFICATION_CARD_NUMBER_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.ADULT_LASTNAME_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.ADULT_NAME_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.BANCOLOMBIA_CREDIT_CARD;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.BANCOLOMBIA_CREDIT_CARD_MASTERCARD;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.BUY_BUTTON;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.CARD_HOLDER_IDENTIFICATION_NUMBER_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.CARD_HOLDER_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.CELL_PHONE_NUMBER_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.COMFIRM_EMAIL_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.CREDIT_CARD_NUMBER_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.CREDIT_CARD_RADIO_BUTTON;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.CREDIT_CARD_TYPE;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.EMAIL_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.EXPIRATION_MONTH_BUTTON;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.EXPIRATION_YEAR_BUTTON;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.IDENTIFICATION_CARDNUMBER_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.LASTNAME_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.NAME_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.NUMBER_OF_FEES;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.PHONE_AREA_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.SECURITY_CODE_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.SELECT_EXPIRATION_MONTH;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.SELECT_EXPIRATION_YEAR;
import static com.despegar.certification.despegar.userinterfaces.PaymentDetails.TERMS_AND_CONDITIONS_CHECKBOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.despegar.certification.despegar.models.RegisterModel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class CompleteYour implements Task { //Task es una interfaz(entidad de java que solo contiene las firmas de los metodos , no las implementaciones)
	//Es hijo de performable (lo que recibe el wasAbleTo)
	
	// modelo de persona con sus datos personales
			private RegisterModel registerModel;
			
			// constructor de la tarea
			public CompleteYour(RegisterModel registerModel) {
				this.registerModel = registerModel;
			}

	@Override
	@Step("{0}  complete the data fields")
	public <T extends Actor> void performAs(T actor) {//el metodo performAs no devuelve nada y recibe actor con las interacciones
		actor.attemptsTo(Click.on(CREDIT_CARD_RADIO_BUTTON));//Clic en el radio button
		actor.attemptsTo(Click.on(CREDIT_CARD_TYPE));//Clic en escoger el tipo de tarjeta de credito
		actor.attemptsTo(Click.on(BANCOLOMBIA_CREDIT_CARD));//Clic en la tarjeta de credito bancolombia
		actor.attemptsTo(Click.on(BANCOLOMBIA_CREDIT_CARD_MASTERCARD));//Clic en tarjeta de credito bancolombia mastercard
		actor.attemptsTo(Click.on(NUMBER_OF_FEES));//Clic en numero de cuotas
		actor.attemptsTo(Click.on(EXPIRATION_MONTH_BUTTON));//Clic en la lista mes de expiracion
		actor.attemptsTo(Click.on(SELECT_EXPIRATION_MONTH));//Se selecciona el mes de expiracion
		actor.attemptsTo(Click.on(EXPIRATION_YEAR_BUTTON));//Clic en la lista año de expiracion
		actor.attemptsTo(Click.on(SELECT_EXPIRATION_YEAR));//Se selecciona el año de expiracion
		actor.attemptsTo(Enter.theValue(registerModel.getCreditCardNumber()).into(CREDIT_CARD_NUMBER_TEXTBOX));//ingresa el numero de la tarjeta de credito
		actor.attemptsTo(Enter.theValue(registerModel.getSecurityCode()).into(SECURITY_CODE_TEXTBOX));//ingresa el codigo de seguridad de la tdc
		actor.attemptsTo(Enter.theValue(registerModel.getCardHolder()).into(CARD_HOLDER_TEXTBOX));//ingresa el nombre del titular de la tdc
		actor.attemptsTo(Enter.theValue(registerModel.getCardHolderDocument()).into(CARD_HOLDER_IDENTIFICATION_NUMBER_TEXTBOX));//ingresa el numero de cedula del titular
		actor.attemptsTo(Enter.theValue(registerModel.getName()).into(NAME_TEXTBOX));//ingresa el nombre del titular
		actor.attemptsTo(Enter.theValue(registerModel.getLastName()).into(LASTNAME_TEXTBOX));//ingresa el apellido del titular
		actor.attemptsTo(Enter.theValue(registerModel.getIdentificationCard()).into(IDENTIFICATION_CARDNUMBER_TEXTBOX));//ingresa el numero de indentificacion del titular
		actor.attemptsTo(Enter.theValue(registerModel.getAddress()).into(ADDRESS_TEXTBOX));//ingresa la direccion del titular
		actor.attemptsTo(Enter.theValue(registerModel.getAdultName()).into(ADULT_NAME_TEXTBOX));//ingresa el nombre del adulto
		actor.attemptsTo(Enter.theValue(registerModel.getAdultLastName()).into(ADULT_LASTNAME_TEXTBOX));//ingresa el apellido del adulto
		actor.attemptsTo(Enter.theValue(registerModel.getAdultidentificationCard()).into(ADULT_IDENTIFICATION_CARD_NUMBER_TEXTBOX));//ingresa el numero de cedula del adulto
		actor.attemptsTo(Enter.theValue(registerModel.getEmail()).into(EMAIL_TEXTBOX));//ingresa el email
		actor.attemptsTo(Enter.theValue(registerModel.getComfirmEmail()).into(COMFIRM_EMAIL_TEXTBOX));//Ingresa de nuevo el email
		actor.attemptsTo(Enter.theValue(registerModel.getArea()).into(PHONE_AREA_TEXTBOX));//ingresa codigo de area del numero de celular
		actor.attemptsTo(Enter.theValue(registerModel.getCellPhoneNumber()).into(CELL_PHONE_NUMBER_TEXTBOX));//ingresa el numero de celular
		actor.attemptsTo(Click.on(TERMS_AND_CONDITIONS_CHECKBOX));//Clic en aceptar terminos y condiciones
		actor.attemptsTo(Click.on(BUY_BUTTON));//Clic en el boton comprar
	}// metodo que llama al instrumented que crea una instancia en tiempo de
	// ejecución, con el parametro de tipo registerModel
	public static CompleteYour data(RegisterModel registerModel ) {
		return instrumented(CompleteYour.class, registerModel);
	}//instrumented permite crear una instancia de la clase , para el informe ,debug, hallazgode errores en tareas
	//el atributo que llega al metodo on tiene que ser igual al del contructor
	
	

}
