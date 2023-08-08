package com.demo;

public class FuelPrice {
	
	public static void main(String[] args) {
		
		int price =89;
		int total = 0; 
		
		for (int i=1; i<=20; i++) { 
			
			if (i <=10) {
				
		   total += price;
				
			}
			else {
				
				total += (price - (i-10));
			}
		 System.out.println("price of " + i + " barrels: " + total);
		}
	    }
        }
