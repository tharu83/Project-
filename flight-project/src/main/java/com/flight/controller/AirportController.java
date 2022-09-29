package com.flight.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dto.Airport;
import com.flight.service.AirportService;
//import com.flight.service.Airportserviceimpl;

@RestController
@RequestMapping("/Airport")
public class AirportController {
	private AirportService airportserviceimpl;

	public AirportController(AirportService airportserviceimpl) {
		super();
		this.airportserviceimpl = airportserviceimpl;
	}
	@PostMapping
	public ResponseEntity<Airport> saveAirport(@RequestBody Airport airport){
		return new ResponseEntity<Airport>(airportserviceimpl.saveAirport(airport),HttpStatus.CREATED);
		
	}
	@GetMapping
	public List<Airport> getAllAirport(){
		return airportserviceimpl.getAllAirport();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<Airport> getAirportById(@PathVariable("id") int airportid,@RequestBody Airport airport){
		return new ResponseEntity<Airport>(airportserviceimpl.getAirportById(airportid),HttpStatus.OK);
		
	}

}
