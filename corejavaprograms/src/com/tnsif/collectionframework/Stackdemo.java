package com.tnsif.collectionframework;
// demo for stack

import java.util.Iterator;
import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
	
Stack<Integer> al=new Stack<>();

// adding the data
al.push(3);
al.push(0);
al.push(3);
al.push(2);
al.push(3);
al.push(7);
al.push(4);
al.push(8);
System.out.println(al);

System.out.println("top element "+al.peek());// peek top of the element reverse

System.out.println(al.pop()); // remove top ele 8
System.out.println(al.pop());//4

System.out.println(al); 
System.out.println(al.isEmpty()); // checks it is empty or not  "false"


Iterator<Integer> i=al.iterator();  //prints one by one
while(i.hasNext()) {
	System.out.println(i.next());
}


}
}