package com.java.list.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//import java.util.List;

import org.openqa.selenium.By;

public class Demolist1 {

//	list is an interface - unimplemented methods 
	// class ArrayList - implements the list methods

	public static void main(String[] args) {

		List obj = new ArrayList();
		
	

		System.out.println(obj);

		obj.add("Selenium");
		obj.add("Cypress");
		obj.add("Tosca");
		obj.add("Provar");

		System.out.println("list items : " + obj);
		System.out.println("list count : " + obj.size());
		System.out.println("---------------------");
		for (Object object : obj) {
			System.out.println(object);
		}
		System.out.println("---------------------");
		
		ListIterator<String> itr = obj.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("---------------------");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
			
		}
		
		/*
		 * obj.set(1, "UFT");
		 * 
		 * System.out.println("after adding with index");
		 * System.out.println("list items : " + obj); System.out.println("list count : "
		 * + obj.size());
		 * 
		 * System.out.println("Selenium is exists : "+obj.contains("Selenium"));
		 * 
		 * System.out.println("Cypress is exists : "+obj.contains("Cypress"));
		 */
		
		
		

	}

}
