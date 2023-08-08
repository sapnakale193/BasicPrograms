package com.Lab_Session;

import java.util.Scanner;

public class MilkAndOil {
	
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		int milkprice =40;
		int oilprice =50; 
		int milkquantity=0;
		int oilQuantity =0;
		int total=0;
		
		while(total <=500) {
			System.out.println("Enter quantity of milk in litres: ");
			int milk =input.nextInt();
			
			System.out.println("Enter quantity of oil in litres: ");
			int oil= input.nextInt();
			
			milkquantity += milk;
			 oilQuantity += oil;
			 total = milkquantity * milkprice +  oilQuantity * oilprice;
			 
			 if (total > 500) {
				 break;
			 }
	       	 }
		System.out.println("Total cost: "+ total + "rs.");
		System.out.println("Quantity of milk entered: " +milkquantity+"liters");
		System.out.println("Quantity of oil entred: " + oilQuantity + " liters");	
	}
    }
