package com.abstractdemo;

public class Dirty {
	//a var calling to Dirty2 class
	int a =45;
	int b=35;
	public static void main(String[] args) {
		Dirty obj = new Dirty();
		System.out.println(obj.b);
	}
}
