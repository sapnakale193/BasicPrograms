package com.Inheritance;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class ExampleNo4 {
	public static void main(String[] args) {
		Shape s1 = new Circle();
        Shape s2 = new Square();
        Shape s3 = new Rectangle();

        s1.draw(); 
        s2.draw(); 
        s3.draw(); 
    }
	}

