package com.mondini.parkingapi.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mondini.parkingapi.model.ParkModel;




@Controller
@RequestMapping("/park")
public class ParkController {
	
	private static final Log LOG = LogFactory.getLog(ParkController.class);
	
	//ADDIN
	@PostMapping("/addin")
	public void addIn(@ModelAttribute(name="park") ParkModel parkModel) {
		LOG.info("--ADD-IN");
	}
	
	//ADDOut
	@PostMapping("/remove")
	public void remove(@ModelAttribute(name="park") ParkModel parkModel) {
		LOG.info("--REMOVE");
	}
	
	//List
	@GetMapping("/entrances")
	public List<ParkModel> getAllParks(){
		
		return null;
	}
	

}
