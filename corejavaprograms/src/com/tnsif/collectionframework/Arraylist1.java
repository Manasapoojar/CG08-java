package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
public static void main(String[] args) {
	List<String> f=new ArrayList<String>();
	f.add("Apple");
	f.add("Mango");
	f.add("Orange");
	
	f.add("orange");  // stores duplicate values also
	f.add("Mango");
//	f.add(9);
	
	System.out.println(f); // all list prints
	//get
	System.out.println(f.get(0)); // apple
	System.out.println(f); // list
	
	//modify element
	f.set(1, "Dragan");  //add dragan
	System.out.println(f);
	
	for(String h:f) { // in "h" elements are stores one by one means prints fruits one by one
		System.out.println(h);
	}
	
	
	f.remove(0);  // apple will remove
	System.out.println(f);
	
	f.clear(); // all fruits removed
	System.out.println(f);
}
}
