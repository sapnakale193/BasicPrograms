package com.Thursday;

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int hoursWorked;

    public Employee(int id, String name, int hoursWorked) {
        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double calculateSalary() {
        if (this instanceof FullTimeEmployee) {
            return hoursWorked * 500;
        } else if (this instanceof PartTimeEmployee) {
            return hoursWorked * 200;
        } else {
            return 0;
        }
        }
        }

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, int hoursWorked) {
        super(id, name, hoursWorked);
    }
    }

class PartTimeEmployee extends Employee {
    public PartTimeEmployee(int id, String name, int hoursWorked) {
        super(id, name, hoursWorked);
    }
    }

public class Exampleno_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter employee name: ");
        String name = scanner.next();

        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();

        System.out.print("Enter employee type (full-time or part-time): ");
        String employeeType = scanner.next();

        Employee employee;
        if (employeeType.equals("full-time")) {
            employee = new FullTimeEmployee(id, name, hoursWorked);
        } 
        else if (employeeType.equals("part-time")) {
            employee = new PartTimeEmployee(id, name, hoursWorked);
        } 
        else {
            System.out.println("Invalid employee type.");
            return;
        }

        double salary = employee.calculateSalary();

        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Hours worked: " + employee.getHoursWorked());
        System.out.println("Salary: " + salary);
    }
	}


