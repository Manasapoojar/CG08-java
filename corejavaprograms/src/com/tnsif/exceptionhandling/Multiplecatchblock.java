package com.tnsif.exceptionhandling;

public class Multiplecatchblock {

	public static void main(String[] args) {
		int num[] = new int[4];
		try{
			num[9] = 50/0;
		}
		catch(ArithmeticException t) {
			System.out.println("good evening.." + t.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException h) {
			System.out.println("good morning.." + h.getMessage());
		}
		catch(Exception k) {
			System.out.println("good night.." + k.getMessage());
		}
		
		

	}

}
