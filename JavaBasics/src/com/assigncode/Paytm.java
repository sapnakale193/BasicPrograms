package com.assigncode;

import java.util.Scanner;

public class Paytm {
	
	public static void main(String[] args) {
		
		Customer c=new Customer ();
		Scanner sc =new Scanner (System.in);
		//System.out.println("Enter Coustumer's id");
	    c.setId(112);
		//System.out.println("Enter customer;s name");
		c.setName("Sapna");
		
		int num=sc.nextInt();
		
		int amount = c.getBalance(0);
		int total=amount-num;
	    
	   
		System.out.println(c.getBalance(0));
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(total);
	
		System.out.println("id "+   c.getId()+   "name"  +  c.getName()+  "balance "   +   c.getBalance(total));
	
	    System.out.println("available balance"+total);
	}
    }
