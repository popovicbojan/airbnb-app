package com.airbnb;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airbnb.model.Apartment;
import com.airbnb.model.ApartmentType;
import com.airbnb.model.Host;
import com.airbnb.service.ApartmentService;
import com.airbnb.service.ApartmentTypeService;
import com.airbnb.service.HostService;

@Component
public class TestData {

	@Autowired
	public ApartmentService apartmentService;
	
	@Autowired
	public ApartmentTypeService apartmentTypeService;
	
	@Autowired
	public HostService hostService;
	
	@PostConstruct
	public void init() {
		
		//Apartment Types
		ApartmentType t1 = new ApartmentType();
		t1.setType("room");
		
		apartmentTypeService.save(t1);
		
		ApartmentType t2 = new ApartmentType();
		t2.setType("apartment");
		
		apartmentTypeService.save(t2);
		
		
		//Apartment Hosts
		Host h1 = new Host();
		h1.setName("Marko");
		h1.setLastName("Markovic");
		hostService.save(h1);
		

		Apartment a1 = new Apartment();
		a1.setNumberOfGuest(4);
		a1.setNumberOfRooms(2);
		a1.setPricePerNight(2500);
		
		a1.setHost(h1);
		a1.setType(t1);
		
		apartmentService.save(a1);
	}
	
}
