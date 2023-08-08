package com.Monday;

interface Bike {
    void offer();
    default void details() {
        System.out.println("This is a Bike");
    }
}

interface Scooty {
    void offer();
    default void details() {
        System.out.println("This is a Scooty");
    }
}

class BuySomething implements Bike, Scooty {
    public void offer() {
        System.out.println("Offer available on both Bike and Scooty");
    }
    public void details() {
        Bike.super.details();
        Scooty.super.details();
    }
}
public class Main {
public static void main(String[] args) {
	
	BuySomething bs = new BuySomething();
    bs.offer();
    bs.details();
}	
}

