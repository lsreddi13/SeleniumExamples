package com.abstractdemo;


// where you will implement abstract methods ?
// i can inherit abstract from non-abstract class and i can implement in the derived/sub/child class.
public abstract class DemoAbs3 {
	static String name = "selenium"; //static data member

	final String name2 = "Automation"; //final data member

	DemoAbs3() {
		System.out.println("hello i am constructor in abstract class.");
	}

	DemoAbs3(String x) {
		System.out.println("hello constructor overloading in abstract class : " + x);
	}
	
	DemoAbs3(String x, String y) {
		System.out.println("hello constructor overloading in abstract class : " + x + " and " + y);
	}

	public void test1() { // non- abstract method
		System.out.println("test1"); // logic
	};

	public abstract void test2(); // abstract method

	/*
	 * access specifiers Enacpsulation abstract
	 * 
	 * 
	 * String collection - list, set, map exception void and return
	 * 
	 */

}
