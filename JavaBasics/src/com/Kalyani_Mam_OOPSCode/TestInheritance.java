package com.Kalyani_Mam_OOPSCode;

  class Animal {
	  
	  void eat()
	  {
		  System.out.println("eating...");
	  }
      }

    class Dog extends Animal{
    	
    	void bark()
    	{
    		System.out.println("Barking..");
    	}
    	
    }
     public class TestInheritance {
	
    public static void main(String[] args) {
		
	Dog d=new Dog();
	d.bark();
	d.eat();
}

}
