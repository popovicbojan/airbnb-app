package com.airbnb.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.airbnb.model.Apartment;
import com.airbnb.web.dto.ApartmentDTO;

@Component
public class ApartmentToApartmentDTO implements Converter<Apartment, ApartmentDTO>{

	@Override
	public ApartmentDTO convert(Apartment source) {
		
		ApartmentDTO dto = new ApartmentDTO();
		
		dto.setId(source.getId());
		dto.setApartmentTypeId(source.getType().getId());
		dto.setCheckInTime(source.getCheckInTime());
		dto.setCheckOutTime(source.getCheckOutTime());
		dto.setHostId(source.getHost().getId());
		dto.setNumberOfGuest(source.getNumberOfGuest());
		dto.setNumberOfRooms(source.getNumberOfRooms());
		dto.setPricePerNight(source.getPricePerNight());
		dto.setStatus(source.isStatus());
		
		return dto;
	}
	
	public List<ApartmentDTO> convert(List<Apartment> apartments){
		List<ApartmentDTO> dtos = new ArrayList<ApartmentDTO>();
		
		for(Apartment a : apartments) {
			dtos.add(convert(a));
		}
		
		return dtos;
	}

}
