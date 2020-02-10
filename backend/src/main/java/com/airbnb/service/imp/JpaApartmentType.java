package com.airbnb.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airbnb.model.ApartmentType;
import com.airbnb.repository.ApartmentTypeRepository;
import com.airbnb.service.ApartmentTypeService;

@Service
public class JpaApartmentType implements ApartmentTypeService{
	
	@Autowired
	private ApartmentTypeRepository apartmentTypeRepository;

	@Override
	public ApartmentType findOne(Long id) {
		return apartmentTypeRepository.findOne(id);
	}

	@Override
	public List<ApartmentType> findAll() {
		return apartmentTypeRepository.findAll();
	}

	@Override
	public ApartmentType save(ApartmentType apartmentType) {
		return apartmentTypeRepository.save(apartmentType);
	}

	@Override
	public ApartmentType delete(Long id) {
		
		ApartmentType toDelete = apartmentTypeRepository.findOne(id);
		
		if(toDelete != null) {
			apartmentTypeRepository.delete(toDelete);
		}
		
		return toDelete;
	}

}
