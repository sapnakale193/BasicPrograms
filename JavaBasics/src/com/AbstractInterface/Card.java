package com.AbstractInterface;

abstract class Card {
	
	int x;
	static int rate;
	public Card(String type)
	{
		System.out.println("This is Card "+type);
	}
	
	abstract void showInvitation();
	public void showPrice()
	{
		System.out.println("300");
	}	
    }
    class BirthdayCard extends Card
    {
	
	BirthdayCard()
	{
		super("magic");
	}
	void showInvitation()
	{
		
		System.out.println("Hi this is birthday card");
	}
	}
   class AnniversaryCard extends Card
{
	AnniversaryCard()
	{
		super("magic");
	}
	void showInvitation()
	{
		System.out.println("Hi this is Anniversary");
	}
    }

