package com.tnsif.stringprograms;

public class Immutableemo {
	public static void main(String[] args) {
		String str1 = "sachin";
		String str2 = str1;
		String str3= str2;
		
		
		System.out.println("before modification");
		System.out.println("str1 " + str1);
		System.out.println("str2 " + str2);
		System.out.println("str3 " + str3);
		
		str1= "sachin tendulkar";
		
		System.out.println("after modification");
		System.out.println("str1 "+ str1);   // modify only for str1 , bcs its store in heap memory , we assign valur s1 so it is create new obj 
		System.out.println("str2 "+str2);
		System.out.println("str3 "+str3);

		
	}

}
