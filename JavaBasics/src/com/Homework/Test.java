package com.Homework;

public class Test {
	
	public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Sapie");
        emp.setSalary(60000.0);

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

}
}