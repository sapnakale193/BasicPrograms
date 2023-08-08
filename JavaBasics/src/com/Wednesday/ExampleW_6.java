package com.Wednesday;


class Rectangle {
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }
}

class Box extends Rectangle {
    int depth;

    Box(int l, int w, int d) {
        super(l, w);
        depth = d;
    }
}

public class ExampleW_6 {
	
	public static void main(String[] args) {
        Box box = new Box(3, 4, 5);
        System.out.println("Area of rectangle: " + box.area());
        System.out.println("Volume of box: " + box.area() * box.depth);
    }		
	}


