package com.tnsif.superkeyword;
// demo for super method
class Payment1{  // parent
	void process() {
		
		System.out.println("hiii....");
		System.out.println("processing payment using standard gateway..");
	}
}
class Gpay extends Payment1{ //child class
	void process() {
		//super.process();
		System.out.println("processing payment using standard gpay..");
	}
	
	void completetransation() {
		super.process();//parent class // execute parent clss msg
		process();
		//super.process();// child class   // then execute child class msg
	
	}
}

public class SuperwithMethod {
public static void main(String[] args) {
	Gpay g=new Gpay();
	g.completetransation();
}
}