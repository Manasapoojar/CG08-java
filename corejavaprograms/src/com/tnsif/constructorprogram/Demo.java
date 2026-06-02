package com.tnsif.constructorprogram;

public class Demo {
	Demo(){
		System.out.println("welcome to java");
		System.out.println("default");
	}
	Demo(int a,int b){
		System.out.println("2 parameter ");
	}
	Demo(String s){
		System.out.println("one parameter");
	}
	Demo(int a,String f){
		System.out.println("mixed parameter");		
	}
	public static void main(String[] args) {
		Demo  d=new Demo ();
		Demo d1=new Demo (2,"Mansa"); // execute mixed para
		Demo d2=new Demo (2,5);  // execute 2 para (i.e., int)
		Demo d3=new Demo ("Pavan");  // execute one para(string)
		
	}
}