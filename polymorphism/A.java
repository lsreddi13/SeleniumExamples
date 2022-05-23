package com.oops.polymorphism;

public class A {
	public void test1() {
		System.out.println("this is test1");
	}

	public void test1(int rollNum) {
		System.out.println("this is test1" + rollNum);
	}
	
	public void test1(String StuName) {
		System.out.println("this is test1" + StuName);
	}

	public void test1(int a, int b) {
		System.out.println("this is test1" + a + b);
	}

	public void test1(int a, String x) {
		System.out.println("this is test1" + a + x);
	}

	
	public void test1(String a, int x) {
		System.out.println("this is test1" + a + x);
	}

	public static void main(String[] args) {

		A obj = new A();
		obj.test1();
		obj.test1(5);
		obj.test1(5, 8);
		obj.test1(7, 8);
		obj.test1(5, "sasi");
		obj.test1("sasi", 5);

	}
}