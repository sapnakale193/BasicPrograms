package com.champions;

public class Unary_Opeartor {
	
	public static void main(String[] args) {
		
		int a=2;
		int b=2;
		
		int x= ++a  +  b++;
		System.out.println(x+" "+a+" "+b);
		
		x= a-- - ++b  + a; 
		System.out.println(x+ " "+a+" "+b);
		
		x= a++  +  ++b;
		System.out.println(x+" "+a+" "+b);
		
		x=++a  -  --b  -  b;
		System.out.println(x+" "+a+" "+b);
		
		x=a--  -  b--  -  b;
		System.out.println(x+" "+a+" "+b);
		
		x= --a  -  ++b  +  a++;
		System.out.println(x+" "+a+" "+b);
		
	
	}

    }
