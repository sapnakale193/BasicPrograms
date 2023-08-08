package com.Inheritance;

    class Person {
    public void readScript() {
        System.out.println("Reading script as a person...");
    }
    }


   class Actor extends Person {
    @Override
    public void readScript() {
        System.out.println("Reading script as an actor...");
    }
    }
   
    public class ExampleNo8 {	
	public static void main(String[] args) {
		
    Person person = new Person();
    Actor actor = new Actor();
    person.readScript(); 
    actor.readScript();
		
	}
    }
