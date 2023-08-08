package com.Abstraction;

abstract class Animal{
	
	public String name;
	
	public Animal(String name) {
	this.name=name;
	}
	
	public abstract void makeSound();
	

	public void eat() {
		
		System.out.println("Animal is eating");
	}
    }

class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	
	public void makeSound() {
		System.out.println(name+   "barks");
	}
}

class Cat extends Animal{
	Cat(String name){
		super(name);
	}
	
	public void makeSound() {
		System.out.println(name+   "Meows");
	}
}

public class Test_Abstract {
	
	public static void main(String[] args) {
		
   Animal a=new Dog("Max");
	a.eat();
	a.makeSound();
	
	a=new Cat("Luna");
	a.eat();
	a.makeSound();
	}
    }
