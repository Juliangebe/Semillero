package com.despegar.certification.despegar.exceptions;
//assert sirve para aseverar que en un determinado momento del código una determinada condición debe ser cierta
public class WithoutConnectionToTheNetwork extends AssertionError {
	//Excepción para controlar la conexión a internet
	private static final long serialVersionUID = 1L;
	private static final String ERROR_NETWORK_CONNECTION = "Without connection to the network";

	public static String getErrorNetworkMessage() {
		return ERROR_NETWORK_CONNECTION;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public WithoutConnectionToTheNetwork(String message, Throwable cause) {
		super(message, cause);
	}

}
