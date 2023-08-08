package com.Nestedloop;

import java.util.Scanner;

public class Disarium {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int count=0;
		
		while(num>0) {
			
			count++;
			num=num/10;
		}
		
		System.out.println(count);
		num=temp;
		while(num>0) {
			
			int digit =num%10;
			int power=1;
			
			for(int i=1; i<=count; i++) {
				
				power=power*digit;
			 	
			  }
		       sum=sum+power;
				count--;
		       num=num/10;
		    }
		
		System.out.println(sum);
		num=temp;
		if(sum==sum)
		
		{
			System.out.println("Disarium");
		}
		else
		{
			System.out.println("Number is not Disarium");
	    }
        }
        }
