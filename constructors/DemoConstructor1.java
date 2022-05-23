package com.java.constructors;

public class DemoConstructor1 {

	public DemoConstructor1() { // default constructor or non arguement consteructor.
		System.out.println("hello i am constructor.");

	}

	public DemoConstructor1(String name) { // parametrized constructor or arguement constructor.

		System.out.println("my name is : " + name);
	}

	public DemoConstructor1(int n1) { // parametrized constructor or arguement constructor.

		System.out.println("my name is : " + n1);
	}

	public void m2() {
		System.out.println("hello i am method 2");
	}

	public static void main(String[] args) {

		DemoConstructor1 obj = new DemoConstructor1();

		DemoConstructor1 obj2 = new DemoConstructor1("Ramesh");

		DemoConstructor1 obj3 = new DemoConstructor1(45);
//		obj.m2();
	}
}

