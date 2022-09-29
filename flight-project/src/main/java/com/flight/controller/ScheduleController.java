package com.flight.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dto.Schedule;
import com.flight.service.ScheduleServiceimpl;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	private ScheduleServiceimpl scheduleserviceimpl;

	public ScheduleController(ScheduleServiceimpl scheduleserviceimpl) {
		super();
		this.scheduleserviceimpl = scheduleserviceimpl;
	}
	@PostMapping
	public ResponseEntity<Schedule> saveSchedule(@RequestBody Schedule schedule){
		return new ResponseEntity<Schedule>(scheduleserviceimpl.saveSchedule(schedule),HttpStatus.CREATED);
		
	}
	@GetMapping
	public List<Schedule> getAllSchedule(){
		return scheduleserviceimpl.getAllSchedule();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<Schedule> getScheduleById(@PathVariable("id") Long scheduleid,@RequestBody Schedule schedule){
		return new ResponseEntity<Schedule>(scheduleserviceimpl.getScheduleById(scheduleid),HttpStatus.OK);
		
	}
	@PutMapping("{id}")
	public ResponseEntity<Schedule> updateSchedule(@PathVariable("id") long scheduleid,@RequestBody Schedule schedule){
		return new ResponseEntity<Schedule>(scheduleserviceimpl.updateSchedule(schedule, scheduleid),HttpStatus.OK);
		
	}

}
