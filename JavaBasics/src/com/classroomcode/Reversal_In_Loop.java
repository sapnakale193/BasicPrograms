package com.classroomcode;

public class Reversal_In_Loop {
	
	public static void main(String[] args) {
		
		int num = 6879;
		int rev= 0;
		
		while (num>0) {
			
			int rem = num%10;
			rev = rev*10+rem;
			
			num = num /10;
    }
	
	System.out.println("The number is:" +rev );
	}
    }
