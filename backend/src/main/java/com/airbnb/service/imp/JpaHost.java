package com.airbnb.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airbnb.model.Host;
import com.airbnb.repository.HostRepository;
import com.airbnb.service.HostService;

@Service
public class JpaHost implements HostService{
	
	@Autowired
	private HostRepository hostRepository;

	@Override
	public Host findHostByUsername(String username) {
		return hostRepository.findHostByUsername(username);
	}

	@Override
	public List<Host> findAll() {
		return hostRepository.findAll();
	}

	@Override
	public Host save(Host host) {
		return hostRepository.save(host);
	}

	@Override
	public Host delete(Long id) {
		
		Host toDelete = hostRepository.findOne(id);
		
		if(toDelete != null) {
			hostRepository.delete(toDelete);
		}
		
		return toDelete;
	}

	@Override
	public Host findOne(Long id) {
		return hostRepository.findOne(id);
	}
	
	

}
