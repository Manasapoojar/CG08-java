package com.tnsif.inheritanceprogram;

class Multilevel {
    void level() {
        System.out.println("MULTILEVEL...");
    }
}

class Inheritance extends Multilevel {
    void level1() {
        System.out.println("same class...");
    }
}

class Inheri extends Inheritance {
    void level2() {
        System.out.println("inherited...");
    }
}

public class Demomulti {
    public static void main(String[] args) {

        Inheri i = new Inheri();

        i.level();   // from Multilevel
        i.level1();  // from Inheritance
        i.level2();  // from Inheri
    }
}