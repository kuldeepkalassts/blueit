package com.kk.blueit;

import com.kk.blueit.config.BaseProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class BlueitApplication {

	@Autowired
	@Lazy
	BaseProperties baseProperties;

	public static void main(String[] args) {
		SpringApplication.run(BlueitApplication.class, args);
		System.out.println("Welcome to application");
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			System.out.println("base propertes "+baseProperties.getTestPropertiesString());
		};
	}

	@Bean
	@ConfigurationProperties(prefix="baseproperties")
	BaseProperties baseProperties(){
		return new BaseProperties();
	}

}


