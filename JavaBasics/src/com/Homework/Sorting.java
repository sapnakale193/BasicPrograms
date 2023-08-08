package com.Homework;

import java.util.Arrays;

public class Sorting {
	
	public void sorting (char ch[])
	{
		for (int i=0; i<ch.length;i++)
		{
			for (int j=i+1;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	
	System.out.println(Arrays.toString(ch));
	}
	
	public static void main(String[] args) {
		
		char ch[]= {'b','d','a','e','f'};
		
		System.out.println(Arrays.toString(ch));
		
		Sorting s=new Sorting();
		s.sorting(ch);
	}
}
