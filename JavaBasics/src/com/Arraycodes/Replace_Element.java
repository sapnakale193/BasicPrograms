package com.Arraycodes;

import java.util.Arrays;

public class Replace_Element {
	
	public void replece(int a[]) {
	
	System.out.println(Arrays.toString(a));
		
	for (int i = 0; i < a.length; i++) {
			
	   if (a[i] < 0) {
	
      a[i] = a[i + 1] * a[i + 1];
		
	   }
	   }

		System.out.println(Arrays.toString(a));
       }

	 public static void main(String[] args) {
		int a[] = { 6, 5, -3, 2, -3, 4 };

		Replace_Element r = new Replace_Element();
		r.replece(a);

	}
	 }



