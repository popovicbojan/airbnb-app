package com.airbnb.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airbnb.model.Apartment;
import com.airbnb.repository.ApartmentRepository;
import com.airbnb.service.ApartmentService;

@Service
public class JpaApartmentRepository implements ApartmentService{
	
	@Autowired
	private ApartmentRepository apartmentRepository;

	@Override
	public Apartment findOne(Long id) {
		return apartmentRepository.findOne(id);
	}

	@Override
	public List<Apartment> findAll() {
		return apartmentRepository.findAll();
	}

	@Override
	public Apartment save(Apartment apartment) {
		return apartmentRepository.save(apartment);
	}

	@Override
	public Apartment delete(Long id) {
		
		Apartment toDelete = findOne(id);
		
		if(toDelete != null) {
			apartmentRepository.delete(toDelete);
		}
		
		return toDelete;
	}

}
