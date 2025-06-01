package com.tnsif;

public class Person {
	// Parent class
	    void displayPerson() {
	        System.out.println("I am a person.");
	    }
	}

	// Child class of Person
	class Employees extends Person {
	    void displayEmployee() {
	        System.out.println("I am an employee.");
	    }
	}

	// Child class of Employee
	class Manager extends Employees {
	    void displayManager() {
	        System.out.println("I am a manager.");
	    }
	}

	// Main class
class MultilevelExample {
public static void main(String[] args) {
	   Manager m = new Manager();
	   m.displayPerson();    // from Person class
	   m.displayEmployee();  // from Employee class
	   m.displayManager();   // from Manager class
	    }
	}
