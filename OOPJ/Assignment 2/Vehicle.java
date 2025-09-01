/*Problem 18: Vehicle Registration – Static Counter
Scenario:
Create Vehicle class with regNo, ownerName, vehicleType.
● Static variable: vehicleCount
● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount
● Getter methods for all fields
● Create 2 vehicles, display registration details
*/
class Vehicle{
	private String regNo;
	private String ownerName;
	private String vehicleType;
	static private int vehicleCount;
	static{
		System.out.println("Welcome to CDAC Vehicle Registration Portal");
	}
	//Constructor
	Vehicle(String ownerName,String vehicleType){
		this.regNo = "MH-2025-"+vehicleCount;
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		vehicleCount++;
	}
	
	
	public String getRegNo(){
		return regNo;
	}
	
	public String ownerName(){
		return ownerName;
	}
	
	public String vehicleType(){
		return vehicleType;
	}
	public void showVehicleDetails(){
		System.out.println("Vehicle Reg. No. "+regNo+" Owner Name: "+ownerName+" Vehicle Type: "+vehicleType);
	}
	
	public static void main(String[] args){
		Vehicle v1 = new Vehicle("Mahesh","Bike");
		Vehicle v2 = new Vehicle("Suresh","Car");
		
		v1.showVehicleDetails();
		v2.showVehicleDetails();
		
		Vehicle v3 = new Vehicle("Rajesh","Scooter");
		Vehicle v4 = new Vehicle("Virat","Car");
		
	}
}
/*
D:\CDAC\OOPJ\Assignment 2>javac Vehicle.java
D:\CDAC\OOPJ\Assignment 2>java Vehicle

Vehicle Reg. No. MH-2025-0 Owner Name: Mahesh Vehicle Type: Bike
Vehicle Reg. No. MH-2025-1 Owner Name: Suresh Vehicle Type: Car
*/