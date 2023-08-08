package com.patterns;

public class E1_Pattern {
	
	public static void main(String[] args) {
		
	        int size = 7;
	        
	        for (int i = 0; i < size; i++) {
	        
	       	for (int j = 0; j < size; j++) {
	              
	        if (i == 0 || i == size - 1 || i == size / 2) {
	        
	        	System.out.print("*");
	        
	        } else if (j == 0) {
	
	        	System.out.print("*");
	        
	        } else {
	            
	        	System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	
	}


