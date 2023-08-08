package com.Lab_Session;

import java.util.Scanner;

public class Harshad_Number {
	
	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = input.nextInt();
	        int sum = 0;
	        int temp = num;
	        while (temp > 0) {
	            sum += temp % 10;
	            temp /= 10;
	        }
	        if (num % sum == 0) {
	            System.out.println(num + " is a Harshad number.");
	        } else {
	            System.out.println(num + " is not a Harshad number.");
	        }
	    }	
	}


