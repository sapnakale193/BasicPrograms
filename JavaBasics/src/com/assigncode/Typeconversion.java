package com.assigncode;

public class Typeconversion {

	public void input(byte x) {
		System.out.println("int");
	}

	public void input(short l) {
		System.out.println("long");
	}

	public int calculate(int x) {

		double area = 3.14 * x * x;

		return (int) area;
	}

	public double checkArea(int r) {
		return 3.14 * r * r;
	}

	public static void main(String[] args) {

		Typeconversion c = new Typeconversion();
		int x = 100;

		int ans = c.calculate(4);
		System.out.println(ans);

		double area = c.checkArea(4);
		System.out.println(area);

		int Area = (int) (c.checkArea(4));
		System.out.println(area);

	}
    }
