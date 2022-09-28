package com.flight.service;

import java.util.List;

import com.flight.dto.Airport;

public interface Airportservice {

         //Get All the Airports
	    List<Airport>getAllAirport();
	    //Get the airport by airportId
	    Airport getAirportById( int airportid);
	    //create 
	    Airport saveAirport(Airport airport);
	    



	}


