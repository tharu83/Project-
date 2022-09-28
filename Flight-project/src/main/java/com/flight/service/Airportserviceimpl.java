package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.dao.AirportDao;
import com.flight.dto.Airport;
import com.flight.exception.FlightNotAvailableException;
@Service
public class Airportserviceimpl implements Airportservice {
	private AirportDao airportDao;
	

	public Airportserviceimpl(AirportDao airportDao) {
		super();
		this.airportDao = airportDao;
	}

	@Override
	public List<Airport> getAllAirport() {
		// TODO Auto-generated method stub
		return airportDao.findAll();
	}

	@Override
	public Airport getAirportById(int airportid) {
		// TODO Auto-generated method stub
		return airportDao.findById(airportid).orElseThrow(()->
		new FlightNotAvailableException("Airport","Id",airportid));
	}

	@Override
	public Airport saveAirport(Airport airport) {
		// TODO Auto-generated method stub
		return airportDao.save(airport);
	}

}
