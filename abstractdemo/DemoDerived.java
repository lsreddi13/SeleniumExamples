package com.abstractdemo;

public class DemoDerived extends DemoAbs3 {

	public void test2() {

		System.out.println("this method implemented in non abstract class after inherting from the abstract class.");
	}
	DemoDerived(){
		super();
	}
	DemoDerived(String zz){
		super(zz);
		
//		super("yes", "no");
	}
	
	DemoDerived(String ab, String cc){
		super(ab, cc);
		
//		super("yes", "no");
	}
}
