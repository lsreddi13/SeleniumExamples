package com.examples;

import java.util.Arrays;

public class DemoString5 {

	public static void main(String[] args) {
		String result = "About 7,74,00,000 results (0.67 seconds)  ";
		
		  String result2 = "about 7,74,00,000 Results (0.67 seconds)  ";
		  System.out.println(result);
		  
		  System.out.println(result.trim());
		  
		  
		  if(result == result2) { System.out.println("matched"); }else {
		  System.out.println("not matched"); }
		  
		  if(result.equals(result2)) { System.out.println("matched"); }else {
		  System.out.println("not matched"); }
		  
		  
		  if(result.equalsIgnoreCase(result2)) { System.out.println("matched"); }else {
		  System.out.println("not matched"); }
		 
		
		String ss = "resuts";
		boolean s =result.contains(ss);
		System.out.println(s);
		
		
		System.out.println(result.contains(ss));
		
	}
}
