package com.oops;

public class Car {
	
	int modelNo;
	String carname;
	int carprice;
	
	public void acceptDetails(int mod, String Cname, int Price) {
		
		modelNo=mod;
		carname=Cname;
		carprice=Price;	
	}
	
	public void display () {
		
		System.out.println(modelNo+" "+carname+" "+carprice);
	}
	
	public static void main(String[] args) {
	Car alto=new Car();
	alto.acceptDetails(111, "Swift", 700000);
	alto.display();
	
	Car alto2=new Car();
	alto2.acceptDetails(222, "BMW", 800000);
	alto2.display();
	
	Car alto3=new Car();
	alto3.acceptDetails(333, "Audi", 900000);
	alto3.display();
		
	}
    }
