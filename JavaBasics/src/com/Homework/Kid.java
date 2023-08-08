package com.Homework;

public class Kid {
	
	 public void readBook() {
	        System.out.println("Kid is reading a book.");
	    }

	    public void readBook(String bookName, int pageNumber) {
	        System.out.println("Kid is reading " + bookName + " on page " + pageNumber + ".");
	    }
	}

	class BigKid extends Kid {
	    @Override
	    public void readBook() {
	        System.out.println("BigKid is reading a book.");
	    }
	}

	
	   