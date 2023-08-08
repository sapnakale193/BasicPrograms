package com.mycode;

public class Number_1to20 {
	
	public static void main(String[] args) {
		
		 for (int i = 1; i <= 20; i++) {
		     
			 if (i % 4 == 0 && i % 6 == 0) {
		        
		    System.out.println("The loop is stopped because " + i + " is divisible by both 4 and 6.");
		        
		    break;
		      } else if (i % 4 == 0 || i % 6 == 0) {
		        System.out.println(i + " is divisible by either 4 or 6.");
		        continue;
		      }
		      System.out.println(i);
		    }
		  }
		}

		

