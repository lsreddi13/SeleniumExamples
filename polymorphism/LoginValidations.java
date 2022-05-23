package com.oops.polymorphism;

public class LoginValidations {

	public void login() {
		System.out.println("enter user name");
		System.out.println("enter pass");
		System.out.println("click login");
	}
	
	public void login(String name) {
		System.out.println("enter "+name);
		System.out.println("enter pass");
		System.out.println("click login");
	}
	
	
	public void login(String name, String text) {
		System.out.println("enter "+name);
		System.out.println("enter pass");
		System.out.println("click login");
		System.out.println("verify warning message"+text);
	}
	
	
	
}
