package com.AbstractInterface;

public class InterfaceDemo {
	
	 public static void main(String[] args) {
			Movable m= new Bus();
			m.move();
			m.run();
			
			Bus b =new Bus();
			b.run();
			b.move();
			
			Movable.stop();

	 }
}
