package com.Arraycodes;

import java.util.Arrays;

public class SortingArray {
	
	public void sortArray(char ch[]) {
	
		System.out.println(Arrays.toString(ch));
		
		for (int i = 0; i < ch.length; i++) {
		for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
			}
			}
		    }
		System.out.println(Arrays.toString(ch));
	    }

	     public static void main(String[] args) {
	     char ch[] = { 'u', 'P', 'a', 'B' };
	     SortingArray as = new SortingArray();
	     as.sortArray(ch);

	}
   }



