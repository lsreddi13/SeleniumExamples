package com.java.accesspsecifiers;



public class DemoPublic {
	private String course = "ssss";
	String myStr = " this is default";
	protected String str = "this is protected";
	public String name = "selenium";
	
	protected void msg()  
	 {  
	     System.out.println("Try to access the protected method outside the package using inheritance");  
	 }  
	
	
	public void run() {
		System.out.println("this is public method in DemoPublic class");
		
	}

	

	public String getCourse() {
		return course;
	}


	public void setCourse(String x) {
		course = x;
	}



	public String getStr() {
		return str;
	}



	public void setStr(String str) {
		this.str = str;
	}
	

}
