package com.oops;

public class Item_Price {
	
	int eid;
	String Productname;
	int Price;
	
	public void acceptDetails(int id, String name, int sal) {
		
		eid=id;
		Productname=name;
		Price=sal;	
	}
	
	public void display() {
	
		System.out.println(eid+" "+Productname+" "+Price);	
	}
	public static void main(String[] args) {
		
		Item_Price emp=new Item_Price();
		emp.acceptDetails(101, "Headphone",7000);
		

		emp.display();
	
	    Item_Price emp2=new Item_Price();
	    emp2.acceptDetails(102, "Laptop", 60000);
	    emp2.display();
	}	
	}


