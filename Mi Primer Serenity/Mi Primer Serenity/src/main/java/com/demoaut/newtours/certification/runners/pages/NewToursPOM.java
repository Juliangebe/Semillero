//POM Utilizando Page Factory

package com.demoaut.newtours.certification.runners.pages;

import org.openqa.selenium.WebElement;

//Librer�a para usar la clase By
import net.serenitybdd.core.annotations.findby.FindBy;
//Librer�a para heredar la clase PageObject
import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.DefaultUrl;
//Aqui termina la importaci�n de las librer�as
@DefaultUrl("http://newtours.demoaut.com/")

public class NewToursPOM extends PageObject {

	//Mapiar la p�gina, declaraci�n de los elementos html
	
	@FindBy(name="userName")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="login")
	WebElement btnLogin;
	
	public void writeData(String user, String password) {
		
		this.txtUserName.sendKeys(user);
		this.txtPassword.sendKeys(password);

	}

	public void sendData(String user, String password) {
		this.btnLogin.click();
	}
}
