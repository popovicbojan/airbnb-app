package com.airbnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airbnb.model.Host;

@Repository
public interface HostRepository extends JpaRepository<Host, Long>{
	
	Host findHostByUsername(String username);

}
