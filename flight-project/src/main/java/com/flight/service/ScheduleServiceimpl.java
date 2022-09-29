package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.flight.dao.ScheduleDao;
import com.flight.dto.Schedule;
import com.flight.exception.FlightNotAvailableException;

@Service
public class ScheduleServiceimpl implements ScheduleService{
	private ScheduleDao scheduledao;

	public ScheduleServiceimpl(ScheduleDao scheduledao) {
		super();
		this.scheduledao = scheduledao;
	}

	@Override
	public Schedule saveSchedule(Schedule schedule) {
		
		return scheduledao.save(schedule);
	}

	@Override
	public Schedule getScheduleById(long scheduleId) {
		
		return scheduledao.findById(scheduleId).orElseThrow(()->new  FlightNotAvailableException("Schedule","Id",scheduleId));
	}

	@Override
	public List<Schedule> getAllSchedule() {
		
		return scheduledao.findAll();
	}

	@Override
	public Schedule updateSchedule(Schedule schedule, long scheduleId) {
		Schedule existingschedule=scheduledao.findById(scheduleId).orElseThrow(()->new  FlightNotAvailableException("Schedule","Id",scheduleId));
		existingschedule.setSourceAirport(schedule.getSourceAirport());
		existingschedule.setDestinationAirport(schedule.getDestinationAirport());
		existingschedule.setArrivaltime(schedule.getArrivaltime());
		existingschedule.setDepartureTime(schedule.getDepartureTime());
		scheduledao.save(existingschedule);
		return existingschedule;
	}
	
	

}
