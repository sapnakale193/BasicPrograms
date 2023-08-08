package com.Inheritance;

public class Vehicle_Main {

	public static void main(String[] args) {
		
		Vehicle1 vehicle = new Vehicle1();
        Car car = new Car();

        System.out.println(vehicle.accelerate(60)); 
        System.out.println(vehicle.stop()); 
        System.out.println(vehicle.run());

        System.out.println(car.accelerate(80)); 
        System.out.println(car.stop()); 
        System.out.println(car.run()); 
    }
	}

