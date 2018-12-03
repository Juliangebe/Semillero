package com.despegar.certification.despegar.runners;

import org.junit.runner.RunWith;//libreria para usar el runwith que se encarga de correr el test

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;////liberia que contiene el tipo de snippet
import net.serenitybdd.cucumber.CucumberWithSerenity;//librerias para el test e informe de serenity 

@RunWith(CucumberWithSerenity.class)//Ejecuta el test y genera el informe de serenity 
@CucumberOptions(features="src/test/resources/features/login.feature", // Donde está el archivo .feature"
				 glue="com.despegar.certification.despegar.stepdefinitions",//especificar donde van a quedar los stepdefinitions
				 snippets=SnippetType.CAMELCASE)//La notacion de los metodos generados por el feature serà camelcase

public class LoginRunner {

}
