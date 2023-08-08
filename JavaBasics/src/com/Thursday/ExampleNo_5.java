package com.Thursday;



	abstract class Equipment {
	    // Concrete method
	    public void fill() {
	        System.out.println("Equipment is filled.");
	    }
	    
	    // Abstract method
	    public abstract void mix();
	}
	
	class Cement_mixer extends Equipment {
	    // Implementing the abstract method
	    public void mix() {
	        System.out.println("Cement is being mixed.");
	    }
	    
	    // Another method in Cement_mixer
	    public void pour() {
	        System.out.println("Cement is being poured.");
	    }
	    }
	
	public class ExampleNo_5 {
	public static void main(String[] args) {
		
		Cement_mixer cm = new Cement_mixer();
	    cm.fill();
	    cm.mix();
	    cm.pour();
	    
	    Equipment e = new Cement_mixer();
	    e.fill();
	    e.mix();

	}
    }
