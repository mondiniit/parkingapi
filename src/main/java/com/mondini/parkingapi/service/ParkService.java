package com.mondini.parkingapi.service;

import java.util.List;
import java.util.Optional;

import com.mondini.parkingapi.entity.Park;
import com.mondini.parkingapi.model.CarModel;
import com.mondini.parkingapi.model.ParkModel;
import com.mondini.parkingapi.model.PersonModel;

public interface ParkService {

	public abstract List<Park> getVisitor();
	
	public abstract Optional<Park> getVisitor(PersonModel person);
	
	public abstract ParkModel addVisitor(ParkModel parkModel, PersonModel personModel, CarModel carModel);
}
