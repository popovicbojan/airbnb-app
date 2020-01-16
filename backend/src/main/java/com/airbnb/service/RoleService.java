package com.airbnb.service;

import java.util.List;

import com.airbnb.model.Role;

public interface RoleService {
	
	Role findOne(Long id);
	List<Role> findAll();
	Role save(Role role);
	Role delete(Long id);

}
