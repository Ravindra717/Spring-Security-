package com.ravi.Spring_SecurityUsingDB.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ravi.Spring_SecurityUsingDB.entity.userDetails;

@Repository
public interface repo extends JpaRepository<userDetails, Integer> {
	
	public userDetails findByemail(String email);
}
