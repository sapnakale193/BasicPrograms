
	package com.Arraycodes;

	import java.util.Scanner;

	class Student {
		int id;
		String name;
		double marks;

		public Student(int id, String name, double marks) {
			this.id = id;
			this.name = name;
			this.marks = marks;
		}
		 public String toString()
		 {
		 return id+" "+name+" "+marks;
		 }
	     }

	    public class ArrayOfObject {

		public static void main(String[] args) {
			Student s[] = new Student[3];

//			s[0] = new Student(101, "yash", 67);
//			s[1] = new Student(102, "Neha", 77.56);
//			s[2] = new Student(102, "sonia", 66.45);
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Entre Students Details");
			
			for(int i=0;i<s.length;i++)
			{
				System.out.println("enter the id");
				int sid=sc.nextInt();
				System.out.println("enter the name");
				String sname=sc.next();
				System.out.println("Enter the marks");
				double mk=sc.nextDouble();
				
				s[i] = new Student(sid, sname, mk);
				
			}

			for (int i = 0; i < s.length; i++) {
				//System.out.println(s[i].id + " " + s[i].name + " " + s[i].marks);
				System.out.println(s[i]);
			}
			System.out.println(".................................................");
			
			for(Student stud:s)
			{
				System.out.println(stud);
			}

		     }

	        }



