package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.dao.AirportDao;
import com.flight.dto.Airport;
import com.flight.exception.FlightNotAvailableException;

@Service
public class Airportserviceimpl implements AirportService{
	private AirportDao airportdao;

	public Airportserviceimpl(AirportDao airportdao) {
		super();
		this.airportdao = airportdao;
	}

	@Override
	public List<Airport> getAllAirport() {
		
		return airportdao.findAll();
	}

	@Override
	public Airport getAirportById(int airportid) {

		return airportdao.findById(airportid).orElseThrow(()->
		new FlightNotAvailableException("Airport","Id",airportid));
	}

	@Override
	public Airport saveAirport(Airport airport) {

		return airportdao.save(airport);
	}
	

}
