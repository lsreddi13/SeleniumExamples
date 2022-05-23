package com.google.copy;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		System.out.println("arraylist size : " + cars.size());
		cars.add("Maruthi");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("TATA");
		cars.add("Lylond");
		System.out.println(cars);
		/*
		 * for (int i = 0; i < cars.size(); i++) { String str = cars.get(i);
		 * 
		 * if ("BMW".equals(str)) { cars.set(1, "Hyundai");
		 * 
		 * }
		 * 
		 * }
		 */
		
		cars.remove(1);
		cars.add("Hyundai");
		System.out.println(cars);
	}

}
