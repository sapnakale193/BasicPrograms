package com.Wednesday;

class Contact {
    private String name;
    private String email;
    private String phone;

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void printContact() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
    }

class CompanyContact extends Contact {
    private String companyName;
    private String companyAddress;

    public CompanyContact(String name, String email, String phone, String companyName, String companyAddress) {
        super(name, email, phone);
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    public void printContact() {
        super.printContact();
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
    }
    }

class EmployeeContact extends Contact {
    private String employeeId;
    private String department;

    public EmployeeContact(String name, String email, String phone, String employeeId, String department) {
        super(name, email, phone);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void printContact() {
        super.printContact();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
    }

public class ExampleW_2 {
	public static void main(String[] args) {
		
   Contact contact = new Contact("Sapna Kale", "Sapnakale193@example.com", "123-456-7890");
   contact.printContact();

    CompanyContact companyContact = new CompanyContact("Pooja Hake", "PoojaHake@example.com", "987-654-3210", "Acme Inc.", "123 Main St.");
    companyContact.printContact();

	EmployeeContact employeeContact = new EmployeeContact("Asha Ghadge", "AshaGhadge@example.com", "555-555-5555", "12345", "Sales");
     employeeContact.printContact();
	    }	
	    }


