package com.java.methodtypes;

public class Demovoid {

	public static void main(String[] args) {
		test1();

		Demovoid dv = new Demovoid();
		dv.test2();
		String ss = dv.test3();
		int aa = dv.test4();
		System.out.println( dv.test3());
		System.out.println(ss);
		System.out.println(aa);
	}

	// create static void method
	public static void test1() {
		int a = 4;
		int b = 5;
		int sum = a + b;
		// code
		System.out.println(sum);
	}

	public void test2() {
		// code
		int a = 41;
		int b = 51;
		int sum = a + b;
		// code
		System.out.println(sum);
	}

	public String test3() {

		return "sasi";
	}

	public int test4() {
		int a = 4;
		int b = 5;
		int sum = a + b;
		// code
		return sum;
	}
}
