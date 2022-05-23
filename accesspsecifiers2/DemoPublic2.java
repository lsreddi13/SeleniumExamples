package com.java.accesspsecifiers2;

import com.java.accesspsecifiers.DemoPublic;

public class DemoPublic2 extends DemoPublic{

	public static void main(String[] args) {
		DemoPublic2 dp = new DemoPublic2();
		System.out.println("print name from the public class : "+ dp.name);
		
		dp.run();
		System.out.println(dp.str);
		
		dp.msg();
		
		
	}
	

}
