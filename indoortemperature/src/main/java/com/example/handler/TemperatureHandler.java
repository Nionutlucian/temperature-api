package com.example.handler;

import java.io.BufferedReader;

import gnu.io.SerialPortEvent;

public class TemperatureHandler {

	private static final String PORT_NAMES[] = {"COM4"};
	private BufferedReader input;
	
	
	public synchronized void serialEvent(SerialPortEvent oEvent) {
		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				String inputLine=input.readLine();
				System.out.println(inputLine);
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}
	}

	
	
}
