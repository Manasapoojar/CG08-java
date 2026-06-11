package com.tnsif.stringprograms;
// demo for equal ignore case

public class Ignorecase {
	
	public static void main(String[] args) {
		
		String s1="sushma";
		String s2="SUSHMA";
		String s3= "ELON";
		System.out.println(s1.equalsIgnoreCase(s2));// checks only content, not an issue with lower or upper case
		System.out.println(s1.equalsIgnoreCase(s3)); // false, bcs content also changed
		System.out.println(s1.equals(s2));
	}

}