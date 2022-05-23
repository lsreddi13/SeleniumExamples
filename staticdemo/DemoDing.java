package com.java.staticdemo;

public class DemoDing {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;

			}
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				System.out.println(i);
				break;// statement
			}
		}

		String[] months = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };
		System.out.println("size of month list : " + months.length);
		for (int i = 0; i < 10; i++) {
			if (months[i] == "june") {
				System.out.println(i);
				// click
				System.out.println(months[i]);
				break;// statement
			}
		}

		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
			if (i == 4) {
				break;
			}
		}

	}
}