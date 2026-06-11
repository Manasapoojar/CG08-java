package com.tnsif.exceptionhandling;
import java.util.Scanner;

public class PractiseCode {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            int a = sc.nextInt();
	            int b = sc.nextInt();

	            System.out.println(a / b);
	        } catch (ArithmeticException e) {
	            System.out.println("Division by zero");
	        } catch (Exception e) {
	            System.out.println("Invalid input");
	        }
	    }
	}