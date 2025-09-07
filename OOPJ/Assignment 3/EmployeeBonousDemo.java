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
	abstract public double displaySalary();
}
class Manager extends Employee{
	
	//Constructor 
	public Manager(String name,double salary){
		super(name,salary);
	}
	
	@Override
	public double displaySalary(){
		return (getSalary() + (0.20 * getSalary()));
	}
}
class Developer extends Employee{
	
	//Constructor 
	public Developer(String name,double salary){
		super(name,salary);
	}
	
	@Override
	public double displaySalary(){
		return (getSalary() + (0.10 * getSalary()));
	}
}
public class EmployeeBonousDemo{
	public static void main(String[] args){
		Employee e1 = new Manager("Anita",50000);
		Employee e2 = new Developer("Rohit",40000);
		
		System.out.println(e1.getName()+" Total Salary = "+e1.displaySalary());
		System.out.println(e2.getName()+" Total Salary = "+e2.displaySalary());
		
	}
}