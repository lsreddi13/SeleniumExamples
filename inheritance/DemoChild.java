package com.oops.inheritance;

public class DemoChild extends DemoParent{
	
	String schoolName = "Nagarjuna School";
	
	public void printSchoolName() {
		System.out.println("print sch name : "+ schoolName);
	}
	
	public static void main(String[] args) {
		
		DemoChild dd = new DemoChild();
		dd.printSchoolName();
		dd.printStudentName();
		
		System.out.println(dd.schoolName);
		
		System.out.println(dd.studentName);
		
		
		
	}

}
