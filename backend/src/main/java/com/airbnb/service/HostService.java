package com.airbnb.service;

import java.util.List;

import com.airbnb.model.Host;

public interface HostService{
	
	Host findOne(Long id);
	Host findHostByUsername(String username);
	List<Host> findAll();
	Host save(Host host);
	Host delete(Long id);

}
