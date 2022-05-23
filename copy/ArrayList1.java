package com.google.copy;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		System.out.println("arraylist size : " + cars.size());
		cars.add("Maruthi");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("TATA");
		cars.add("Lylond");
		System.out.println("arryalist items : "+cars);

		System.out.println("arraylist size : " + cars.size());

		
		System.out.println("index of 4th element : "+cars.get(4));
		cars.remove("Mazda");
		System.out.println("index of 4th element : "+cars.get(4));
		System.out.println("arraylist size : " + cars.size());
		System.out.println(cars);

		
		cars.set(2, "Hyundai");
		System.out.println(cars);
		
		
		for(int i=0; i<cars.size(); i++) {
			if("Ford".equals(cars.get(i))) {
				System.out.println("ford index is : "+ i);
			}
		}
	}

}
