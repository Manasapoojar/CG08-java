package com.tnsif.staticprograms;

public class Student {
	int rollno;
	String name;
    static String College = "ACS";
	
	//Static method change value
	
	static void change() {
		College = "RRCE"; // if u can change static value u can change in method blok
		
	}
	Student (int r, String n ){
		rollno = r;
		name = n;
		
	}
	void display() {
		System.out.println(rollno +","+name+","+College+" ");
	}
	public static void main(String[] args) {
		Student.change();
		Student s1 = new Student(86,"Manasa");
		Student s2 = new Student(116,"Nithin");
		Student s3 = new Student(126,"Pruthvi");
		
		s1.display();
		s2.display();
		s3.display();

		
	}
	

}
