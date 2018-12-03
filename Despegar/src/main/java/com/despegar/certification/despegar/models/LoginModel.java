package com.despegar.certification.despegar.models;

public class LoginModel {
	//clase que contiene los metodos para obtener el usuario  y contraseņa
	private String userName; // usuario para inicar sesion
	private String password; // contraseņa para iniciar sesion
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public LoginModel(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	

}
