package com.champions;

public class TernaryDemo {
	
	public static void main(String[] args) {
		
		int num1=4;
		int num2=7;
		int num3=5;		
	
	String str = num1>num2?num1>num3?"num1":"num3":num2>num3?"num2":"num3";
	
	System.out.println(str);
	
	String result = num1>num2?"num1 is greater":"num2 is greater";
	System.out.println(result);
	
	
	}
    }
