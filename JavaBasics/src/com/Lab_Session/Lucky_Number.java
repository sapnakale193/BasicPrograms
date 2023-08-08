package com.Lab_Session;

public class Lucky_Number {
	
	public static void main(String[] args) {
		
		String registrationNumber = "8755466";
		
		int luckyNumber = 5;
		
		int count = 0;
		
		for (int i=0; i< registrationNumber.length(); i++) {
			
			if(Character.getNumericValue (registrationNumber.charAt(i))==luckyNumber) {
				
				count++;
				
			}	
		    }
	
System.out.println("The number of times lucky number " + luckyNumber + " appears in the registration number is : "  + count);
	
	}
}
