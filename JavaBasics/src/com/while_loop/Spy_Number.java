package com.while_loop;

import java.util.Scanner;

public class Spy_Number {
	
	public static void main (String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		
		int num =sc.nextInt();
		int sum = 0, prod = 1;
		
		while (num > 0) {
			
			int digit = num % 10;
			
			sum += digit;
			
			prod *= digit;
			
			num /=10;
			}
	    if (sum == prod) {
	    	
	    	System.out.println("The number is a spy number");
	    }
	    else {
	    	
	    	System.out.println("The number is not a spy number");
    }
	}
    }
