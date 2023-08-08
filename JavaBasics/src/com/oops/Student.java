package com.oops;

public class Student {
	
	int id;
	String name;
	double per;

	public static void main(String[] args) {
		
		//int x;
		//System.out.println(x);
		
		//System.out.println(id);
		
		//Student stud;
		//stud=new Student();
		
		Student stud=new Student();
		System.out.println(stud.id+" "+stud.name+" "+stud.per);
		
		
		stud.id=101;
		stud.name="Sneha";
		stud.per=78.56;
		
		System.out.println(stud.id+" "+stud.name+" "+stud.per);

		Student stud2=new Student();
		
		System.out.println(stud2.id+" "+stud2.name+" "+stud2.per);
	}
    }
