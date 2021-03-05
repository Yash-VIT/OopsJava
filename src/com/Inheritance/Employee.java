package com.Inheritance;

public class Employee extends Person{
	String title, employer, employeeGrade;
	double salary;
	
	public Employee(String name, String phone, String email, String title, String employer, String employeeGrade,
			double salary) {
		super(name, phone, email);
		this.title = title;
		this.employer = employer;
		this.employeeGrade = employeeGrade;
		this.salary = salary;
	}
	
	public String toString()
	{
		return("Details of the employee : \n"+"Name : "
				+this.name+"\nPhone : "+this.phone+"\nEmail : "
				+this.email+"\nTitle : "+this.title
				+"\nSalary : "+this.salary+"\nEmployer : "+this.employer
				+"\nEmployer Grade : "+this.employeeGrade);
	}
}
