package com.oops.polymorphism;

public class ChildDemo extends ParentDemo {

	public void test1() {
		System.out.println("this is from child demo test1 ");
	}
	public void test1(int a, int b) {
		System.out.println("this is from child demo test1 ");
	}

	public static void main(String[] args) {
		ChildDemo cd = new ChildDemo();
		cd.test1();
		cd.test1(3, 4);
		
		ParentDemo ab = new ChildDemo();
		ab.test1();
		
		
		
		
	}
}
