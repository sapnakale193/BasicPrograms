package com.Inheritance;

class Company {
    public void address() {
        System.out.println("This is the address method in the Company class.");
    }
}

class eBay extends Company {
    @Override
    public void address() {
        System.out.println("This is the address method in the eBay class.");
    }
}

public class ExampleNo2 {
	public static void main(String[] args) {
		 Company company = new Company();
	        company.address(); 
	        eBay ebay = new eBay();
	        ebay.address(); 	
	}
}
