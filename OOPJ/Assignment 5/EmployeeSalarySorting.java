// Problem 27: Employee Salary Sorting 

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

class EmployeeSalarySorting{
	public static void main(String[] args){
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Amit", 50000));
		list.add(new Employee("Priya", 60000));
		list.add(new Employee("Rohan", 45000));
		
		
		Collections.sort(list, Comparator.comparingDouble(Employee::getSalary));
		
		for(Employee emp: list){
			System.out.println(emp.getName()+" : "+emp.getSalary());
		}
		
		
	}
} 

/*
D:\CDAC\OOPJ\Assignment 5>javac EmployeeSalarySorting.java
D:\CDAC\OOPJ\Assignment 5>java EmployeeSalarySorting
Rohan : 45000.0
Amit : 50000.0
Priya : 60000.0
*/