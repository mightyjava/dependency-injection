package com.mightyjava.before;

public class ServiceImpl implements Service {
	private String name;
	
	public ServiceImpl(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
