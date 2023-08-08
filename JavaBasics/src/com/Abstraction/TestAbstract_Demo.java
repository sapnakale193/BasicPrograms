package com.Abstraction;

abstract class Mobile{
	
	private String modelName;
	private double price;

	public abstract void call();
	
	public void display() {
		
		System.out.println("Mobile display Method");
	}
}  

 class Basic extends Mobile{
	 
	 public void call() {
		 System.out.println("basic mobile calling");
	 }
     }

abstract class Android extends Mobile{
	
	public abstract void call();
}

class OnePlus extends Android{
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Oneplus calling method");
	}
    }

public class TestAbstract_Demo {
	public static void main(String[] args) {
		
	}
    }
