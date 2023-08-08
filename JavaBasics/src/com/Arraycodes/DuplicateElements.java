package com.Arraycodes;

import java.util.Arrays;

	public class DuplicateElements {
	    
	public static void main(String[] args) {
	       
		
	int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
	      
      int n = arr.length;

	        // Sort the array
	        Arrays.sort(arr);

  // Find the duplicate elements
	 for (int i = 0; i < n - 1; i++) {
	           
     if (arr[i] == arr[i + 1]) {
    
    	 System.out.println("Duplicate element: " + arr[i]);
	     
     }
     }
     }
	 }


