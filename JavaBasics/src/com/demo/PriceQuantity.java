package com.demo;

import java.util.Scanner;

public class PriceQuantity {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter item: ");
		
		String item = sc.next();
		
		System.out.println("Enter Quantity for + item");
		
		int Quantity = sc.nextInt();
		
		System.out.println("Enter price for "+item);
		
		int price= sc.nextInt();
		int bill= Quantity*price;
		
		System.out.println("price of "+item+ "Is" +bill+ "For" +Quantity+ "Quantity");
			
	}
    }




