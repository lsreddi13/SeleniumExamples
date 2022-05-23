package com.abstractdemo;

public class DemoTest {
	
	public static void main(String[] args) {
		
		DemoDerived dd = new DemoDerived();
		
		//DemoDerived dd2 = new DemoDerived("kk");
		//DemoDerived dd3 = new DemoDerived("yes", "no");
		
		dd.test1();
		dd.test2();
		//String str2 = dd.name2;
		//String str1 = dd.name;

		//System.out.println(str1 + " : " + str2);
	}

}
