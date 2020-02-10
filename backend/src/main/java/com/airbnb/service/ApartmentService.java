package com.airbnb.service;

import java.util.List;

import com.airbnb.model.Apartment;

public interface ApartmentService {
	
	Apartment findOne(Long id);
	List<Apartment> findAll();
	Apartment save(Apartment apartment);
	Apartment delete(Long id);

}
