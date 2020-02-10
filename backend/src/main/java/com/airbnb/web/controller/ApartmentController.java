package com.airbnb.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airbnb.model.Apartment;
import com.airbnb.service.ApartmentService;
import com.airbnb.support.ApartmentToApartmentDTO;
import com.airbnb.web.dto.ApartmentDTO;

@RestController
@RequestMapping(value = "/api/apartments")
public class ApartmentController {
	
	@Autowired
	private ApartmentService apartmentService;
	
	@Autowired
	private ApartmentToApartmentDTO toDto;
	
	@RequestMapping(method = RequestMethod.GET)
	private ResponseEntity<List<ApartmentDTO>> getAll(){
		List<Apartment> apartments = apartmentService.findAll();
		
		return new ResponseEntity<>(toDto.convert(apartments), HttpStatus.OK);
	}

}
