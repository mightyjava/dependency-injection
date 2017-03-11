package com.mightyjava.before;

//this class is tightly coupled because dependent of "service"
public class Dependent {
	private Service service;

	public Dependent() {
		service = new ServiceImpl("James");
	}

	public String sayHello() {
		return "Hello " + service.getName();
	}
}
