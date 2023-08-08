package com.Encapsulate;

public class Car {
	
	private int model;
	private String Cname;
	private int price;
	private int speed;
	
	public void setModel(int model)
	{
		this.model=model;
	}
    public void setCname(String Cname)
    {
    	
    	this.Cname=Cname;
    }
    
     public void setPrice(int price) 
    
     {
    		this.price=price;
     }
  
     public void setSpeed(int speed)
     {
    	 this.speed=speed;
     }
     
    public int getModel()
    {
    	return model;
    }
    
    public String getCname()
    {
    	return Cname;
    }
    
    public int getPrice()
    {
    	return price;
    }
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}
    }