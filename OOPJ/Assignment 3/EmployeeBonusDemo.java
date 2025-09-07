//14. Employee Bonus Calculation

abstract class Employee{
	private String name;
	private double salary;
	
	//Constructor 
	public Employee(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	
	//getter methods
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	//abstract class
	abstract public double calculateSalary();
	
	public void displaySalary(){
		System.out.println(getName()+" Total Salary = "+calculateSalary());
	}
}
class Manager extends Employee{
	
	//Constructor 
	public Manager(String name,double salary){
		super(name,salary);
	}
	
	@Override
	public double calculateSalary(){
		return (getSalary() + (0.20 * getSalary()));
	}
}
class Developer extends Employee{
	
	//Constructor 
	public Developer(String name,double salary){
		super(name,salary);
	}
	
	@Override
	public double calculateSalary(){
		return (getSalary() + (0.10 * getSalary()));
	}
}
public class EmployeeBonusDemo{
	public static void main(String[] args){
		Employee e1 = new Manager("Anita",50000);
		Employee e2 = new Developer("Rohit",40000);
		e1.displaySalary();
		e2.displaySalary();
		
		
	}
}

/*
D:\CDAC\OOPJ\Assignment 3>javac EmployeeBonusDemo.java
D:\CDAC\OOPJ\Assignment 3>java EmployeeBonusDemo
Anita Total Salary = 60000.0
Rohit Total Salary = 44000.0
*/