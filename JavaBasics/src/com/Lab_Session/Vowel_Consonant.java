package com.Lab_Session;

import java.util.Scanner;

public class Vowel_Consonant {
	
	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an alphabet: ");
	        char ch = scanner.next().charAt(0);
	        scanner.close();

	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	            System.out.println(ch + " is a vowel.");
	        } else {
	            System.out.println(ch + " is a consonant.");
	        }
	    }
	
	  }


