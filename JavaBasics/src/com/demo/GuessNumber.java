package com.demo;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	
	public static void main (String [] args) {
		
		int answer, guess;
		
		final int max= 100;
		
		Scanner in= new Scanner(System.in);
		
		Random Rom= new Random();
		
		boolean correct= false;
		
		answer= Rom.nextInt(max) + 1;
	
		System.out.println(
                "Guess a number between 1 and 100: ");
  
            // guess value
            guess = in.nextInt();
  
            // if guess is greater than actual
            if (guess > answer) {
                System.out.println("Too high, try again");
            }
  
            // if guess is less than actual
            else if (guess < answer) {
                System.out.println("Too low, try again");
            }
  
            // guess is equal to actual value
            else {
  
                System.out.println(
                    "Yes, you guessed the number.");
  
                correct = true;
        }
        }	
	    }


