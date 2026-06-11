package com.tnsif.userinput;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		
		System.out.println("enter a number");
			Scanner sc=new Scanner(System.in);
			int num = sc.nextInt();
			
			if(num >0) {
				System.out.println("Num is postive..");
			}
		else if(num< 0){
			
			System.out.println("Num is negative..");

			}
		else {
			System.out.println();

		}
				
			}
		

}
