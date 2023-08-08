package com.Inheritance;

class Hero{
	void readScript1() {
		System.out.println("Actor is reading script of movie RRR");}
}
	
class Actor12 extends Person{
	
	void readScript2() {
		System.out.println("Actor is readig script of movie ROY");
	}
}
public class Bollywood {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Hero p=new Hero();
				p.readScript1();
				
				Actor a=new Actor();
				a.readScript();
	}
    }
