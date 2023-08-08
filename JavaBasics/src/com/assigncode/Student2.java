package com.assigncode;

import java.util.Scanner;

public class Student2 {

	int id;
	String name;
	int m1;
	int m2;
	int m3;
	double per;

	public void accept(int sid, String sname, int mk1, int mk2, int mk3) {

		id = sid;
		name = sname;
		m1 = mk1;
		m2 = mk2;
		m3 = mk3;
	}

	public void calculatePercentage() {

		per = (m1 + m2 + m3) / 3;

	}

	public void displaydetails()

	{
		System.out.println(id + " " + name + " " + m1 + " " + m2 + " " + m3 + " " + per);

	}

	public static void main(String[] args) {

		Student2 stud = new Student2();
		stud.accept(101, "sapna", 77, 90, 45);
		stud.calculatePercentage();
		stud.displaydetails();

	}
}
