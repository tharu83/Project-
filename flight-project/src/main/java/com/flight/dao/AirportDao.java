package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.dto.Airport;

@Repository
public interface AirportDao extends JpaRepository<Airport,Integer>{

}
