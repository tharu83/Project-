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

import com.flight.dto.Flight;
import com.flight.service.FlightService;
import com.flight.service.FlightServiceImpl;


@RestController
@RequestMapping("/flight")
public class FlightController {
	private FlightService flightServiceimpl;

	public FlightController(FlightService flightServiceimpl) {
		super();
		this.flightServiceimpl = flightServiceimpl;
	}
	@PostMapping
	public ResponseEntity<Flight> saveFlight(@RequestBody Flight flight){
		return new  ResponseEntity<Flight> (flightServiceimpl.saveFlight(flight),HttpStatus.CREATED);
		
	}

	@GetMapping("{id}")
	public  ResponseEntity<Flight>  getFlightById(@PathVariable("id") Long flightId ,@RequestBody Flight flight){
		return new  ResponseEntity<Flight>(flightServiceimpl.getFlightById(flightId),HttpStatus.OK);
		
	}
	
	@GetMapping
	public  List<Flight> getAllFlight(){
		return flightServiceimpl.getAllFlight();
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Flight> updateFlight(@PathVariable("id") long flightId,@RequestBody Flight flight){
		return new ResponseEntity<Flight>(flightServiceimpl.updateFlight(flight,flightId),HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteFlight(@PathVariable("id") long flightId){
		flightServiceimpl.deleteFlight(flightId);
		return new ResponseEntity<String>("Flight Successfully!!!",HttpStatus.OK);
	}

}
