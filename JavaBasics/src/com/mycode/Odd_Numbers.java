package com.mycode;

import java.util.Scanner;

public class Odd_Numbers {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int sum = 0, count = 0;
	      
	        while (num > 0) {
	            int digit = num % 10;
	            if (digit % 2 != 0) {
	                sum += digit;
	                count++;
	            }
	            num /= 10;
	           }
	        if (count == 0) {
	            System.out.println("No odd digits found in the number.");
	        } else {
	            double average = (double) sum / count;
	            System.out.println("Average of odd digits: " + average);
	        }
	        sc.close();
	    }
	
	    }


