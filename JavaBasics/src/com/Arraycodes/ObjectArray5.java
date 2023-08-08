package com.Arraycodes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Movie {
	int mid;
	String mname;
	String [] actorname;
	
	Movie (int mid, String mname, String [] actorname) {
		
		this.mid=mid;
		this.mname=mname;
		this.actorname=actorname;	
	}

     public String tostring() {
		
    	 return mid + " " + mname + " " + Arrays.toString(actorname);	 
     }
     }

    public class ObjectArray5 {
	
	public static void main(String[] args) {
		
		Movie m[] =new Movie [2];
		Scanner sc=new Scanner (System.in);
		
		for (int i = 0; i<m.length; i++) {
			
			System.out.println("Enter the movie id");
			int mid= sc.nextInt();
			
			System.out.println("Enter the movie name");
			String name=sc.next();
			
			System.out.println("Enter actor name for Movie");
			
			String [] ac=new String [2];
			
			for (int j=0; j<ac.length; j++) {
				
				ac[j]=sc.next();
				
				}
				
			m[i]= new Movie (mid, name, ac);
			
		}
		
		System.out.println("...................");
		
		for (int i= 0; i< m.length; i++) {
			
			System.out.println(m[i]);
		}
	}

}
