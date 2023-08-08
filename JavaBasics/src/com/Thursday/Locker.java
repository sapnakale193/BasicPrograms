package com.Thursday;

public class Locker {
	
	    private String money;
	    private String jewellery;
	    private int pinCode;

	    public Locker(String money, String jewellery, int pinCode) {
	        this.money = money;
	        this.jewellery = jewellery;
	        this.pinCode = pinCode;
	    }

	    private void displayContents() {
	        System.out.println("Contents of the locker:");
	        System.out.println("Money: " + money);
	        System.out.println("Jewellery: " + jewellery);
	        System.out.println("Pin Code: " + pinCode);
	    }

	    public static void main(String[] args) {
	        Locker locker = new Locker("400000", "Diamond necklace", 18902);
	        locker.displayContents();
	    }
        }
