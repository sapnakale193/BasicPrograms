package com.champions;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	     System.out.print("Enter marks of five subjects: ");
		    
	        float eng = input.nextFloat();
		    float phy = input.nextFloat();
		    float chem = input.nextFloat();
		    float math = input.nextFloat();
		    float comp = input.nextFloat();

		    float total = eng + phy + chem + math + comp;
		    float average = total / 5;
		    float percentage = (average / 500) * 100;

		    System.out.println("Total marks = " + total);
		    System.out.println("Average marks = " + average);
		    System.out.println("Percentage = " + percentage + "%");
		  }
		
	}


