package com.Inheritance;

public class Vehicle1 {

	public String accelerate(long mph) {
        return "Vehicle is accelerating at " + mph + " mph.";
    }

    public String stop() {
        return "Vehicle has stopped.";
    }

    public String run() {
        return "Vehicle is running.";
    }
    }

   class Car extends Vehicle1 {
    @Override
    public String accelerate(long mph) {
        return "Car is accelerating at " + mph + " mph.";
    }
    }

