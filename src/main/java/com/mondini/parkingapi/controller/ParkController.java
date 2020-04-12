package com.mondini.parkingapi.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mondini.parkingapi.entity.Park;
import com.mondini.parkingapi.model.CarModel;
import com.mondini.parkingapi.model.ParkModel;
import com.mondini.parkingapi.model.PersonModel;
import com.mondini.parkingapi.service.ParkService;

@Controller
@RequestMapping("/park")
public class ParkController {

	private static final Log LOG = LogFactory.getLog(ParkController.class);

	@Autowired
	@Qualifier("parkServiceImpl")
	private ParkService parkService;

	// ADDIN
	@PostMapping("/addin")
	public void addIn(@ModelAttribute(name = "park") ParkModel parkModel) {
		
		LOG.info("--ADD-IN");
	}

	// ADDIN
	@PostMapping("/addin/{park}/{car}/{person}")
	public void addIn(@ModelAttribute(name="park") ParkModel parkModel, 
			@ModelAttribute(name="car")CarModel carModel, @ModelAttribute(name="person")PersonModel personModel) {
		parkService.addVisitor(parkModel, personModel, carModel);
	}

	// ADDOut
	@PostMapping("/remove")
	public void remove(@ModelAttribute(name = "park") ParkModel parkModel) {
		LOG.info("--REMOVE");
	}

	// List
	@GetMapping("/entrances")
	public @ResponseBody List<Park> getAllVisitors(){
		return parkService.getVisitor();
	}
	/*
	@GetMapping("/entrances/{rut}")
	public @ResponseBody Park getVisitor(@ModelAttribute(name = "rut") PersonModel personModel){
		return parkService.getVisitor(personModel.getRut()); 
	}
	*/

}
