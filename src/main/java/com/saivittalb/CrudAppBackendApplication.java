package com.saivittalb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saivittalb.entities.User;
import com.saivittalb.repositories.UserRepository;

@SpringBootApplication
public class CrudAppBackendApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudAppBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Sai", "Vittal"));
		userRepository.save(new User("Harry", "Potter"));
		userRepository.save(new User("Sheldon", "Cooper"));
	}
}
