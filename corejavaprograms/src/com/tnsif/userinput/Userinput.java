package com.tnsif.userinput;
import java.util.Scanner;
public class Userinput {
	public static void main(String[] args) {
		
	System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
	
    int num = sc.nextInt();

		if ( num %2 ==0) {
			System.out.println("even number");
		
		}
		else {
			System.out.println("odd number");

		}
}
}
