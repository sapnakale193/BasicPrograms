package com.Lab_Session;

public class Bike {
	
	
	String name;
	String Brandname;
	String colour;
	int speed;
	int modelNo;
	
	public Bike() {
		this("Pulsar","Honda","Black",80,111);
	}

	public Bike(String name, String Brandname, String colour, int speed, int modelNo) {
		// TODO Auto-generated constructor stub
		
		    
		    this.colour = colour;
		    this.Brandname = Brandname;
		    this.speed=speed;
		    this.modelNo=modelNo;
	}

	Bike (String name){
		this.name=name;
	}
	 
	public static void main(String[] args) {
	
		Bike bike=new Bike();
		
		System.out.println("The brandname of bike is:"+ "Honda");
		System.out.println("The colour of the bike is:"+ "Black");
		System.out.println("The Speed of the bike is:"+ "60");
	    
	}	
	}

