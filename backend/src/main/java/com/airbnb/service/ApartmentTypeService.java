package com.airbnb.service;

import java.util.List;

import com.airbnb.model.ApartmentType;

public interface ApartmentTypeService {
	
	ApartmentType findOne(Long id);
	List<ApartmentType> findAll();
	ApartmentType save(ApartmentType ApartmentType);
	ApartmentType delete(Long id);

}
