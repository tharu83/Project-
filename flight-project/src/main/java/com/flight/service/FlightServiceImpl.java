package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.dao.FlightDao;
import com.flight.dto.Flight;
import com.flight.exception.FlightNotAvailableException;

@Service
public class FlightServiceImpl implements FlightService{
	private FlightDao flightdao;
	

	public FlightServiceImpl(FlightDao flightdao) {
		super();
		this.flightdao = flightdao;
	}

	@Override
	public Flight saveFlight(Flight flight) {
		
		return flightdao.save(flight);
	}

	@Override
	public Flight getFlightById(long flightId) {
		
		return flightdao.findById(flightId).orElseThrow(()->new  FlightNotAvailableException("Flight","Id",flightId));
	}

	@Override
	public List<Flight> getAllFlight() {
		
		return flightdao.findAll();
	}

	@Override
	public Flight updateFlight(Flight flight, long flightId) {
		  Flight existingflight=flightdao.findById(flightId).orElseThrow( ()->
	        new FlightNotAvailableException("Booking","Id",flightId));
		  existingflight.setCarrierName(flight.getCarrierName());
		  existingflight.setFlightModel(flight.getFlightModel());
		  existingflight.setSeatCapacity(flight.getSeatCapacity());
	        flightdao.save(existingflight);
	        return existingflight;
	
	}

	@Override
	public void deleteFlight(long fligthId) {
		 flightdao.findById(fligthId).orElseThrow( ()->
	        new FlightNotAvailableException("Flight","Id",fligthId));
	        flightdao.deleteById(fligthId);
		
		
	}

}
