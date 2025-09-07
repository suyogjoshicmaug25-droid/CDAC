//20. College Staff Hierarchy

class Employee{
	private String name;
	private double salary;
	
	//Constructor
	public Employee(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	//getter functions 
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void displaySalary(){
		System.out.println("Employee name = "+name+" Salary= "+salary);
	}
}
class TeachingStaff extends Employee{
	private String subject;
	
	//Constructor
	public TeachingStaff(String name,double salary,String subject){
		super(name,salary);
		this.subject = subject;
	}
	//getter method
	public String getSubject(){
		return subject;
	}
	
	@Override
	public void displaySalary(){
		System.out.println("Employee name = "+getName()+" Salary= "+getSalary()+" Subject = "+subject);
	}
	
	
}
class Professor extends TeachingStaff{
	private String specialization;
	
	//Constructor
	public Professor(String name,double salary,String subject,String specialization){
		super(name,salary,subject);
		this.specialization = specialization;
	}
	@Override
	public void displaySalary(){
		System.out.println(getName()+" -> Subject="+getSubject()+", Specialization="+specialization+", Salary="+getSalary());
	}
}
class Lecturer extends TeachingStaff{
	private String department;
	
	//Constructor
	public Lecturer(String name,double salary,String subject,String department){
		super(name,salary,subject);
		this.department = department;
	}
	@Override
	public void displaySalary(){
		System.out.println(getName()+" -> Subject="+getSubject()+", Department="+department+", Salary="+getSalary());
	}
}
class EmployeeDemo1{
	public static void main(String[] args){
		Employee e1 = new Professor("Dr.Sharma",80000,"Math","Algebra");
		Employee e2 = new Lecturer("Ms.Mehta",50000,"Physics","Science");
		e1.displaySalary();
		e2.displaySalary();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac EmployeeDemo1.java
D:\CDAC\OOPJ\Assignment 3>java EmployeeDemo1
Dr.Sharma -> Subject=Math, Specialization=Algebra, Salary=80000.0
Ms.Mehta -> Subject=Physics, Department=Science, Salary=50000.0
*/