package com.assigncode;

public class Person1 {

	int id;
	String name;
	Address adr;

	public Person1(int id, String name, Address adr) {

		this.id = id;
		this.name = name;
		this.adr = adr;
	}

	public void showperson() {

		System.out.println(id + " " + name);
		adr.showAdr();
	}

	public String toString() {
		return id + " " + name + "  " + adr;
	}

	public static void main(String[] args) {

		Person1 p = new Person1(101, "Sneha", new Address(122, "pune"));

		System.out.println(p);
	}

    }
