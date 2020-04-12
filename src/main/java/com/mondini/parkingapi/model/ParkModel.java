package com.mondini.parkingapi.model;

public class ParkModel {
	
	private String in;
	
	private String out;
	
	private String Appartament;
	
	private String day;

	public ParkModel(String in, String out, String appartament, String day) {
		super();
		this.in = in;
		this.out = out;
		Appartament = appartament;
		this.day = day;
	}
	
	public ParkModel() {}

	public String getIn() {
		return in;
	}

	public void setIn(String in) {
		this.in = in;
	}

	public String getOut() {
		return out;
	}

	public void setOut(String out) {
		this.out = out;
	}

	public String getAppartament() {
		return Appartament;
	}

	public void setAppartament(String appartament) {
		Appartament = appartament;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

}
