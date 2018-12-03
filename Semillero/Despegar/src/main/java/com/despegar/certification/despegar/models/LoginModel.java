package com.despegar.certification.despegar.models;

public class LoginModel {
	//clase que contiene los metodos para obtener el usuario  y contraseña
	private String userName; // usuario para inicar sesion
	private String password; // contraseña para iniciar sesion
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
