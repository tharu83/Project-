package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.dto.Airport;

public interface AirportDao extends JpaRepository<Airport,Integer> {

}
