package com.mightyjava.after.advanced;

public class Main {
	public static void main(String[] args) {
		Service service = new ServiceImpl("James");
		Dependent dependent = new Dependent();
		dependent.setService(service);
		System.out.println(dependent.sayHello());
	}
}
