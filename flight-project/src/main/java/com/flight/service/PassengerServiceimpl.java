package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.dao.PassengerDao;
import com.flight.dto.Passenger;
import com.flight.exception.FlightNotAvailableException;

@Service
public class PassengerServiceimpl implements PassengerService {
	private PassengerDao passengerDao;
	

	public PassengerServiceimpl(PassengerDao passengerDao) {
		super();
		this.passengerDao = passengerDao;
	}

	@Override
	public Passenger savePassenger(Passenger passenger) {
		
		return passengerDao.save(passenger);
	}

	@Override
	public Passenger updatePassenger(Passenger passenger, long passengerid) {
	
		Passenger existingPassenger = passengerDao.findById(passengerid).orElseThrow( ()->
		new FlightNotAvailableException("Passenger" , "ID", passengerid));
		existingPassenger.setPassengerName(passenger.getPassengerName());
		existingPassenger.setPassengerAge(passenger.getPassengerAge());
		existingPassenger.setPassengerUIN(passenger.getPassengerUIN());
		existingPassenger.setLuggage(passenger.getLuggage());
		passengerDao.save(existingPassenger);
		return existingPassenger;
	}

	@Override
	public void deletePassenger(long passengerid) {
		passengerDao.findById(passengerid).orElseThrow( ()->
		new FlightNotAvailableException("Passenger", "ID" , passengerid));
		passengerDao.deleteById(passengerid);
		
	}

	@Override
	public List<Passenger> displayAllPassenger() {
		
		return passengerDao.findAll();
	}

	@Override
	public Passenger findPassengerById(long passengerid) {
		return passengerDao.findById(passengerid).orElseThrow( ()->
		new FlightNotAvailableException("Passenger", "ID" , passengerid));
	}

}
