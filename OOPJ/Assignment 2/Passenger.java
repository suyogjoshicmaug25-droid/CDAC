class Passenger{
	private String name;
	private int age;
	private String seatType="General";
	private static int totalPassengersBooked;
	
	// constructors
	public Passenger(String name,int age){
		this.name = name;
		this.age = age;
		totalPassengersBooked++;
	}
	
	public Passenger(String name,int age,String seatType){
		this.name = name;
		this.age = age;
		this.seatType = seatType;
		totalPassengersBooked++;
	}
	
	public static void showtotalPassengersBooked(){
		System.out.println("Total Passenger Booked : "+totalPassengersBooked);
	}
	
	public static void main(String[] args){
		/*
		Passenger1: "Ravi", 25
		Passenger2: "Anita", 30, "AC Sleeper"
		Passenger3: "Suresh", 40
		*/
		Passenger p1 = new Passenger("Ravi",25);
		Passenger p2 = new Passenger("Anita",30,"AC Sleeper");
		Passenger p3 = new Passenger("Suresh",40);
		System.out.println("Passenger1: "+p1.name+", "+p1.age+", "+p1.seatType);
		System.out.println("Passenger2: "+p2.name+", "+p2.age+", "+p2.seatType);
		System.out.println("Passenger3: "+p3.name+", "+p1.age+", "+p3.seatType);
		
		Passenger.showtotalPassengersBooked();
		
	}
	
}