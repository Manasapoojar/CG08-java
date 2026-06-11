package com.tnsif.abstractiondemo;

public abstract class Animal {
    abstract void sound();

    void eat() { 
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}