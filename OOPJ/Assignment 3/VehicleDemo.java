abstract class Vehicle{
	private String brand;
	private int speed;
	
	//constructor
	public Vehicle(String brand,int speed){
		this.brand = brand;
		this.speed = speed;
	}
	
	//getter function
	public String getBrand(){
		return brand;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public abstract void  displayDetails();
}
class Bike extends Vehicle{
	private String modelType;
	
	public Bike(String brand,String modelType,int speed){
		super(brand,speed);
		this.modelType = modelType;
	}
	@Override
	public void displayDetails(){
		System.out.println("Bike -> "+getBrand()+" "+modelType+", Speed = "+getSpeed());
	}
}
class Car extends Vehicle{
	private String modelType;
	
	public Car(String brand,String modelType,int speed){
		super(brand,speed);
		this.modelType = modelType;
	}
	@Override
	public void displayDetails(){
		System.out.println("Car -> "+getBrand()+" "+modelType+", Speed = "+getSpeed());
	}
}
class VehicleDemo{
	public static void main(String[] args){
		Vehicle v1 = new Car("Honda","Civic",180);
		Vehicle v2 = new Bike("Yamaha","R15",120);
		v1.displayDetails();
		v2.displayDetails();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac VehicleDemo.java
D:\CDAC\OOPJ\Assignment 3>java VehicleDemo

Car -> Honda Civic, Speed = 180
Bike -> Yamaha R15, Speed = 120
*/