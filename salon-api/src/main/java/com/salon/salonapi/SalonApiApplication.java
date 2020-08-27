package com.salon.salonapi;

import com.salon.salonapi.config.Salon;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalonApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalonApiApplication.class, args);
	}

	/*
	@Bean
	ApplicationRunner applicationRunner(Salon salon){
		return  args -> {
			System.out.println(salon);
		};
	}

	 */

}
