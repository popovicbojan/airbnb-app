package com.airbnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airbnb.model.ApartmentType;

@Repository
public interface ApartmentTypeRepository extends JpaRepository<ApartmentType, Long>{

}
