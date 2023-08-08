package com.Lab_Session;

import java.util.Scanner;

public class Simple_Calculator {
	
	public static void main(String[] args) {
		
		  double num1, num2, result;
	        char operator;

	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter first number:");
	        num1 = input.nextDouble();

	        System.out.println("Enter second number:");
	        num2 = input.nextDouble();

	        System.out.println("Choose an operator (+, -, *, or /):");
	        operator = input.next().charAt(0);

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println(num1 + " + " + num2 + " = " + result);
	                break;

	            case '-':
	                result = num1 - num2;
	                System.out.println(num1 + " - " + num2 + " = " + result);
	                break;

	            case '*':
	                result = num1 * num2;
	                System.out.println(num1 + " * " + num2 + " = " + result);
	                break;

	            case '/':
	                result = num1 / num2;
	                System.out.println(num1 + " / " + num2 + " = " + result);
	                break;

	            default:
	                System.out.println("Invalid operator!");
	                break;
	        }

	        input.close();
	    }
	
	    }


