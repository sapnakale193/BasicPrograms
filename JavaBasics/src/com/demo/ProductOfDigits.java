package com.demo;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        int n = num; // copy of the original number
        
        //Logic
        int product = 1;
        
        while(n>0){
            int digit = n%10;
            
            product *= digit;
            
            n/=10;
        }
        
        System.out.println("Product of digits of the number "+num+" is "+product+" .");
     
        }
        }

