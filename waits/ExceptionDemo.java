package com.selenium.testcases.waits;


public class ExceptionDemo {

	public static void main(String[] args) {
		int i = 0;
		try {
			String s = "sasi";
			i = Integer.parseInt(s);

		} catch (ArithmeticException e) {
			System.out.println("this is catched : " + e);
		} catch (NumberFormatException e) {
			System.out.println("this is catched2 : " + e);
		} catch (Exception e) {
			System.out.println("this is catched : " + e);
		}
		// rest code of the program
		System.out.println("rest of the code..." + i);
	}
}
