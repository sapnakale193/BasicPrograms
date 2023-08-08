package com.AccessModifier;

public class Person {

	private String name;
	private String gender;
	private int age;
	private Adress address;
	
	public Person (String name, String gender, Adress address) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.address=address;
	}
	
	public String getName()
	{ 
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public Adress getaddress()
	{
		return address;
	}
	
	public void setAdress (Adress address) {
		this.address=address;
	}
	public static void main(String[] args) {
		
		Adress address1=new Adress ("New york", "NY", "USA");
		Person person1=new Person("john", "Male, 25, address1", address1);
		System.out.println("Name: "+ person1.getName());
		System.out.println("Gender: "+ person1.getGender());
		System.out.println("Age: "+ person1.getAge());
		System.out.println("Adress: "+ person1.getaddress().getCity()+ ", "+ person1.getaddress().getState()+", " + person1.getaddress().getCountry());
			
	
	}

}
