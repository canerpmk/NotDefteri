package com.example.notdefteri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class 	NotDefteriApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotDefteriApplication.class, args);
	}

}
