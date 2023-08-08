package com.mycode;

import java.util.Scanner;

public class Loop{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		
		int base=sc.nextInt();
		System.out.println("Enter the exponent");
		int expo=sc.nextInt();
		int power=1;
		
		for(int i=1;i<=expo;i++)
		{
			power=power*base;
		}

		System.out.println("power= "+power);
		
		
	}

}


