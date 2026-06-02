package com.tnsif.polymorphismdemo;
// demo for method overriding
class Payment{
	
	//method to be overridden
	void makepayment() {
		System.out.println("processing payment using method");
	}
}
//subclass 1
class UPIPayment extends Payment{
	
	//overriding parent class or super class method
	@Override
	void makepayment() {
		System.out.println("payment using UPI");
	}	
}
//subclass2
class CardPayment extends Payment{
	@Override
	void makepayment() {
		System.out.println("payment using credit card");
	}	
}

public class PaymentTest {
public static void main(String[] args) {
	
	//obj for superclass
	UPIPayment u=new UPIPayment();
	u.makepayment();
	
	//obj for subcls 2
	CardPayment v=new CardPayment();
	v.makepayment();
}
}