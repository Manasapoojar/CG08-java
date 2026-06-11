package com.tnsif.inheritanceprogram;
class Animal {  //parent class
    void eat() { // parent method
        System.out.println("Eating");
    }
}

class Dog extends Animal {  // child 
    void bark() {           //child method
        System.out.println("Barking");
    }
}  
public class Maindemo {
	 public static void main(String[] args) {
	        Dog d = new Dog();  //obj for child
	        Animal a= new Animal(); // obj for parent 
	        a.eat();
	        d.eat();   // inherited method
	        d.bark();  // own method
	   }
	}

