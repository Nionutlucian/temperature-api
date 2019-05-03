package com.example.indoortemperature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.example.handler.TemperatureHandler;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.model"})
@ComponentScan({"com.example.controller","com.example.service","resources"})
public class IndoortemperatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndoortemperatureApplication.class, args);
	}

}
