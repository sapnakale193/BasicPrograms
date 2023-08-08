package com.Interface;

import java.io.Serializable;

//Single abstract method in interface (SAM Interface)
//java 8
@FunctionalInterface 
interface Washable{
	  
	  void wash();//abstract method
	  default void m1() {
		  
   	  }
      } 

@FunctionalInterface

interface A{
	void m1();
}
//marker interface
class B implements Serializable{
	
}
public class Test12 {	
	public static void main(String[] args) {
		
}
}