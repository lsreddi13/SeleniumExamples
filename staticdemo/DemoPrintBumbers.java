package com.java.staticdemo;

import java.util.Arrays;

public class DemoPrintBumbers {

	public static void main(String[] args) {
		
		int[] ar1 = new int[10];
//		System.out.println(Arrays.toString(ar1));
		// print values from 1 to 10;
		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
			ar1[i-1]=i;
			
		}
		System.out.println(Arrays.toString(ar1));
//		for-each
		
		// print values from 101 to 110;
		int[] ar2 = new int[10];
		int j =101;
		while (j<=110) {
			ar2[j-101] = j;
//			System.out.println(j);
			j++;
		}
		System.out.println(Arrays.toString(ar2));
		
//		do while
//		it will perform action whether the condition is pass or fail
		int[] ar3 = new int[10];
		int k=201;
		do {
//			System.out.println(k);
			ar3[k-201] = k;
			k++;
		} while (k<=210);
		
		System.out.println(Arrays.toString(ar3));
	}

}
