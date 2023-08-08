package com.demo;

public class Class_Loop1 {
	
	public static void main(String[] args) {
		
			//find the sum of even number between 1 to 10;
			
			int sum=0;
			for(int i=1;i<=10;i++)
			{
				if(i%2==0)
				{
					sum=sum+i;
				}
			}
			
			System.out.println("Sum= "+sum);

		}
	}


