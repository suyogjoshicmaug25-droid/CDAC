//10. Academic Staff
class Staff{
	private String name;
	private double salary;
	
	//constructor
	public Staff(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void displayStaffInfo(){
		System.out.println("Display Staff Info...");
	}
}
class TeachingStaff extends Staff{
	private String subject;
	
	//constructor
	public TeachingStaff(String name,double salary,String subject){
		super(name,salary);
		this.subject = subject;
	}
	@Override
	public void displayStaffInfo(){
		System.out.println(getName()+" -> "+subject+", "+getSalary());
	}
}
class NonTeachingStaff extends Staff{
	private String dept;
	//constructor
	public NonTeachingStaff(String name,double salary,String dept){
		super(name,salary);
		this.dept = dept;
	}
	@Override
	public void displayStaffInfo(){
		System.out.println(getName()+" -> "+dept+", "+getSalary());
	}
}
public class StaffDemo{
	public static void main(String[] args){
		Staff s1 = new TeachingStaff("Anita",50000,"Math");
		Staff s2 = new NonTeachingStaff("Ramesh",40000,"Admin");
		s1.displayStaffInfo();
		s2.displayStaffInfo();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac StaffDemo.java

D:\CDAC\OOPJ\Assignment 3>java StaffDemo
Anita -> Math, 50000.0
Ramesh -> Admin, 40000.0
*/