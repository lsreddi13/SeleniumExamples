package com.examples;

public class DemoString {
	// data members
	int a = 45;
	char c = 'a';
	String s = "Selenium";
	double d = 45.54;
//	 data methods

	void test() {
		System.out.println(a);
		System.out.println(c);
	}

	void test2() {
		System.out.println(s);
		System.out.println(d);
	}

	public static void main(String[] args) {

		DemoString ds = new DemoString();
//		
		ds.test();
//		ds.test2();
		
		System.out.println(ds.s);
		String str = "Selenium Testing";
		int a = str.length();
		
		char c = str.charAt(5);
		//
		
		System.out.println(c);
		
//		System.out.println(a);
		
//		System.out.println(ds.d);
		
	}

}
