package com.Arraycodes;

import java.util.Arrays;

public class MergeArray {
	
	public void merge (int a[], int b[], int merge[]) {
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int k=0;
		
		for (int i = 0; i < a.length; i++) {
			merge[k] = a[i];
			k++;
		}

		for (int i = 0; i < b.length; i++) {
			boolean isvisited = false;
			for (int j = k - 1; j >= 0; j--) {
				if (b[i] == merge[j]) {
					isvisited = true;
					break;
				}
			}
			if (isvisited == false) {

				merge[k] = b[i];
				k++;
			}
		}

		
	}

}
