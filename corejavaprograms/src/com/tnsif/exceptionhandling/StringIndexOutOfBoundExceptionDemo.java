package com.tnsif.exceptionhandling;

public class StringIndexOutOfBoundExceptionDemo {
	public static void main(String[] args) {
	String str="hello";
	try
	{
		char ch=str.charAt(6);
		System.out.println(ch);
	}catch(StringIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	

}

}


