package com.mondini.parkingapi.model;

import lombok.Getter;
import lombok.Setter;

public class Car {
	
	@Getter @Setter
	private String model;
	
	@Getter @Setter
	private String color;
	
	@Getter @Setter
	private String pathent;
	
	public Car(String model, String color, String pathent) {
		super();
		this.model = model;
		this.color = color;
		this.pathent = pathent;
	}
	public Car() {}
	
	
}
