package com.demo;

import java.util.Scanner;

public class Condition {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Enter the 1st number");
		int num1= scan.nextInt();
		
		System.out.println("Enter the second number");
		int num2= scan.nextInt();
		
		if (num1>num2)

			System.out.println("num1 =" +num1);

	    else 
		
	    	System.out.println("num2 =" +num2);

}
}