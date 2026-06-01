package com.tnsif.accessmodifierprogram;

public class Demo1 {
	public static void main(String[] agrs) {
     Publicdemo p = new Publicdemo();
		
		System.out.println(p.a);
		//System.out.println(p.b); private method can't access in diff. class
		System.out.println(p.s);
		System.out.println(p.w);
	}

}
