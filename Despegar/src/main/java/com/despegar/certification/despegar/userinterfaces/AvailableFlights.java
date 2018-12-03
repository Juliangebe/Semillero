package com.despegar.certification.despegar.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://www.despegar.com.co/shop/flights/results/roundtrip/MDE/BAQ/2018-12-13/2018-12-14/1/0/0/NA/NA/NA/NA/NA?from=SB&di=1-0") //url por defecto
public class AvailableFlights extends PageObject {
	
	//Acá se encuentran mapeados los xpath de los campos de la pagina en los vuelos disponibles
	public static final Target PRICE_OPTION = Target.the("Finding the price option ").located(By.xpath("//li[@class='dropdown-item priceRange']//span[@class='dropdown-item-container']"));
	public static final Target SEARCH_OPTION= Target.the("Finding the searchhh option ").located(By.xpath("//div[@class='sbox-button-default']//em[@class='btn-text'][contains(text(),'Buscar')]"));
	public static final Target SELECT_BUY_OPTION_BUTTON= Target.the("Buy options ").located(By.xpath("//*[@id=\"clusters\"]/span[6]/span/cluster/div/div/div/span/fare/span/span/div[2]/buy-button/a"));
	
	
	
}	
