package com.Inheritance;
//ThisSuperDemo add additional classes use this keyword, Super keyword, constructor and  method variable 
//Only two constructor are allowed in one class default and parameterized constructor 
//Anything which is happening with runtime its generally related to object

class Student {
	
	int rollno;
	String name;
	float fee;
	
	Student(int rollno,String name,float fee){
		
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	
	Student(int rollno,String name,String course,float fee){  
	this(124,"Sharda",90000);//reusing constructor  
	this.fee=fee;  
	
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}

   public class ThisSuperDemo {

	public static void main(String[] args) {
		
	Student s1=new Student(112, "Sneha", 50000);
	Student s2=new Student(113,"Rashi",60000);
	s1.display();
	s2.display();
		
    }
	}
    }
   
   
