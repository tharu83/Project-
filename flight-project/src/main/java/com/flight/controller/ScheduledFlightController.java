package com.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.flight.dto.Schedule;
import com.flight.dto.ScheduledFlight;
import com.flight.service.ScheduledFlightService;

@RestController
@RequestMapping("/ScheduledFlight")
public class ScheduledFlightController {
	@Autowired
	private ScheduledFlightService scheduledFlightService;

	public ScheduledFlightController(ScheduledFlightService scheduledFlightService) {
		super();
		this.scheduledFlightService = scheduledFlightService;
	}
	@PostMapping
	public ResponseEntity<ScheduledFlight> scheduledFlight(@RequestBody ScheduledFlight newScheduledFlight){
		return new ResponseEntity<ScheduledFlight>
		(scheduledFlightService.scheduledFlight(newScheduledFlight), HttpStatus.CREATED);
	}
	@GetMapping
	 public List<ScheduledFlight> viewScheduledFlight(){
		return scheduledFlightService.viewScheduledFlight();
		
	}
	@PutMapping("{scheduledFlightId}")
	public ResponseEntity<ScheduledFlight> modifyScheduledFlight(@PathVariable("scheduledFlightId") long scheduledFlightId,@RequestBody Schedule schedule,Flight flight) {
		
		return new ResponseEntity<ScheduledFlight>(scheduledFlightService.modifyScheduledFlight(flight, schedule, scheduledFlightId),HttpStatus.OK);
		
	}
	@DeleteMapping("{scheduledFlightId}")
	public ResponseEntity<String> deleteScheduledFlight(@PathVariable("scheduledId") long scheduledFlightId){
		scheduledFlightService.deleteScheduledFlight(scheduledFlightId);
		return new ResponseEntity<String>("Flight Successfully!!!",HttpStatus.OK);
	}
	
	

}
