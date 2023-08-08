package com.Lab_Session;

public class Max_Digit {
	
	public static void main(String[] args) {
		
		int num =8978;
		int maxdigit =0;
		int digit;
		
		while (num>0) {
			
			digit = num %10;
			 
			if (digit > maxdigit) {
				
				maxdigit = digit;
			}
		
		    num /= 10;
		}
	
	System.out.println("The maximum digit is: "+ maxdigit);
	
}
}
