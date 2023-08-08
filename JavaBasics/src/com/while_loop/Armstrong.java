package com.while_loop;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		//Check the given number is armstrong or not
		
		Scanner sc=new  Scanner (System.in);
		
		int num=sc.nextInt();
		int temp =num;
		int sum=0;
		
		while(num>0)
		{
			int digit =num%10;
			int cube= digit*digit*digit;
			sum=sum+cube;
			num=num/10; 
		}
	
	num=temp;
	System.out.println(sum+"  "+num);
	
	if (sum == num)
	{
		System.out.println("ArmStrong");
	}
	else
	{
		System.out.println("not");
	}
	}
    }
