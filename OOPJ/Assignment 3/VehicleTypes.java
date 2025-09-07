interface LandVehicle{
	public void driveOnLand();
}
interface WaterVehicle{
	public void driveOnWater();
}
class AmphibiousVehicle implements LandVehicle,WaterVehicle{
	private String name;
	
	//Constructor
	public AmphibiousVehicle(String name){
		this.name = name;
	}
	
	@Override
	public void driveOnLand(){
		System.out.println(name+" -> Driving on Land");
	}
	
	@Override
	public void driveOnWater(){
		System.out.println(name+" -> Driving on Water");
	}
}

public class VehicleTypes{
	public static void main(String[] args){
		AmphibiousVehicle l1 = new AmphibiousVehicle("Hydrocar");
		l1.driveOnLand();
		l1.driveOnWater();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac VehicleTypes.java
D:\CDAC\OOPJ\Assignment 3>java VehicleTypes

Hydrocar -> Driving on Land
Hydrocar -> Driving on Water
*/