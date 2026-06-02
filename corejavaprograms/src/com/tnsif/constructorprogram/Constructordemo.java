package com.tnsif.constructorprogram;

class User1{
	String name;
	int age;
	
	//Default constructor
	User1(){
		name="Guest";
		age=5;
		System.out.println("Guest profile created");
	}
	//parameter constructor
	
	User1(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("User creaed :"+"name: "+ name +", "+ "Age :"+age);
	}
}
public class Constructordemo {
public static void main(String[] args) {
	User1 u=new User1();
	User1 u1=new User1("java",50);
	
}
}