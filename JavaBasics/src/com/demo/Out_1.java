package com.demo;

public class Out_1 {
	
	public static void main(String[] args) {

		A a = new A(4, "abc");

		System.out.println(a.i + a.s);
	}
    }
    class A {
	int i;
	String s;

	A(int i, String str) {
		i = i;
		s = str;
	}
    }