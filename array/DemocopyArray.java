package com.java.array;

import java.util.Arrays;

public class DemocopyArray {

	public static void main(String[] args) {

	
		int[] a = {3,5,6,8,12};
		
		int[] b = new int[a.length];
		
		int[] c = new int[a.length];
		

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		b = a;
		
		System.out.println(Arrays.toString(b));
		
		for(int i=0; i<a.length; i++) {
			c[i] = a[i];
			
		}
		
		System.out.println(Arrays.toString(c));
	}

}
