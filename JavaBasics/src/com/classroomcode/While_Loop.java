package com.classroomcode;

import java.util.Scanner;

public class While_Loop {
	
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in); 
	        
		 System.out.println("Enter the number: ");
	        int n=sc.nextInt();      
	        int i=1;
	        System.out.println("The multiplication table of "+n+" is: ");
	            
	        while(i<=10)
	       
	        {
	           System.out.println(n+" * "+i+" = "+ (n*i));
	            i++;
	        }  
	        }
	        }
