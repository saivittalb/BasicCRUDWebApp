package com.saivittalb.repositories;

import com.saivittalb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long>{
	
}