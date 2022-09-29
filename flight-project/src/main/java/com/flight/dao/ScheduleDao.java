package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.dto.Schedule;

@Repository
public interface ScheduleDao extends JpaRepository<Schedule,Long> {

}
