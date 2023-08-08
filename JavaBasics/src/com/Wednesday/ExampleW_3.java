package com.Wednesday;

class Human
{
	protected String name;
	protected String gender;

	Human(String name,String gender)
	{
		this.name=name;
		this.gender=gender;
	}
	public void find(int mage,int wage)
	{
		if(mage>wage)
		{
			System.out.println("Man is elder");
		}
		else
		{
			System.out.println("Woman is elder");
		}
	}
}
class Man extends Human
{
	int mage;
	Man(String name,String gender,int mage)
	{
		super(name,gender);
		this.mage=mage;
	}
}
class Woman extends Human
{
	int wage;
	Woman(String name,String gender,int wage)
	{
		super(name,gender);
		this.wage=wage;
	}
}

public class ExampleW_3 {
	public static void main(String[] args) {
    
		Human h = new Human("Raj","Male/Female");
		
		Man m = new Man("Daksh","Male",33);
	
		Woman w = new Woman("asma","Female",30);
		
		h.find(33,30);
	}
	}


