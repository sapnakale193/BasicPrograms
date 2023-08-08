package com.AbstractInterface;

public class Interface1 {
	
final int x;//blank final variable
	
	Interface1()
	{
		x=780;
	}
	public void input()
	{
		//x=300;
	}
	public void show()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		  FinalDemo d=new FinalDemo();
		  d.input();
		  d.show();

	}
	}



