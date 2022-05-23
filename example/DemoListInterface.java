package com.java.list.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DemoListInterface {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.remove(0);
		
		al.add("Kumar");
		al.add(1, "Sachin");
		ListIterator<String> itr = al.listIterator();
		System.out.println("Traversing elements in forward direction");
		while (itr.hasNext()) {

			System.out.println("index:" + itr.nextIndex() + " value:" + itr.next());
		}
		System.out.println("Traversing elements in backward direction");
		while(itr.hasPrevious()){
			System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
			
		}
		al.clear();
//		al.removeAll(al);
		System.out.println(al);
	
		
		System.out.println(al.contains("Sachin"));
	}
}
