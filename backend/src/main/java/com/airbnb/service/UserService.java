package com.airbnb.service;

import java.util.List;

import com.airbnb.model.User;

public interface UserService {
	
	User findUserByUsername(String username);
	List<User> findAll();
	User save(User user);
	User delete(Long id);

}
