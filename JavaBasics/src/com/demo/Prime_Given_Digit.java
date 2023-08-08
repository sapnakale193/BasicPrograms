package com.demo;

import java.util.Scanner;

public class Prime_Given_Digit {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		  System.out.print("Enter the range of digits: ");
	        int n = scanner.nextInt();
	        scanner.close();
	        System.out.println("Prime numbers in the range of digits " + n + ":");
	        for (int i = 2; i <= n; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(i + " ");
	        }
	        }
	        }
	        }

