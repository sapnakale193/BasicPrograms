package com.demo;

import java.util.Scanner;

public class Check_Prime_Class {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the number");
		int num = sc.nextInt();
		// boolean isprime = true;
		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				// isprime = false;
				count++;
				break;
			}
		}

		if (count == 0)// if (isprime == true) {
		{
			System.out.println("Prime");
		} else {
			System.out.println("not prime");
		}
	}
	}


