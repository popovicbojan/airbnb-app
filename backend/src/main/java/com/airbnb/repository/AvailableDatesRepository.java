package com.airbnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airbnb.model.AvailableDates;

@Repository
public interface AvailableDatesRepository extends JpaRepository<AvailableDates, Long>{

}
