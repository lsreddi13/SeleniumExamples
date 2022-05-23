package com.examples;

import java.util.Arrays;

public class DemoString4 {

	public static void main(String[] args) {
		String result = "About 7,74,00,000 results (0.67 seconds)";
		String result2 = "(0.67 seconds)";
		String[] str = result.split(" ");
		
//		System.out.println(Arrays.toString(str));
		
		System.out.println(str[1]);
		//regular exp 
		
		//contact 
		
		String a = "test";
		String b = "automation";
		System.out.println(a + b);
		
		System.out.println(a.concat(b));
		
		System.out.println("i am printing "+ a);
		
		System.out.println("string" + "value");
//		String a = "string" + "value";
		
		String myStr = "Hello planet earth, you are a great planet fdsdfsd planet.";
		System.out.println(myStr.length());
		System.out.println(myStr.indexOf( "planet", 37));
		
		
	}
}
