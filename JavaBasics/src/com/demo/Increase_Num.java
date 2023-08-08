package com.demo;

import java.util.Scanner;

public class Increase_Num {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		
		System.out.println("Enter a number");
		
		int num=s.nextInt();
		int temp=num;
		
		int lastvalue=0;
		int nextLastvalue=0;
		
		while (num>0) {
			
			lastvalue=num%10;
			num=num/10;
			nextLastvalue=num%10;
			
			if(lastvalue>=nextLastvalue) {
				
				continue;
			}
			else {
				
				break;
			}
		   }
		
	if (lastvalue>=nextLastvalue) {
		
	
		  System.out.println(temp +" is increasing order");
	}
	else {
		
		System.out.println(temp+ "is not increasing order ");
	}
	}

}
