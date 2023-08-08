package com.demo;

import java.util.Scanner;

public class Volume_Calculator {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Enter the choice");
        System.out.println("1. Find Volume For Cylinder");
        System.out.println("2. Find Volume For Cuboid");
       
        int choice = scanner.nextInt();
        if (choice == 1) {
          
        	System.out.println("Enter the radius");
            double radius = scanner.nextDouble();
            System.out.println("Enter the height");
            double height = scanner.nextDouble();
            double volume = calculateVolume(radius, height);
            System.out.println("Volume of the Cylinder is " + volume);
        } 
        
        else if (choice == 2) {
            System.out.println("Enter the length");
            int length = scanner.nextInt();
            System.out.println("Enter the breadth");
            int breadth = scanner.nextInt();
            System.out.println("Enter the height");
           
            
            int height = scanner.nextInt();
            int volume = calculateVolume(length, breadth, height);
            System.out.println("Volume of the Cuboid is " + volume);
        } else {
            System.out.println("Invalid choice");
        }
        }

    public static double calculateVolume(double radius, double height) {
        return 3.14 * radius * radius * height;
    }

    public static int calculateVolume(int length, int breadth, int height) {
        return length * breadth * height;
    }
}
	
	
	


