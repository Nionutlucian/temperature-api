package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Temperature;
import com.example.service.TemperatureService;

@RestController
public class TemperatureController {

	@Autowired
	TemperatureService temperatureService;
	
	Temperature temperature;
	SerialTest serial;
	
	 @RequestMapping(value = "/temperature",method = RequestMethod.GET)
	 public Temperature getTemperature() throws InterruptedException{
		 temperature = new Temperature();
		 serial = new SerialTest();
		 
		 while(!SerialTest.temperatureIsSet) {
			 serial.initialize();
		 }
		 temperature.setIndoorTemperature(serial.temperatureTest);
		 
		return temperature;
	 }	         
}
