package com.mightyjava.after.interfacedi;

import java.security.InvalidParameterException;

//this class become loosely coupled
public class Dependent implements ServiceInjector {
	private Service service;
	
	@Override
	public void setService(Service service) {
		if(service == null) {
			throw new InvalidParameterException("service must not be null");
		}
		this.service = service;
	}

	public String sayHello() {
		return "Hello " + service.getName();
	}
}
