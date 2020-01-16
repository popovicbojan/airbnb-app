package com.airbnb.service;

import java.util.List;

import com.airbnb.model.Apartment;
import com.airbnb.model.Comment;
import com.airbnb.model.Guest;

public interface CommentService {
	
	Comment findOne(Long id);
	Comment findByApartment(Apartment a);	
	Comment findByGuest(Guest g);	
	List<Comment> findAll();
	Comment save(Comment comment);
	Comment delete(Long id);

}
