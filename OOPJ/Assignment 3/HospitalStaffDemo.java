//21. Hospital Staff
class Staff{
	private String name;
	private int staffId;
	
	//Constructor
	public Staff(String name,int staffId){
		this.name = name;
		this.staffId = staffId;
	}
	
	//getter method
	public String getName(){
		return name;
	}
	
	public int getStaffId(){
		return staffId;
	}
	
	//Display Details
	public void displayDetails(){
		System.out.println(name+" -> Staff ID="+staffId);
	}
}
class Doctor extends Staff{
	private String specialization;
	
	//Constructor
	public Doctor(String name,int staffId,String specialization){
		super(name,staffId);
		this.specialization = specialization;
	}
	
	@Override
	public void displayDetails(){
		System.out.println(getName()+" -> Staff ID="+getStaffId()+", Specialization="+specialization);
	}
}
class Nurse extends Staff{
	private String shift;
	
	//Constructor
	public Nurse(String name,int staffId,String shift){
		super(name,staffId);
		this.shift = shift;
	}
	
	@Override
	public void displayDetails(){
		System.out.println(getName()+" -> Staff ID="+getStaffId()+", Shift="+shift);
	}
}
public class HospitalStaffDemo{
	public static void main(String[] args){
		Staff s1 = new Doctor("Dr.Reddy",101,"Cardiology");
		Staff s2 = new Nurse("Nisha",102,"Night");
		
		s1.displayDetails();
		s2.displayDetails();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac HospitalStaffDemo.java
D:\CDAC\OOPJ\Assignment 3>java HospitalStaffDemo

Dr.Reddy -> Staff ID=101, Specialization=Cardiology
Nisha -> Staff ID=102, Shift=Night
*/