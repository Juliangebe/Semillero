package com.demoaut.newtours.certification.runners.pages;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
	//Data
	NewToursPOM page;
	String user= "Estefan�a";
	String password = "99395kkjdfkjh";
	
	//M�todo para abrir la p�gina web
	
	public void openUrl() {
		page.open();
	}

	@Step("Escribiendo datos")
	public void inputData() {
		page.writeData(user,password);
	}

	@Step("Envio los datos")
	public void sendData() {
		page.sendData(user,password);
	}
}
