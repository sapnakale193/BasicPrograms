package com.Kalyani_Mam_OOPSCode;

public class AccessModifiers {
	
	private int x=10;
	
	int y=700;
	
	protected int z=90;
	public int p=66;
	
	private void doprivate()
	{
		System.out.println("Private");
	}

	public static void main(String[] args) {
		
		AccessModifiers a=new AccessModifiers();
		System.out.println(a.x);
		a.doprivate();
		System.out.println(a.y);
		System.out.println(a.z);
		System.out.println(a.p);
		
	}
    }
