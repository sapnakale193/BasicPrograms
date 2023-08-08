package com.while_loop;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		// find the number is palindrome or not 
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		int reverse=0;
		
		while (num>0) {
			
			int digit =num %10;
			
			reverse=reverse *10 +digit;
			
			num=num/10;
		  }
	    System.out.println(reverse);
	
	}
}
