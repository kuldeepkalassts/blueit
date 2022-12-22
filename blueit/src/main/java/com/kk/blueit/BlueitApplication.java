package com.kk.blueit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class BlueitApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueitApplication.class, args);
		System.out.println("Welcome to application");
	}

	@Bean
	@Profile("dev")
	CommandLineRunner runner(){
		return args -> {
			System.out.println("This is for dev only");
		};
	}

}


