package com.tnsif.staticprograms;
// demo for static variable

public class Employee {
	int eid;
	String name;
	static String companyname="TNS";   // common for both employee
	
	// constructor
	
	Employee(int e,String n){
		eid=e;
		name=n;	
	}
	void display() {
		System.out.println(eid+" "+name+" "+companyname);
	}
	public static void main(String[] args) {
		Employee e1=new Employee(1,"manasa");  // whn ever create a obj need to pass parameter bcs we use parameterized constructor
		Employee e2=new Employee(2,"pavan");
		
		e1.display();
		e2.display();
	}

}


