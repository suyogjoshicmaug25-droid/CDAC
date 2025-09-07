//7. Employee Hierarchy
abstract class Employee{
	private String name;
	private double basicSalary;
	
	//constructor
	public Employee(String name,double basicSalary){
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	//getter method
	public String getName(){
		return name;
	}
	
	public double getBasicSalary(){
		return basicSalary;
	}
	
	//abstract method calculateNetSalary
	public abstract double calculateNetSalary();
	
}
class RegularEmployee extends Employee{
	public RegularEmployee(String name,double basicSalary){
		super(name,basicSalary);
	}
	@Override
	public double calculateNetSalary(){
		return getBasicSalary() + (0.10 * getBasicSalary());
	}
}
class ContractEmployee extends Employee{
	public ContractEmployee(String name,double basicSalary){
		super(name,basicSalary);
	}
	@Override
	public double calculateNetSalary(){
		return getBasicSalary() + (0.05 * getBasicSalary());
	}
}

public class EmployeeDemo{
	public static void main(String[] args){
		Employee e1 = new RegularEmployee("Rahul",20000);
		Employee e2 = new ContractEmployee("Riya",15000);
		
		System.out.printf("%s Net Salary = %.2f%n",e1.getName(),e1.calculateNetSalary());
		System.out.printf("%s Net Salary = %.2f%n",e2.getName(),e2.calculateNetSalary());
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac EmployeeDemo.java
D:\CDAC\OOPJ\Assignment 3>java EmployeeDemo

Rahul Net Salary = 22000.00
Riya Net Salary = 15750.00
*/