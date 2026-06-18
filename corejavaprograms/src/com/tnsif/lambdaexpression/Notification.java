package com.tnsif.lambdaexpression;

interface Message{  //functional interface
	void show();   // abstract method
}
public class Notification {
	public static void main(String[] args) {
		Message m = ()-> System.out.println("Hello my world...");
		m.show();  // shows the implementation
	}

}
