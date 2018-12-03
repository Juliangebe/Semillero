package com.despegar.certification.despegar.tasks;

import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.EMERGENT_WINDOW;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.FACEBOOK_EMAIL_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.FACEBOOK_LOGIN_BUTTON;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.FACEBOOK_PASSWORD_TEXTBOX;
import static com.despegar.certification.despegar.userinterfaces.DespegarHomePage.LOGIN_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.despegar.certification.despegar.models.LoginModel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Log implements Task {//Task es una interfaz(entidad de java que solo contiene las firmas de los metodos , no las implementaciones)
	//Es hijo de performable (lo que recibe el wasAbleTo)
	
	// modelo del usuario y contraseña 
			private LoginModel loginModel;
			
			// constructor de la tarea
			public Log(LoginModel loginModel) {
				this.loginModel = loginModel;
			}

	@Override
	@Step("{0}  enter the user and password")
	public <T extends Actor> void performAs(T actor) {//el metodo performAs no devuelve nada y recibe actor con las interacciones
		actor.attemptsTo(Click.on(EMERGENT_WINDOW));//cierra el anuncio
		actor.attemptsTo(Click.on(LOGIN_BUTTON));//clic en el boton iniciar sesion
		actor.attemptsTo(Click.on(FACEBOOK_LOGIN_BUTTON));//clic en el boton iniciar sesion
		actor.attemptsTo(Enter.theValue(loginModel.getUserName()).into(FACEBOOK_EMAIL_TEXTBOX));//ingresa el usuario en el campo email
		actor.attemptsTo(Enter.theValue(loginModel.getPassword()).into(FACEBOOK_PASSWORD_TEXTBOX));//ingresa la contraseña en el campo password
		actor.attemptsTo(Click.on(FACEBOOK_LOGIN_BUTTON));//clic en el boton iniciar sesion
	}

	public static Log in(LoginModel loginModel) {
		return instrumented(Log.class, loginModel);
	}//instrumented permite crear una instancia de la clase , para el informe ,debug, hallazgode errores en tareas
	//el atributo que llega al metodo on tiene que ser igual al del contructor

}
