package com.mondini.parkingapi.model;


public class CarModel {
	
	private String model;
	
	private String color;
	
	private String pathent;
	
	public CarModel(String model, String color, String pathent) {
		super();
		this.model = model;
		this.color = color;
		this.pathent = pathent;
	}
	public CarModel() {}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPathent() {
		return pathent;
	}
	public void setPathent(String pathent) {
		this.pathent = pathent;
	}
	
}
