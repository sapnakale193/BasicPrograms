package com.Wednesday;

class Bank {
    int getInterest() {
        return 0;
    }
    }

class SBI extends Bank {
    int getInterest() {
        return 5;
    }
    }

class ICICI extends Bank {
    int getInterest() {
        return 6;
    }
    }

class AXIS extends Bank {
    int getInterest() {
        return 7;
    }
    }

public class ExampleW_7 {
   public static void main(String[] args) {
	   Bank sbi = new SBI();
       Bank icici = new ICICI();
       Bank axis = new AXIS();
       System.out.println("SBI interest rate: " + sbi.getInterest() + "%");
       System.out.println("ICICI interest rate: " + icici.getInterest() + "%");
       System.out.println("AXIS interest rate: " + axis.getInterest() + "%");
   
	}
    }
