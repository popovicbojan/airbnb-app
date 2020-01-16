package com.airbnb.service;

import java.util.List;

import com.airbnb.model.Apartment;
import com.airbnb.model.Picture;

public interface PictureServise {
	
	Picture findOne(Long id);
	List<Picture> findByApartment(Apartment a);
	List<Picture> findAll();
	Picture save(Picture picture);
	Picture delete(Long id);

}
