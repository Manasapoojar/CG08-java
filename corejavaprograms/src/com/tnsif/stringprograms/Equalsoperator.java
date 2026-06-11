package com.tnsif.stringprograms;
// demo for == operator

public class Equalsoperator {
	
		public static void main(String[] args) {
			String s1="Elon";
			String s2="Elon";
			String s3=new String("Elon");
			String s4="Musk";
			System.out.println(s1==s2);
			System.out.println(s1==s3); // false, bcs s3 stored in heap memory nad s1 in constant pool
			System.out.println(s1==s4);
		}

	}

