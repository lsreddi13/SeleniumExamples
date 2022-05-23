package com.java.array;

import java.util.Arrays;

public class DemoArrayTest2 {

	public static void main(String[] args) {

		// string array fixed size array
		String[] courses = new String[9];
		courses[0] = "selenium";

		courses[1] = "selenium1";
		courses[2] = "selenium2";

//		System.out.println(Arrays.toString(courses));
		courses[0] = "selenium Testing";
//		System.out.println(Arrays.toString(courses));
		
		for(int i=0; i<courses.length; i++ ) {
			System.out.println(i+". "+courses[i]);
		}

	}

}
