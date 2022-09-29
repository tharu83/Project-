package com.flight.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dto.Passenger;
import com.flight.service.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	private PassengerService passengerService;

	public PassengerController(PassengerService passengerService) {
		super();
		this.passengerService = passengerService;
	}
	@PostMapping
	public ResponseEntity<Passenger> savePassenger(@RequestBody Passenger passenger){
		return new ResponseEntity<Passenger>
		(passengerService.savePassenger(passenger),HttpStatus.CREATED);
	}
	@PutMapping("{id}")
	public ResponseEntity<Passenger> updatePassenger(@PathVariable("id") long pId, @RequestBody Passenger passenger){
		return new ResponseEntity<Passenger>
		(passengerService.updatePassenger(passenger, pId),HttpStatus.OK);
	}
	@GetMapping
	public List<Passenger> displayAllPassenger(){
		return passengerService.displayAllPassenger();
	}
	@GetMapping("{id}")
	public ResponseEntity<Passenger> findPassengerById(@PathVariable("id") long pId){
		return new ResponseEntity<Passenger>(passengerService.findPassengerById(pId),HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletePassenger(@PathVariable("id") long pId){
		passengerService.deletePassenger(pId);
		return new ResponseEntity<String>
		("Passeneger is deleted",HttpStatus.OK);
	}

}
