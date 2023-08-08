package com.oops;

public class Employee {
	
	int eid;
	String ename;
	int salary;
	
	public void acceptDetails(int id, String name, int sal) {
		
		eid=id;
		ename=name;
		salary=sal;	
	}
	
	public void display() {
	
		System.out.println(eid+" "+ename+" "+salary);	
	}
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.acceptDetails(101, "Amit",78000);
		
		//System.out.println(emp);
		emp.display();
	
	    Employee emp2=new Employee();
	    emp2.acceptDetails(102, "Sapna", 60000);
	    emp2.display();
	}
    }
