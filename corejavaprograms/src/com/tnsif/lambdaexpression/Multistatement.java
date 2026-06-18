package com.tnsif.lambdaexpression;
//parameter

@FunctionalInterface
interface Parameter{
	String say(String message);
	
}
public class Multistatement {
	public static void main(String[] args) {  
		Parameter p = (message) -> {    // there those things happening in internally
			String str1 = " i would say,";
			String str2 = str1+message;
			return str2;
			
		};
		System.out.println(p.say("Time is precious."));
	}

}
