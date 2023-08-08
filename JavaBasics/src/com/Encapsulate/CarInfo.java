package com.Encapsulate;

public class CarInfo {
	
	public static void main(String[] args) {
		
		Car c=new Car();
		c.setModel(12233);
		c.setCname("Audi");
		c.setPrice(7800000);
		c.setSpeed(100);
		
		if(c.getSpeed()<=120)
		{
			System.out.println(c.getModel()+" "+c.getCname()+" "+c.getSpeed());
		}
		else 
		{
			System.out.println("You crossed your limit");
			}
		    }
	        }


