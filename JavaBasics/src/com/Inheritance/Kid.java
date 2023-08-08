package com.Inheritance;

 public class Kid {
    public void readBook() {
        System.out.println("Kid is reading a book.");
    }
    
    public void readBook(String bookTitle, int pageNumber) {
        System.out.println("Kid is reading " + bookTitle + " on page " + pageNumber + ".");
    }
}

 class Bigkid extends Kid{
    @Override
    public void readBook() {
    System.out.println("BigKid is reading a book with advanced vocabulary.");
     
    }
    }
