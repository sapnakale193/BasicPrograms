package com.patterns;

public class Char_Pattern {
	
	public static void main(String[] args) {
		
		for (char i='A'; i<='D'; i++) {
			
	    for (char j='A'; j<=i; j++) {
				
		System.out.println(j);
			
	    }
		 
		System.out.println();
		}
		  
	    for(int i=1; i<=5; i++)
	   {
		for (int j=1; j<=i; j++)
		{
			System.out.print((char)(64+j));
		}
	     System.out.println();
	}
	}
    }
