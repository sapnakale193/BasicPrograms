package com.Homework;

import java.util.Arrays;

public class ArrayTask {
	
	public void replace(int a[]) {
		
		for (int i=0; i <a.length;i++)
		{
			int temp=1;
		
			if(a[i]%2==0) {
				
				a[i]=temp;
		}
		}
	System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		
		int a[]= {3,4,5,6,7,8};
		
		System.out.println(Arrays.toString(a));
		
		ArrayTask r=new ArrayTask();
		r.replace(a);
	}

}
