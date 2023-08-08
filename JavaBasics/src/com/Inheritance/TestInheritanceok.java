package com.Inheritance;

class Person1{
	
	protected String name;
	protected int age;
	protected String email;
	protected String contact;


    Person1(String name, int age, String email, String contact)
    {
    	this.name=name;
    	this.age=age;
    	this.email=email;
    	this.contact=contact;
    }

    public void show() { 
    	System.out.println("Name:\t"+name);
    	System.out.println("Age:\t"+age);
    	System.out.println("Email:\t"+email);
    	System.out.println("Contact:\t"+contact);
    }
}
    class Teacher extends Person1{
	
	float salary;
	String Degree;
	Teacher(String name, int age, String email, String contact,String string, String Degree, float salary){
		super(name,age,email,contact);
	
	     this.salary=salary;
	     this.Degree=Degree;
	}
   
    public void show() {
    	System.out.println("Salary\t:"+salary);
    	System.out.println("Degree\t:"+Degree);
    }
    }

   public class TestInheritanceok {
	
	public static void main(String[] args) {
		
	Person1 p1=new Person1("Sapna",40,"sapnakale@gmailcom","9284122554");
	p1.show();
	System.out.println("------------------------");
	Teacher T1=new Teacher("Trisha",45,"Trisha@gmail.com","9156079523","800000","M.sc CCT", 67);
	T1.show();
	}
	}
	

	


