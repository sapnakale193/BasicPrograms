package com.Kalyani_Mam_OOPSCode;

class shape{
	
	public int draw()
	{
		System.out.println("Shape class");
		return 0;	
	}
    }

class Rectangle extends shape{
	
	public int draw()
	{
		System.out.println("Rectangle class");
		return 0;	
	}
    }

    public class TestMethodOverriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shape s1=new shape();
		s1.draw();
		
		Rectangle r1=new Rectangle();
		r1.draw();
		
		shape s2=new Rectangle();
	}
    }
