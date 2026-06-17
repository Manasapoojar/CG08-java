package com.tnsif.exceptionhandling;

public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println("Goood job yeah...");
			System.out.println(5/0);
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("welcome to java");
		}
		
	}

}
