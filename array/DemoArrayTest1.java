package com.java.array;

import java.util.Arrays;

public class DemoArrayTest1 {

	public static void main(String[] args) {

		String s = "selenium";
		System.out.println(s);

		int[] a = { 2, 3, 5, 6, 7, 88, 2, 3, 5, 6, 7, 88 , 2, 3, 5, 6, 7, 88 , 2, 3, 5, 6, 7, 88 , 2, 3, 5, 6, 7, 88 , 2, 3, 5, 6, 7, 88  };

		int arraylength = a.length;
		System.out.println("array size = "+arraylength);
		
		for(int i=0; i<arraylength; i++) {
//			System.out.println(" i am printing array index of  "+i + " : "+ a[i]);
			System.out.println(a[i]);
		}

		
		  System.out.println(Arrays.toString(a));
		  
		  System.out.println(a[0]);
		  
		  //string array fixed size array
		  String[] courses = new String[9]; 
		  courses[0] = "selenium";
		  
		  courses[1] = "selenium1";
		  courses[2] = "selenium2";
		  
		  
		  
		  System.out.println(Arrays.toString(courses));
		  courses[0] = "selenium Testing";
		  System.out.println(Arrays.toString(courses));
		  
		  System.out.println(courses[0]);
		  
		  System.out.println(courses[1]);
		  
		  System.out.println(courses[8]);
		 

	}

}
