package com.examples;

public class DemoString2 {

	
	public static void main(String[] args) {
		
		String str = "Selenium automation Testing";
		
		System.out.println(str);
		
		System.out.println(str.toUpperCase()); // uppercase letters
		
		System.out.println(str.toLowerCase()); // uppercase letters
		
		
		System.out.println(str.length());
		//how to find the number times displayed char e in the "selenium Testing".
		int count =0;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='e') {
				
				System.out.println("matched");
				count++;
			}System.out.println("not matched");
		}
		
		System.out.println(count);
	}
}
