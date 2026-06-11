package com.tnsif.finalprograms;
// demo for final method

class father{
	int a=90;
	
	final void display() {
		System.out.println("welcome to java");
	}
}

public class Finalmethod extends father {
	// @Override
	// final void display() { // final method can't be overridden 
	
	public static void main (String[] args) {
		Finalmethod ob = new Finalmethod();
		ob.display();
		System.out.println("welcome to python");
		
	}

}