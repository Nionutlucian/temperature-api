package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Temperature;

@Service
public class TemperatureService {

	Temperature temperature = new Temperature();

	public Temperature getTemperature() {
		temperature.setIndoorTemperature("21°C");
		return temperature;
	}
	
}
