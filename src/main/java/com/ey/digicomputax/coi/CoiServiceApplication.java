package com.ey.digicomputax.coi;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class CoiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoiServiceApplication.class, args);
	}

}
