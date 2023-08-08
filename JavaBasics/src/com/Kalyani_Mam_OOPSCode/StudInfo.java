package com.Kalyani_Mam_OOPSCode;

public class StudInfo {
	
	int id;
	String name;
	double marks;
	
	
	public StudInfo(int sid, String sname, Double mk)
	{
		id=sid;
		name=sname;
		marks=mk;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+marks);
	}
	
     public static void main(String[] args) {
		
	 StudInfo s=new StudInfo(101, "neha",89.45);
	 s.display();
     
	 StudInfo s2=new StudInfo(102, "Sakshi", 90.99);
	 s2.display();
     }
     }






