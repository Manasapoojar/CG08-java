package com.tnsif.stringprograms;
// demo for CompareTo method
public class CompareTodemo {
public static void main(String[] args) {
	String s1="elon";
	String s2="elon";
	String s3="musk";
	
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3)); // -8, by the asci value it give o/p, s1 compare s2 = s2 is bigger so neg
	System.out.println(s3.compareTo(s1));
}
}
