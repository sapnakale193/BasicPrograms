package com.patterns;

import java.util.Scanner;

public class N_Pattern {
	
	public static void main(String[] args) {
   
		Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number of rows: ");
		  
       int n = sc.nextInt();
		 sc.close();

		  for (int i = 0; i < n; i++) {
		   for (int j = 0; j <= n; j++) {
		   if (j == 0 || j == n || i == j) {
		     System.out.print("*");
		      } else {
		     System.out.print(" ");
		     }
		     }
		      System.out.println();
		    }
		    }
	        }


