package com.Wednesday;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}

     public class ExampleW_8 {
	
	public static void main(String[] args) {
		
		  Shape s;
	        s = new Circle();
	        s = new Square();
	        s.draw();
	}	
	}


