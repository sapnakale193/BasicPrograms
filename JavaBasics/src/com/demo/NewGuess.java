package com.demo;

import java.util.Random;
import java.util.Scanner;

public class NewGuess {
	
		public static void main(String[] args) {
		    Random Random_number= new Random();
		    int right_guess=Random_number.nextInt(100);
		    int turns=0;
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Guess a number between 1 to 100, You will have 10 turns!" );
		    System.out.println("best of luck!");
		    
		    int guess;
		    int i=0;
		    boolean win=false;
		    while(win==false) {
		      guess=scan.nextInt();
		      turns++;
		    
		    if(guess==right_guess) {
		      win=true;
		    }
		    else if(i>8){
		      System.out.println("You loose! the right answer was: "+right_guess);
		      return;
		    }
		
		    }
		
		}
}
	
	
	

