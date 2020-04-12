package com.mondini.parkingapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="parks")
public class Park {

	@Getter @Setter
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Getter @Setter
	@Column(name="entered")
	private String in;
	
	@Getter @Setter
	@Column(name="gone")
	private String out;
	
	@Getter @Setter
	@Column(name="day")
	private String day;
	
	@Getter @Setter
	@Column(name="visitor")
	private String visitor;
	
	@Getter @Setter
	@Column(name="rut")
	private String rut;
	
	@Getter @Setter
	@Column(name="appartament")
	private String appartament;

	public Park(int id, String in, String out, String day, String visitor, String rut, String appartament) {
		super();
		this.id = id;
		this.in = in;
		this.out = out;
		this.day = day;
		this.visitor = visitor;
		this.rut = rut;
		this.appartament = appartament;
	}
	
	public Park() {}
	
	
}
