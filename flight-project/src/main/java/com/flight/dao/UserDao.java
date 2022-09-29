package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.dto.User;

@Repository
public interface UserDao extends JpaRepository<User,Long>{

}
