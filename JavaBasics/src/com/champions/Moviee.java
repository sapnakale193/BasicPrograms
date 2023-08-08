package com.champions;

import java.util.Scanner;

public class Moviee {
	
	public static void main(String[] args) {
		
		int pizza_Price = 100;
		int puff_Price =20;
		int coldDrink_Price =10;
		
		int coupon_code1 =100;
		int coupon_code2= 200;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the name: ");
		String Customer_name=sc.next();
		
		System.out.println("Enter the number of pizza Quantity :");
		int pizza_Quantity= sc.nextInt();
		
		System.out.println("Enter the Number of Puff Quantity ");
		int puff_Quantity= sc.nextInt();
		
		System.out.println("Enter the Number of Cold Drinks: ");
		int coldDrink_Quantity= sc.nextInt();
		
		int bill_Details = pizza_Quantity*pizza_Price +puff_Quantity*puff_Price +coldDrink_Quantity*coldDrink_Price;
		
		int customer_Coupon = 0;
		if (customer_Coupon==coupon_code1)
		{
			int discount_proce = bill_Details/ 10*100;
			int discount_price;
			int final_Bill = discount_proce;
			
			System.out.println("Your bILL is " + final_Bill);
			System.out.println("Enjoy the show");
			
			if (customer_Coupon==coupon_code2)
		
			{
			     discount_proce = bill_Details/ 20*100;
			     final_Bill = discount_proce;
		
			     System.out.println("Your bILL is " + final_Bill);
					System.out.println("Enjoy the show");
			}
		    }
		
		else {
			
			System.out.println("You don't havt the coupon code");
			System.out.println("Your Final Bill is : "+ bill_Details);
		
		}
	
	    }
         
        }	
		
		
		
		
		
		
		
		
		
		
		
	


