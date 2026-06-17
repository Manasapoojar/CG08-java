package com.tnsif.collectionframework;

import java.util.ArrayList;

// demo for arraylist
public class Arraylistdemo {
        public static void main(String[] args) {
        	
        	// creating array list that can store diff types of data 
                ArrayList al=new ArrayList();
                
                // adding elements to array list
                al.add(2); // integer
                al.add("banana"); //string
                al.add(9.0); //double
                al.add('d'); // char
                
                System.out.println(al); // displaying
                
        //        al.clear();
                System.out.println(al);   // Retrieves the first element of the list
                al.getFirst();
                System.out.println(al);
                al.set(3, "cherry");
                System.out.println(al);
        }

}
