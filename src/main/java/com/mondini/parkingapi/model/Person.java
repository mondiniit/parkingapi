package com.mondini.parkingapi.model;

import lombok.Getter;
import lombok.Setter;

public class Person {
	
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String rut;
	@Getter @Setter
	private String phone;
	
	public Person(String name, String rut, String phone) {
		super();
		this.name = name;
		this.rut = rut;
		this.phone = phone;
	}
	
	public Person() {}
	
}
