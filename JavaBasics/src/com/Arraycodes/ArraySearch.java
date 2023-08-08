package com.Arraycodes;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
	
	public void searchElement(int[] a, int n) {
		boolean ispresent=false;
		
		for(int i=0; i<a.length; i++) {
			
			if (a[i]==n) {
				
				ispresent= true;
			}
	        }
	
	  if (ispresent==true) {
	  System.out.println("Element is present");
	  }
	    
	  else {
		  
	  System.out.println("Not Present");
	  }
	  }	     
	  public static void main(String[] args) {
	    	  
	    int[]a = {2,4,2,8};
	    	  
	   System.out.println(a);
	    	  
 	   Scanner sc=new Scanner(System.in);
 	   System.out.println("Enter the number for seraching");
	    	  
	   int num= sc.nextInt();
  	   ArraySearch as= new ArraySearch ();
  	   as.searchElement (a, num);
			
		}
	    }


