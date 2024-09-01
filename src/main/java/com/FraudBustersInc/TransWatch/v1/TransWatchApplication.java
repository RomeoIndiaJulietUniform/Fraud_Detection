package com.FraudBustersInc.TransWatch.v1;

import com.FraudBustersInc.TransWatch.v1.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class TransWatchApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(TransWatchApplication.class);

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(TransWatchApplication.class, args);
	}

	@Override
	public void run(String... args) {
		try {
			userService.createUser();
			logger.info("User created successfully");
		} catch (Exception e) {
			logger.error("Error creating user", e);
		}
	}
}
