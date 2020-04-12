package com.mondini.parkingapi.service;

import com.mondini.parkingapi.entity.Park;

public interface ParkService {

	public abstract Park getVisitor();
	
	public abstract Park getVisitor(String rut);
}
