package com.AbstractInterface;



interface Drawable
{
	
}
class Shape implements Drawable
{
	public void show()
	{
		System.out.println("hiii");
	}
	
	
}

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s=new Shape();
		s.show();

	}
}
