package com.mondini.parkingapi.model;


public class PersonModel {
	
	private String name;
	private String rut;
	private String phone;
	
	public PersonModel(String name, String rut, String phone) {
		super();
		this.name = name;
		this.rut = rut;
		this.phone = phone;
	}
	
	public PersonModel() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
