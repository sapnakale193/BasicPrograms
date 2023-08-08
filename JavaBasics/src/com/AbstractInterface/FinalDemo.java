package com.AbstractInterface;

public class FinalDemo {
	
	final int x;
	
	FinalDemo() 
	{
		x=780;
	}

	public void input ()
	{
		//x=300;
	}
   
	public void show()
	{
		System.out.println(x);
	}

public static void main(String[] args) {
	
	FinalDemo d= new FinalDemo ();
	d.input();
	d.show();
}

}
