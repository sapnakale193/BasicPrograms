package com.Lab_Session;

import java.util.Scanner;

public class Gross_Salary {
	
	public static void main(String[] args) {
		
		float basicSalary, grossSalary, hra, da;
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the basic salary of the employee: ");
		
		basicSalary =sc.nextFloat();
		
		if (basicSalary <= 10000) {
			
			hra=0.2f *basicSalary;
			da= 0.8f *basicSalary;
		}
		else if  (basicSalary <= 20000) {
			
			hra= 0.25f *basicSalary;
			da=0.9f * basicSalary;
		}
		else {
			hra = 0.3f*basicSalary;
			da= 0.95f* basicSalary;
		}
		
		grossSalary = basicSalary + hra +da;
		System.out.println("Gross Salary: " + grossSalary);
		}
	    }


