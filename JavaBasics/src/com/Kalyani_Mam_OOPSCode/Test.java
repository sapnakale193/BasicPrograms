package com.Kalyani_Mam_OOPSCode;

public class Test {
	
	public Test()
	{
		//this("Test");
		System.out.println("Default");
	
	}
	public Test(String s)
	{
		this(10,s);
		System.out.println(s);
	}
	public Test(int x,String str)
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		//Test t=new Test();
		Test t=new Test("Test");

	}
    }
