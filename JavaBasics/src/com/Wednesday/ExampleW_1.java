package com.Wednesday;

import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    float marks;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter marks: ");
        marks = sc.nextFloat();
    }
    }

class MyRecord extends Student {
    void display() {
        float percentage = (marks / 100) * 100;
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Percentage: " + percentage + "%");
    }
}
public class ExampleW_1 {
	public static void main(String[] args) {
		  MyRecord record = new MyRecord();
	        record.getDetails();
	        record.display();
	}		
	}


