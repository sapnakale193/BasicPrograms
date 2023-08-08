package com.Inheritance;

   class Programmer {
    public void workingHours() {
        System.out.println("A programmer works 8 hours per day.");
    }
    }
   class Employee extends Programmer {
    @Override
    public void workingHours() {
        System.out.println("An employee works 9 hours per day.");
    }

    public class ExampleNo5 {
	public static void main(String[] args) {
		 Programmer programmer = new Programmer();
		    programmer.workingHours();

		    Employee employee = new Employee();
		    employee.workingHours();
		}
	    }
	    }


