package com.flight.service;

import java.util.List;


import com.flight.dto.Schedule;

public interface ScheduleService {
	Schedule saveSchedule(Schedule schedule);
	Schedule getScheduleById(long scheduleId);
	List<Schedule> getAllSchedule();
	 Schedule updateSchedule(Schedule schedule,long scheduleId);

}
