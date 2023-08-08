package com.Lab_Session;

import java.util.Scanner;

public class Automorphic {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int temp = num*num;
		int f = num;
		int count =0;
		
		while(num>0) {
			
			int rem =num%10;
			count++;
			num/=10;
		}
	    
		int mod =1;
		
		for(int i=1; i<=count; i++) {
			
			mod=mod *10;
		}
	 while (temp >0) {
		 
		 int rem=temp%mod;
		 
		 if(rem==f) {
			 
			 System.out.println("Number is automprphic");
			 break;
		 }
		 else 
		 {
			 System.out.println("Number is not automorphic");
		 }
		 temp /=10;
	 }
	}
    }
