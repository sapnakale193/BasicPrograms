package com.Arraycodes;

import java.util.Scanner;

public class Araycreation {
	
	public static void main(String[] args) {
		
		int num=10;
		
		int arr[]= {7,4,2,3};// Initialization of array
		
		int a[]=new int[5]; // declaration of array
		
		a[0]=4;//now u have given size of 5 and u try to give 5th index coz of it is not present ur size started from 0 so we can not give 5th index to this array
	    a[1]=8; // elements of array
	    a[2]=23;
	    a[3]=12;
	    a[4]=8;
	
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the array Elements");
	    
	    System.out.println("................................");
	    
	    for (int i=0;i<a.length;i++) {
	    	a[i]=sc.nextInt();
	    }
	
	    for (int i=0;i<a.length;i++) {
	    	System.out.println(a[i]);// If we try to display a we will get hashcode
	    }
	}

}
