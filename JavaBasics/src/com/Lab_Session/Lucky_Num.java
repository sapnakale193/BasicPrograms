package com.Lab_Session;

import java.util.Scanner;

public class Lucky_Num {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the number: ");
		
		int lucky = sc.nextInt();
		
		System.out.println("Enter Number to find how many times it Arrive");
		
		int find=sc.nextInt();
		
		int count=0;
		
		while (lucky > 0) {
			int digit =lucky % 10;
			if(digit == find) {
				count++;	
			}
	         lucky = lucky /10;
		}
	
          	System.out.println(count);
	}
    }
