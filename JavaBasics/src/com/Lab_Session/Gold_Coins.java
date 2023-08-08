package com.Lab_Session;

public class Gold_Coins {
	
	  public static void main(String[] args) {
	        int age = 10;
	        int coins = 0;

	        switch (age) {
	            case 1:
	                coins = 1;
	                break;
	            case 2:
	                coins = 8;
	                break;
	            case 3:
	                coins = 27;
	                break;
	            case 4:
	                coins = 64;
	                break;
	            case 5:
	                coins = 125;
	                break;
	            case 6:
	                coins = 216;
	                break;
	            case 7:
	                coins = 343;
	                break;
	            case 8:
	                coins = 512;
	                break;
	            case 9:
	                coins = 729;
	                break;
	            case 10:
	                coins = 1000;
	                break;
	            default:
	                System.out.println("Invalid age.");
	                break;
	        }

	        System.out.println("Meenu can get " + coins + " gold coins for her " + age + "th birthday.");
	    }
	}


