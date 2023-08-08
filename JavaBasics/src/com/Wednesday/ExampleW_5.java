package com.Wednesday;

import java.util.Scanner;

class Base {
    int num1, num2;

    Base() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }
}

class Derived extends Base {
    Derived() {
        super();
    }

    void dispMax() {
        System.out.println("Maximum of " + num1 + " and " + num2 + " is " + Math.max(num1, num2));
    }

    void dispMin() {
        System.out.println("Minimum of " + num1 + " and " + num2 + " is " + Math.min(num1, num2));
    }

public class ExampleW_5 {
	public static void main(String[] args) {
		

        Derived d = new Derived();
        d.dispMax();
        d.dispMin();
    }
    }	
	}

