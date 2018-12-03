package com.despegar.certification.despegar.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.despegar.com")
public class DespegarHomePage extends PageObject{
	
	//Acá se encuentran mapeados los xpath de los campos de la pagina principal
	public static final Target EMERGENT_WINDOW = Target.the("Close the emergent window ").located(By.xpath("//span[@class='as-login-close as-login-icon-close-circled']"));
	public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.xpath("//*[@id=\"loginButton\"]/span/span[1]"));
	public static final Target FACEBOOK_LOGIN_BUTTON = Target.the("Facebook Login button").located(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div/div[4]/div[1]/a/em"));
	public static final Target FACEBOOK_EMAIL_TEXTBOX= Target.the("facebook email textbox").located(By.xpath("//*[@id=\"email\"]"));
	public static final Target FACEBOOK_PASSWORD_TEXTBOX= Target.the("facebook password textbox").located(By.xpath("//*[@id=\"email\"]"));	
	public static final Target FLIGHTS_BUTTON = Target.the("Press the flights button").located(By.xpath("//a[@title='Vuelos']"));
	public static final Target DESTINY_TEXTBOX = Target.the("Click on destiny text area").located(By.xpath("//div[@class='sbox-3-input -md -no-border sbox-3-validation -top-right sbox-destination-container sbox-bind-error-flight-roundtrip-destination-empty sbox-bind-error-flight-roundtrip-equal-destination']//input[@placeholder='Ingresa hacia dónde viajas']"));
	public static final Target ORIGIN_TEXTBOX = Target.the("Click on origin text area").located(By.xpath("//div[@class='sbox-3-input -md -no-border sbox-3-validation -top-right sbox-origin-container places-inline sbox-bind-error-flight-roundtrip-origin-empty']//input[@placeholder='Ingresa desde dónde viajas']"));
	public static final Target DEPARTURE_BUTTON = Target.the("Click on  departure button").located(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input"));
	public static final Target DESTINY_CITY_OPTION_SHOWED = Target.the("Click on destiny city option showed").located(By.xpath("//li[@class='item -active']"));
	public static final Target SELECT_DEPARTURE_DATE = Target.the("Click on departure date").located(By.xpath("/html/body/div[4]/div/div[5]/div[2]/div[4]/span[13]"));
	public static final Target SELECT_RETURN_DATE = Target.the("Select the return date").located(By.xpath("/html/body/div[4]/div/div[5]/div[2]/div[4]/span[14]"));
	public static final Target SEARCH_BUTTON = Target.the("Click on search button").located(By.xpath("//div[@class='sbox-dates-distri-container']//a[@class='sbox-3-btn -secondary -md sbox-search']"));	
	public static final Target ORIGIN_CITY_OPTION_SHOWED = Target.the("Click on origin city option showed").located(By.xpath("//div[@class='ac-container']//div[2]//ul[1]//li[1]"));

}
