package com.champions;

import java.util.Scanner;

public class Total_Bill {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

		    System.out.print("Enter the no of pizzas bought:");
		    int pizzas = sc.nextInt();

		    System.out.print("Enter the no of puffs bought:");
		    int puffs = sc.nextInt();

		    System.out.print("Enter the no of cool drinks bought:");
		    int coolDrinks = sc.nextInt();

		    int total = (pizzas * 100) + (puffs * 20) + (coolDrinks * 10);
            
		    System.out.println("Bill Details");
		    System.out.println("No of pizzas: " + pizzas);
		    System.out.println("No of puffs: " + puffs);
		    System.out.println("No of cooldrinks: " + coolDrinks);
		    System.out.println("Total price = " + total);
		    System.out.println("ENJOY THE SHOW");
		  }
	}

