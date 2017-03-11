package com.mightyjava.after.advanced;

import java.security.InvalidParameterException;

//this class become loosely coupled
public class Dependent implements ServiceInjector {
	private Service service;
	
	@Override
	public void setService(Service service) {
		this.service = service;
	}
	
	private void validateService() {
		if(service == null) {
			throw new InvalidParameterException("service must not be null");
		}
	}

	public String sayHello() {
		validateService();
		return "Hello " + service.getName();
	}
}
