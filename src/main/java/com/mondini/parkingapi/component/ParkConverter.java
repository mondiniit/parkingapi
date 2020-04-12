package com.mondini.parkingapi.component;

import org.springframework.stereotype.Component;

import com.mondini.parkingapi.entity.Park;
import com.mondini.parkingapi.model.CarModel;
import com.mondini.parkingapi.model.ParkModel;
import com.mondini.parkingapi.model.PersonModel;

@Component("parkConverter")
public class ParkConverter {
	
	public Park convertParkModel2Park(ParkModel parkModel, CarModel carModel, PersonModel personModel) {
		Park park = new Park();
		park.setIn(parkModel.getIn());
		park.setRut(personModel.getRut());
		park.setVisitor(personModel.getName());
		park.setAppartament(parkModel.getAppartament());
		park.setOut(parkModel.getOut());
		park.setCarPatent(carModel.getPathent());
		park.setDay(parkModel.getDay());
		return park;
	}
	
	public ParkModel convertParkToParkModel(Park park) {
		ParkModel parkModel = new ParkModel();
		parkModel.setAppartament(park.getAppartament());
		parkModel.setDay(park.getDay());
		parkModel.setIn(park.getIn());
		parkModel.setOut(park.getOut());
		return parkModel;
	}
}
