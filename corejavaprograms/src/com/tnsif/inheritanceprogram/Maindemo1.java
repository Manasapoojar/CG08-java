package com.tnsif.inheritanceprogram;
//demo for inheritance

//parent class
class Father{
	
	//data member of parent class
	int money=90000;
	String car="bmw"; 
	
	//method of parent class
	void drinking() {
		System.out.println("coffe");
	}
}

//inheriting parent to child class
class Son extends Father{
	
	String cycle="pink";// data member for child
	
	void read() { // method for child
		System.out.println("java");
	}
}
public class Maindemo1 {
public static void main(String[] args) {
	
	Father f=new Father();// object for parent
	f.drinking();         // accessing parent method
	Son s=new Son();       //object for child
	System.out.println(s.money);  // accessing properties 
	System.out.println(s.car);
	s.drinking();
	System.out.println(s.cycle);
	s.read();  // access child class method
}
}