package com.Lab_Session;

public class Prime_Number {
	
	    public static void main(String[] args) {
	        int number = 45823;
	        boolean isPrime = true;
	        for (int i = 2; i <= number / 2; ++i) {
	            if (number % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if (isPrime)
	            System.out.println(number + " is a prime number.");
	        else
	            System.out.println(number + " is not a prime number.");

	        System.out.println("Prime numbers from 1 to " + number + " are:");
	        for (int i = 2; i <= number; i++) {
	            boolean flag = true;
	            for (int j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    flag = false;
	                    break;
	                }
	            }
	            if (flag)
	                System.out.print(i + " ");
	        }
	        }
	        }


