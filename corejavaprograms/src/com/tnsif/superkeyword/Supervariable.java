package com.tnsif.superkeyword;
//demo for super variable

class Notification{
	String message="Default notification"; // parent class variable
}

class Pushnotification extends Notification{
	String message="push notification from whstp"; // child class variable
	
	void notification() {
		System.out.println("child message :"+message); //access child class variable
		System.out.println("parent message :"+super.message); // access parent class var using super
	}
}

public class Supervariable {
	public static void main(String[] args) {
		
		Pushnotification p=new Pushnotification();//obj creation
		
		p.notification();//calling method
	}

}