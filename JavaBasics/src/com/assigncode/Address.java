package com.assigncode;

public class Address {
	
	int pincode;
	String city;
	
	Address(int pincode,String city)
	{
		this.pincode=pincode;
		this.city=city;
	}
	public void showAdr()
	{
		System.out.println(pincode+" "+city);
	}
	public String toString()
	{
		return pincode+" "+city;
	}
    
    }


	
	





