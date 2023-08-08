package com.Kalyani_Mam_OOPSCode;

public class OverLoadDemo {
	
	
	public void calculate(int x, int y)
	{
		System.out.println("Addition= "+(x+y));
	}
	
	public void calculate(int a, int b, int c)
	{
		System.out.println("Multiplication= "+(a*b*c));
	}
	
	public void calculate(float a, int b)
	{
		System.out.println(a/b);
	}
	
	public float calculate (float c, float d)
	{
		return c-d;
	}
	
	public float calculate(int x, float y)
	{
		return x+y;
		
	}
	public static void main(String[] args) {
		
		System.out.println(89);
		System.out.println("pune");
		System.out.println(90.56);
		System.out.println('u');
		
		
		OverLoadDemo over=new OverLoadDemo();
		over.calculate(7.8f, 7);
		over.calculate(5, 2);
		
	}

}
