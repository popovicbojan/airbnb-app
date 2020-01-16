package com.airbnb.service;

import java.util.List;

import com.airbnb.model.Address;
import com.airbnb.model.Location;

public interface LocationService {
	
	Location findOne(Long id);
	Location findByAddress(Address a);
	List<Location> findAll();
	Location save(Location location);
	Location delete(Long id);

}
