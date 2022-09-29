package com.flight.service;

import java.util.List;

import com.flight.dto.Airport;

public interface AirportService {
	
	 List<Airport>getAllAirport();
	 
	 Airport getAirportById( int airportid);
	 
	 Airport saveAirport(Airport airport);
	 
}
