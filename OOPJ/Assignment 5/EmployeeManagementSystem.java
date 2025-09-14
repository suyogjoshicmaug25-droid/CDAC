// Problem 26: Employee Management System

import java.util.*;
class Employee{
	private String name;
	private double salary;
	
	public Employee(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
}
class EmployeeManagementSystem{
	public static void main(String[] args){
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Amit", 50000));
		list.add(new Employee("Priya", 60000));
		
		
		System.out.println("Employee List: ");
		for(Employee emp: list){
			System.out.println(emp.getName()+" : "+emp.getSalary());
		}
		
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac EmployeeManagementSystem.java

D:\CDAC\OOPJ\Assignment 5>java EmployeeManagementSystem
Employee List:
Amit : 50000.0
Priya : 60000.0
*/