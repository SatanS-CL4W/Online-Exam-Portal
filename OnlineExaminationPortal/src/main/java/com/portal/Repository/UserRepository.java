package com.portal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	
}
