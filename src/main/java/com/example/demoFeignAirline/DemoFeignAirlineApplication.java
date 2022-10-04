package com.example.demoFeignAirline;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoFeignAirlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignAirlineApplication.class, args);
	}

}
