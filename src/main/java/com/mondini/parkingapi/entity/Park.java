package com.mondini.parkingapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parks")
public class Park {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="entered")
	private String in;
	
	@Column(name="gone")
	private String out;
	
	@Column(name="day")
	private String day;
	
	@Column(name="visitor")
	private String visitor;
	
	@Column(name="rut")
	private String rut;
	
	@Column(name="appartament")
	private String appartament;
	
	@Column(name="carpatent")
	private String carPatent;

	
	public Park(int id, String in, String out, String day, String visitor, String rut, String appartament,
			String carPatent) {
		super();
		this.id = id;
		this.in = in;
		this.out = out;
		this.day = day;
		this.visitor = visitor;
		this.rut = rut;
		this.appartament = appartament;
		this.carPatent = carPatent;
	}

	public Park() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getVisitor() {
		return visitor;
	}

	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getAppartament() {
		return appartament;
	}

	public void setAppartament(String appartament) {
		this.appartament = appartament;
	}

	public String getCarPatent() {
		return carPatent;
	}

	public void setCarPatent(String carPatent) {
		this.carPatent = carPatent;
	}
	
}
