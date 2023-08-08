package com.demo;

import java.util.Scanner;

public class Code {

	public static void main (String []args) {
		
		Scanner sc=new Scanner (System.in);
		
		int milk= 40;
		int oil= 50;
		int sum= 0;
		int QtyM =0;
		int QtyO = 0;
		
		
		while (true)
		{
			int qtyMilk;
			
			System.out.println("Enter quantity of milk");
		
			qtyMilk = sc.nextInt();
			QtyM= QtyM+qtyMilk;
			
			int qtyoil;
			System.out.println("Enter quantity of oil");
			qtyoil = sc.nextInt();
			QtyO= QtyO+qtyoil;
			
			sum= sum +(milk*qtyMilk+oil*qtyMilk);
			
			if (sum>500);
			break;
		}
			System.out.println("QTY entered for Milk: "+QtyM);
			System.out.println("QTY entered for oil: "+QtyO);		
			
	}	
}
