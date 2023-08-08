package com.demo;

import java.util.Scanner;

public class Sum_Odd_Numbers {
	
	public static void main (String[]args) {
		
	Scanner input =new Scanner (System.in);
	
	System.out.print("Enter The Number of Limit: ");
	int l =input.nextInt();
	
	int sum= 0;
	
	for(int s=1; s<=1; s++) {
		
		if(s%2==1)
			
			sum= sum + s;
		
		System.out.println("sum of odd Numbers :"+sum);
		
}
	
}

}
