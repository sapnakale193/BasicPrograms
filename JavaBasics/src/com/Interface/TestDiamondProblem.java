package com.Interface;

interface interfaceA{
	
	default void show() {
		
		System.out.println("Show method of InterfaceA");
	  }
      }
   interface interfaceB{
	   
	   default void show() {
		   System.out.println("Show method of InterfaceB");
	   }
       }

class child implements interfaceA,interfaceB{
	
	public void show() {
		
		interfaceA.super.show();
		interfaceB.super.show();
	  }
      }



public class TestDiamondProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		
	}
    }
