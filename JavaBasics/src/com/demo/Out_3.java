package com.demo;

public class Out_3 {
	
	public static void main(String[] args) {
		
		AB ab= new AB();
		ab.showVar();
	}
}

    class AB {
    	static int rollNo;
         static String name;
    	
    	public static void showVar() {
    		
    	System.out.println("roll no=  "+ rollNo + " name=" + name);
    	}
    	
    	}