//29.Employee Management System
interface BonusEligible{
	public double calculateBonus();
}
abstract class Employee{
	private String name;
	private int id;
	
	//Constructor
	Employee(String name,int id){
		this.name = name;
		this.id = id;
	}
	//getter methods
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
	
	abstract public double calculateSalary();
}
class PermanentEmployee extends Employee implements BonusEligible{
	
	private double basicSalary;
	private double hra;
	//Constructor 
	PermanentEmployee(String name,int id,double basicSalary,double hra){
		super(name,id);
		this.basicSalary = basicSalary;
		this.hra = hra;
	}
	@Override
	public double calculateSalary(){
		return basicSalary + hra;
	}
	
	@Override
	public double calculateBonus(){
		return 0.10 * calculateSalary();
	}
}
class ContractEmployee extends Employee{
	private double hourlyRate;
	private double hourlyWorked;
	
	//Constructor
	ContractEmployee(String name,int id,double hourlyRate,double hourlyWorked){
		super(name,id);
		this.hourlyRate = hourlyRate;
		this.hourlyWorked = hourlyWorked;
	}
	
	@Override
	public double calculateSalary(){
		return hourlyRate * hourlyWorked;
	}
}
public class EmployeeDemo2{
	public static void main(String[] args){
		// Creating 2 Permanent Employees
        PermanentEmployee p1 = new PermanentEmployee("Amit", 101, 50000, 5000);
        PermanentEmployee p2 = new PermanentEmployee("Riya", 102, 40000, 4000);

        // Creating 2 Contract Employees
        ContractEmployee c1 = new ContractEmployee("Neha", 201, 300, 100);
        ContractEmployee c2 = new ContractEmployee("Raj", 202, 250, 120);

        // Display details
        System.out.println(p1.getName() + " Salary = " + p1.calculateSalary() + ", Bonus = " + p1.calculateBonus());
        System.out.println(p2.getName() + " Salary = " + p2.calculateSalary() + ", Bonus = " + p2.calculateBonus());
        System.out.println(c1.getName() + " Salary = " + c1.calculateSalary());
        System.out.println(c2.getName() + " Salary = " + c2.calculateSalary());
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac EmployeeDemo2.java
D:\CDAC\OOPJ\Assignment 3>java EmployeeDemo2

Amit Salary = 55000.0, Bonus = 5500.0
Riya Salary = 44000.0, Bonus = 4400.0
Neha Salary = 30000.0
Raj Salary = 30000.0
*/