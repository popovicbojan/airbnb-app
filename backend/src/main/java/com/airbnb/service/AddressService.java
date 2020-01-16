package com.airbnb.service;

import java.util.List;

import com.airbnb.model.Address;

public interface AddressService {

	Address findOne(Long id);
	List<Address> findAll();
	Address save(Address address);
	Address delete(Long id);
	
}
