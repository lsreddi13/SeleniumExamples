package com.java.staticdemo;

public class DemoStatic {

	static String name ="sasi";
	 String fname ="lingala"; // instance var
	static String course = "Selenium";
	static int id =222;
	
	public static void m1() {
		 String Lname ="lingala";
		System.out.println("ello this is static method");
		
		System.out.println(course);
		
		System.out.println(Lname);
		
	}
	
	
	public static void login1(String uname, String pwd) {

		System.out.println("Login with "+ uname);
		
		System.out.println("login with pwd "+ pwd);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("print static var "+ name);
		
		DemoStatic obj = new DemoStatic();
		
		System.out.println("print static var "+ obj.fname);
	}
	
}
