package com.demo;

import java.util.Scanner;

public class Day_OF_Week {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number between 1 and 7: ");
	        int day = scanner.nextInt();

	        if (day >= 1 && day <= 7) {
	            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	            System.out.println("The day is " + daysOfWeek[day - 1]);
	        } else {
	            System.out.println("Error, day does not exist");
	        }
	    }
	
	}


