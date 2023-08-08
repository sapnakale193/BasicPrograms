package com.Monday;

interface Shape {
    void draw();
    void erase();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
    }

public class ExamoleNo1 {
	
	public static void main(String[] args) {
		Shape s1 = new Circle();
		Shape s2 = new Triangle();
		Shape s3 = new Square();

		s1.draw(); 
		s2.draw(); 
		s3.draw(); 
		s1.erase(); 
		s2.erase(); 		
		s3.erase(); 
	}
    }

