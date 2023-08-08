package com.Homework;

import java.util.Scanner;

public class NumOfDaysinMonth {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the month number: ");
	        int month = scanner.nextInt();
	        scanner.close();

	        int days;

	        switch (month) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                days = 31;
	                break;
	            case 4: case 6: case 9: case 11:
	                days = 30;
	                break;
	            case 2:
	                days = 28;
	                break;
	            default:
	                days = 0;
	                break;
	        }

	        if (days != 0) {
	            System.out.println("The number of days in the month is: " + days);
	        } else {
	            System.out.println("Invalid month number.");
	        }
	    }
	
	}


