package com.mycode;

import java.util.Scanner;

public class Frequency {
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int[] freq = new int[10];
	        while (num > 0) {
	            int digit = num % 10;
	            freq[digit]++;
	            num /= 10;
	        }
	        System.out.println("Digit Frequency:");
	        for (int i = 0; i < 10; i++) {
	            if (freq[i] > 0) {
	                System.out.println(i + " occurs " + freq[i] + " times");
	           }
	           }
	           }
	           }


