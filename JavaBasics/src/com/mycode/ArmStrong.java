package com.mycode;

import java.util.Scanner;

public class ArmStrong {
	
	public static void main(String[] args) {
		// Armstrong number
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int copy = num;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}

		System.out.println(sum);
		num = copy;
		if (sum == num) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not");
		}

	}

}


