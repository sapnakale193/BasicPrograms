package com.Lab_Session;

import java.util.Scanner;

public class Simple_Intrest {
	
	public static void main(String[] args) {
		
		float p, r, t, si;
		
		Scanner scan=new Scanner (System.in);
	
	
	System.out.println("Enter the principle: ");
	
	p = scan.nextFloat();
	
	System.out.println("Enter the rate if Interest: ");
	
	r = scan.nextFloat();
	
	System.out.println("Enter the Time period in years: ");
	
	t = scan.nextFloat();
	
	si = (p * r * t)/100;
	
	System.out.println("Simple Interest is: " +si);
	
	}
	}


