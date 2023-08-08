package com.patterns;

public class Pattern3 {
	
	public static void main(String[] args) {
		
		int rows=4;
		int count=65;
		
		//char ch='A';
		for(int i=1; i<=rows; i++) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print((char) count + " ");
				
				count++;
			}
		System.out.println();
		}
	    }
        }
