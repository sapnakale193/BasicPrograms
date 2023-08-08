package com.Kalyani_Mam_OOPSCode;

public class ThisUse1 {
	
	int x;
	public void input(int x)
	{
		this.x=x;
	}
	public void show()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
			ThisUse1 t=new ThisUse1();
			t.input(300);
			t.show();	
	}
    }



