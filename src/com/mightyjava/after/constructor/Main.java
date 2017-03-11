package com.mightyjava.after.constructor;

public class Main {
	public static void main(String[] args) {
		Service service = new ServiceImpl("James");
		Dependent dependent = new Dependent(service);
		System.out.println(dependent.sayHello());
	}
}
