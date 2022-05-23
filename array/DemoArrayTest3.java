package com.java.array;

import java.util.Arrays;

public class DemoArrayTest3 {

	public static void main(String[] args) {

		int[] ar = new int[5];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = 4 + i;
		}

		System.out.println(Arrays.toString(ar));

		String[] str = new String[5];

		for (int i = 0; i < ar.length; i++) {
			int j  = i+1;
			str[i] = "Selenium" + j;
		}

		System.out.println(Arrays.toString(str));

	}

}
