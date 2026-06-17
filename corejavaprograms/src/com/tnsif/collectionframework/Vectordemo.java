package com.tnsif.collectionframework;

import java.util.List;
import java.util.Vector;

// Q1. What is Vector?
//A: Vector is a dynamic array that is synchronized and thread-safe.
public class Vectordemo {
public static void main(String[] args) {
        List<Integer> number=new Vector<>();
        
        number.add(2);
        number.add(9);
        number.add(3);
        number.add(8);
        number.add(7);
        number.add(2);
        number.add(2);
        
        System.out.println(number); // list
        System.out.println(number.get(4)); //8
        System.out.println(number.getFirst()); // list
        System.out.println(number.contains(7)); //check 7 is there r not "true"
        
        number.remove(Integer.valueOf(7)); // remove 7
        System.out.println(number); // then list
        
        number.size(); // size
        System.out.println(number);
        
        number.clear();
        System.out.println(number); // delete all  after clear all elemnts in arraylist o/p will be "[]".
}
}
