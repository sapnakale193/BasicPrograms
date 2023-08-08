package com.Homework;

import java.util.Scanner;

public class EvnOddSwitch {
	
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	    
		 System.out.print("Enter a number: ");
	       
		 int num = input.nextInt();
	      
		 switch (num % 2) {
	     case 0:
	     System.out.println(num + " is even");
	     break;
	     case 1:
	     System.out.println(num + " is odd");
	     break;
	     default:
	     System.out.println("Invalid input");
	     break;
	    }
	    }
	}

	