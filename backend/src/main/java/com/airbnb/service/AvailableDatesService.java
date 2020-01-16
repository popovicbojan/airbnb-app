package com.airbnb.service;

import java.util.List;

import com.airbnb.model.Apartment;
import com.airbnb.model.AvailableDates;

public interface AvailableDatesService {
	
	AvailableDates findOne(Long id);
	AvailableDates findByApartment(Apartment a);
	List<AvailableDates> findAll();
	AvailableDates save(AvailableDates availableDates);
	AvailableDates delete(Long id);

}
