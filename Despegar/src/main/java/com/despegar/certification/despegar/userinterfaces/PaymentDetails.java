package com.despegar.certification.despegar.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaymentDetails extends PageObject {

	//Acá se encuentran mapeados los xpath de los campos de la pagina en el detalle de compra y las opciones  de pago
	public static final Target CREDIT_CARD_RADIO_BUTTON = Target.the("Select the credit card option ").located(By.xpath(
			"//*[@id=\"checkout-content\"]/div[1]/payment-component/payment-method-selector/div/ul/li[1]/p/label/i"));
	public static final Target CREDIT_CARD_TYPE = Target.the("Select the credit card type ").located(By.xpath(
			"//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/payment-method/div/prepaid-payment-container/div/div/card-container/div/card-storage/div/card-empty-slot/div/div[1]/span[1]/span"));
	public static final Target BANCOLOMBIA_CREDIT_CARD = Target.the("Select the bancolombia bank option").located(By
			.xpath("//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/payment-method/div/prepaid-payment-container/div/div/card-container/div/card-storage/modal-component/div/div[2]/payment-option-selector/div[2]/ul/li[1]/span/span"));
	public static final Target BANCOLOMBIA_CREDIT_CARD_MASTERCARD = Target.the("select MasterCard ").located(By.xpath(
			"//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/payment-method/div/prepaid-payment-container/div/div/card-container/div/card-storage/modal-component/div/div[2]/payment-option-selector/div[2]/ul/li[2]/span/span"));
	public static final Target NUMBER_OF_FEES = Target.the("select the number of fees ").located(By.xpath(
			"//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/payment-method/div/prepaid-payment-container/div/div/card-container/div/card-storage/modal-component/div/div[2]/payment-option-selector/div[2]/ul/li[1]"));
	public static final Target CREDIT_CARD_NUMBER_TEXTBOX = Target.the("Write the credit card number  ")
			.located(By.xpath("//*[@id=\"card-number-0\"]"));
	public static final Target SECURITY_CODE_TEXTBOX = Target.the("Write the credit security code number  ")
			.located(By.xpath("//*[@id=\"card-security-code-0\"]"));
	public static final Target EXPIRATION_YEAR_BUTTON = Target.the("The combo box month")
			.located(By.xpath("//select[@id='expiration-year-0']"));
	public static final Target SELECT_EXPIRATION_YEAR = Target.the("The month option")
			.located(By.xpath("//option[@value='2020']"));
	public static final Target EXPIRATION_MONTH_BUTTON = Target.the("The combo box month")
			.located(By.xpath("//*[@id=\"expiration-month-0\"]"));
	public static final Target SELECT_EXPIRATION_MONTH = Target.the("The month option")
			.located(By.xpath("//option[@value='5']"));

	public static final Target CARD_HOLDER_TEXTBOX = Target.the("Write the card holder name")
			.located(By.xpath("//*[@id=\"card-holder_name-0\"]"));
	public static final Target CARD_HOLDER_IDENTIFICATION_NUMBER_TEXTBOX = Target
			.the("Write the card holder indentification number  ")
			.located(By.xpath("//*[@id=\"card-holder-identification-number0\"]"));
	public static final Target NAME_TEXTBOX = Target.the("Write the name ")
			.located(By.xpath("//*[@id=\"invoice-first-name-0\"]"));
	public static final Target LASTNAME_TEXTBOX = Target.the("Write the lastname ")
			.located(By.xpath("//*[@id=\"invoice-last-name-0\"]"));
	public static final Target IDENTIFICATION_CARDNUMBER_TEXTBOX = Target.the("Write the identification card number ")
			.located(By.xpath("//*[@id=\"invoice-fiscal-identification-number-0\"]"));
	public static final Target ADDRESS_TEXTBOX = Target.the("Write the address ")
			.located(By.xpath("//*[@id=\"invoice-fiscal-address-street-0\"]"));
	public static final Target ADULT_NAME_TEXTBOX = Target.the("Write the name ")
			.located(By.xpath("//*[@id=\"traveler-first-name-0\"]"));
	public static final Target ADULT_LASTNAME_TEXTBOX = Target.the("Write the lastname ")
			.located(By.xpath("//*[@id=\"traveler-last-name-0\"]"));
	public static final Target ADULT_IDENTIFICATION_CARD_NUMBER_TEXTBOX = Target
			.the("Write the identification card number ")
			.located(By.xpath("//*[@id=\"traveler-identification-number-0\"]"));
	public static final Target EMAIL_TEXTBOX = Target.the("Write the email ")
			.located(By.xpath("//*[@id=\"contact-email\"]"));
	public static final Target COMFIRM_EMAIL_TEXTBOX = Target.the("Write the email again ")
			.located(By.xpath("//*[@id=\"contact-email-repeat\"]"));
	public static final Target PHONE_AREA_TEXTBOX = Target.the("Write the phone area number ")
			.located(By.xpath("//*[@id=\"phone-area-code-0\"]"));
	public static final Target CELL_PHONE_NUMBER_TEXTBOX = Target.the("Write the cellphone number ")
			.located(By.xpath("//*[@id=\"phone-number-code-0\"]"));
	public static final Target TERMS_AND_CONDITIONS_CHECKBOX= Target.the("Press the terms and conditions checkbox")
			.located(By.xpath("//*[@id=\"checkout-content\"]/div[1]/buy-component/div/div/ol/li/checkbox-component/span/label/i"));
	public static final Target BUY_BUTTON = Target.the("Press the buy button ")
			.located(By.xpath("//*[@id=\"buy-button\"]"));
	
}
