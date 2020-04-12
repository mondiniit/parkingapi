package com.mondini.parkingapi.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mondini.parkingapi.component.ParkConverter;
import com.mondini.parkingapi.entity.Park;
import com.mondini.parkingapi.model.CarModel;
import com.mondini.parkingapi.model.ParkModel;
import com.mondini.parkingapi.model.PersonModel;
import com.mondini.parkingapi.repository.ParkRepository;
import com.mondini.parkingapi.service.ParkService;

@Service("parkServiceImpl")
public class ParkServiceImpl implements ParkService{

	
	@Autowired
	@Qualifier("parkRepository")
	private ParkRepository parkRepository;
	
	@Autowired
	@Qualifier("parkConverter")
	private ParkConverter parkConverter;
	
	
	@Override
	public Park getVisitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Park getVisitor(PersonModel personModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParkModel addVisitor(ParkModel parkModel, PersonModel personModel, CarModel carModel) {
		Park park = parkRepository.save(parkConverter.convertParkModel2Park(parkModel, carModel, personModel));
		return parkConverter.convertParkToParkModel(park);
	}

	
	
}
