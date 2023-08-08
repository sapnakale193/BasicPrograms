package com.patterns;

public class T_Pattern {

	public static void main(String[] args) {
		
		 int n = 5; // size of the T pattern
	    
		 for (int i = 0; i < n; i++) {
	     
		 for (int j = 0; j < n; j++) {
	    
	     if (i == 0 || j == n / 2) { // print '*' for the first row and middle column
	      
	     System.out.print("*");
	      } else {
	    
	    System.out.print(" "); // print space for other positions
	      }
	      }
	      System.out.println(); // move to the next line
	        }
	    }
	}

