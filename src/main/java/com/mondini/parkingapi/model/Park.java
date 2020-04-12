package com.mondini.parkingapi.model;

import lombok.Getter;
import lombok.Setter;

public class Park {
	
	@Getter @Setter
	private String in;
	
	@Getter @Setter
	private String out;
	
	@Getter @Setter
	private String Appartament;
	
	@Getter @Setter
	private String day;

	public Park(String in, String out, String appartament, String day) {
		super();
		this.in = in;
		this.out = out;
		Appartament = appartament;
		this.day = day;
	}
	
	public Park() {}

}
