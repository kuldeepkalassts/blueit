package com.kk.blueit;

import config.BlueitProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigurationProperties({BlueitProperties.class})
public class BlueitApplication {

	@Autowired
	private BlueitProperties blueitProperties;


	public static void main(String[] args) {
		SpringApplication.run(BlueitApplication.class, args);
		System.out.println("Welcome to application ");
	}

	// we can do things when spring application is started
	@Bean
	@Profile("dev")
	CommandLineRunner runner(){
		return args -> {
			System.out.println("welcome message is "+blueitProperties.getWelcomeMessage());

		};
	}
}

