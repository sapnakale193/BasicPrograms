package com.assigncode;

public class Car {
	
	int modelno;
	String car_name;
	int price;

	public Car(int m_id, String cname, int car_price) {
		modelno = m_id;
		car_name = cname;
		price = car_price;

	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public void showCar() {
		System.out.println(modelno + " " + car_name + " " + price);
	}

	public static void main(String[] args) {

		Car c = new Car(123, "BMW", 890000);
		c.showCar();

	}

}

