package com.AbstractInterface;

interface Movable {
	
	int x = 23;

	void move();

	default void run() {

		System.out.println("runn");
	}

	static void stop() {

		System.out.println("Stop..");
	}
    }

class Bus implements Movable {

	public void move() {

    System.out.println("Bus is moving");

	}
    }
 