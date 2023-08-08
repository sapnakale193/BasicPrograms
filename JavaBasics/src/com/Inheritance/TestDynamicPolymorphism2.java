package com.Inheritance;

class Mobile{
	
	public void msg() {
		System.out.println("Mobile msg() method");
	}
		public void Notification() {
		System.out.println("android notification method");	
	}
    }

class Basic extends Mobile{
	
	public void msg() {
		System.out.println("Basic msg ()method");
	}

	public void player() {
		
		System.out.println("player method from child class");
   }
   }
      
   class Android extends Mobile{
	public void msg() {
}
	public void Notification() {
		System.out.println("android notification method");
	}
    }
	
   public class TestDynamicPolymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Mobile m1=new Mobile();
	m1.msg();//parent 
	
	Mobile m2=new Basic();
	m2.msg();//Child
	
	Mobile m3=new Android();
	m3.msg();
	
	Mobile m4=new Android();
	m4.Notification();
	
	}
	}
    

