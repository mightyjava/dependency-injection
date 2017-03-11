package com.mightyjava.after.constructor;

import java.security.InvalidParameterException;

//this class become loosely coupled
public class Dependent {
	private Service service;

	public Dependent(Service service) {
		if(service == null) {
			throw new InvalidParameterException("service must not be null");
		}
		this.service = service;
	}

	public String sayHello() {
		return "Hello " + service.getName();
	}
}
