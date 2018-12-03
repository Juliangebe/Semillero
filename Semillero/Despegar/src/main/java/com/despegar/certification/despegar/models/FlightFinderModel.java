package com.despegar.certification.despegar.models;

public class FlightFinderModel {
	//clase que contiene el modelo para obtener la ciudad destino y origen
	private String origin; // ciudad origen
	private String destiny;//ciudad destino

	public FlightFinderModel(String origin, String destiny) {
		this.origin = origin;
		this.destiny = destiny;

	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestiny() {
		return destiny;
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}

}
