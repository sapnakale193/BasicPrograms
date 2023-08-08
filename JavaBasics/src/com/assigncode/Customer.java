package com.assigncode;

public class Customer {
	
	private int id;
	private String name;
	private int balance=10000;
	
	
	public void setId(int id) {
		
		this.id=id;
	}
	
	public void setName(String name) {
		
		this.name=name;
	}

    public void SetBalance(int balance)
    {
    	this.balance=balance;
    }
    
    public int getId() {
    	return id;
    }

    public String getName() {
		return name;
    	
    }

    public int getBalance(int amount) {
     
    	amount=amount-balance;
    	return balance;
    }
    }

  