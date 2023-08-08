package com.while_loop;

import java.util.Scanner;

public class AverageOfDigits {
	
	public static void main (String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		
		int num =sc.nextInt();
		
		int sum=0, count =0;
		
		while (num > 0) {
			
			sum += num % 10;
			
			num/= 10; 
			
			count++;
		}
		
		 double avg = (double) sum /count;
		 
		 System.out.println("Average of digits: "  + avg);
	}

}
