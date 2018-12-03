package com.despegar.certification.despegar.models;

//Clase que contiene el modelo de registro para completar la compra
public class RegisterModel {
	private String creditCardNumber; //numero de la tdc
	private String securityCode; //codigo de la tdc
	private String cardHolder; //titular de la tdc
	private String cardHolderDocument; //documento del titular
	private String name; // nombre del viajero
	private String lastName;// apellido del viajero
	private String identificationCard; // Numero de cedula del viajero
	private String address; // direccion 
	private String adultName; // nombre del adulto
	private String adultLastName; // nombre del adulto
	private String adultIdentificationCard; // numero cedula del adulto
	private String email;//email
	private String comfirmEmail;//repetir email
	private String area;//codigo de area 
	private String cellPhoneNumber; // numero de telefono 
	private String expirationMonth; // mes de expiracion
	private String expirationYear; // año de expiracion

	public RegisterModel(String creditCardNumber, String securityCode, String cardHolder, String cardHolderDocument,
			String name, String lastName, String identificationCard, String address, String adultName,
			String adultLastName, String adultidentificationCard, String email, String comfirmEmail, String area,
			String cellPhoneNumber, String expirationMonth, String expirationYear) {
		this.creditCardNumber = creditCardNumber;
		this.securityCode = securityCode;
		this.cardHolder = cardHolder;
		this.cardHolderDocument = cardHolderDocument;
		this.name = name;
		this.lastName = lastName;
		this.identificationCard = identificationCard;
		this.address = address;
		this.adultName = adultName;
		this.adultLastName = adultLastName;
		this.adultIdentificationCard = adultidentificationCard;
		this.email = email;
		this.comfirmEmail = comfirmEmail;
		this.area = area;
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public String getCardHolderDocument() {
		return cardHolderDocument;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentificationCard() {
		return identificationCard;
	}

	public String getAddress() {
		return address;
	}

	public String getAdultName() {
		return adultName;
	}

	public String getAdultLastName() {
		return adultLastName;
	}

	public String getAdultidentificationCard() {
		return adultIdentificationCard;
	}

	public String getEmail() {
		return email;
	}

	public String getComfirmEmail() {
		return comfirmEmail;
	}

	public String getArea() {
		return area;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public String getExpirationMonth() {
		return expirationMonth;
	}

	public String getExpirationYear() {
		return expirationYear;
	}

}
