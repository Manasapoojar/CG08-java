package com.tnsif.constructorprogram;

public class Student {
	
	 // Instance variables
int id;
String name;

Student(int id,String name ){ // para const
	
	// 'this' refers to current object
	this.id=id;
	this.name=name;
}

void display() {
	System.out.println("ID :"+id);
	System.out.println("Name :"+name);
}
public static void main(String[] args) {
	
	// Creating first Student object
	Student s=new Student(101,"surya");
	
	// Creating sec Student object
	Student s1=new Student(103,"yurya");
	
	// boolean output=s1.(instanceof)Student();
	
	s.display();
	s1.display();
}
}