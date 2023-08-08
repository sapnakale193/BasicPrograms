package com.Kalyani_Mam_OOPSCode;

public class Student {
	 
	//Also find out the grade with percentage of student
	
	int id;
	String name;
	int hindi;
	int english;
	int maths;
	double per;
	
	
	public void accept(int sid, String sname, int s1, int s2, int s3)
	{
		id=sid;
		name=sname;
		hindi=s1;
		english=s2;
		maths=s3;	
	}
    
	public void calculatePercentage()
	{
		per=(hindi+english+maths)/3;
     }

     public void displayDetails()
     {
    	 System.out.println(id+" "+name+" "+hindi+" "+" "+"english"+" "+"maths"+" "+per);
     }
 
     public static void main(String[] args) {
		
    	 Student stud=new Student();
    	 stud.accept(1, "Sapna", 88, 67, 89);
    	 stud.calculatePercentage();
    	 stud.displayDetails();
    	 
    	 stud.accept(02,"Akshay",60,90,78);
    	 stud.calculatePercentage();
    	 stud.displayDetails();
    	 
	}
    }