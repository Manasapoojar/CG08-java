package com.tnsif.stringprograms;
// demo for string buffer 
public class StringBufferdemo {
	public static void main(String[] args) {
		
		StringBuffer b=new StringBuffer("welcome"); // printing wlcm
		System.out.println(b);
		b.append(" to my home");  // welcome to my home
		
		System.out.println(b);
		
		System.out.println(b.delete(2, 5));  // weme to my home
		System.out.println(b);
		
		System.out.println(b.reverse());  // reverse emoh ym ot emew
		
		System.out.println(b.replace(1, 3, "python")); //  epythonh ym ot emew
		
		System.out.println(b.charAt(6));  // n 
	}

}