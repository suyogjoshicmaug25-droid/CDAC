//17. Vehicle Speed Display

class Vehicle{
	public void displaySpeed(){
		System.out.println("Vehicles speed unknown");
	}
}
class Car extends Vehicle{
	@Override
	public void displaySpeed(){
		System.out.println("Car spped 120km/h");
	}
}
class Bike extends Vehicle{
	@Override
	public void displaySpeed(){
		System.out.println("Bike spped 80km/h");
	}
}
class VehicleSpeedDemo{
	public static void main(String[] args){
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		v1.displaySpeed();
		v2.displaySpeed();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac VehicleSpeedDemo.java
D:\CDAC\OOPJ\Assignment 3>java VehicleSpeedDemo

Car spped 120km/h
Bike spped 80km/h
*/