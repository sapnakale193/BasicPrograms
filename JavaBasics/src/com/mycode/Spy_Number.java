package com.mycode;

public class Spy_Number {
	
	public static void main(String[] args) {
		
		int product= 1, sum =0, id;
		int n=88;
		
		while (n>0) {
			
			id= n % 10;
			sum= sum + id;
			
			product= product *1;
			
			 n= n/10;
	    }
		if (sum == product) {
			System.out.println("Given number is spy number");
		}
			else  
				
		    System.out.println("Given number is not spy NUmber");
        }
		}
	