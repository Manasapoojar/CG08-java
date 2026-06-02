package com.tnsif.polymorphismdemo;

class Employee {

    void work() {
        System.out.println("Employee is working.."); //1st
    }
}

// subclass
class Manager extends Employee {
    @Override
    
    void work() {
    	super.work(); // call the employee
        System.out.println("Manager is managing the team..");  // 2nd
    }
}

// subclass2
class Developer extends Manager {
    @Override
    void work() {
        System.out.println("Developer is developing the code");  //3rd
    }
}

public class Employeedetails {

    public static void main(String[] args) {
    	 

        Manager m = new Manager();
        m.work();  // call manager

        Developer d = new Developer();
        d.work(); // developer
    }
}