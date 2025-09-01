/*
Problem 20: Ticket Booking System
Question:
Create a class Ticket with:
● passengerName (instance)
● ticketNo (instance, auto-generated using a static counter starting from 5001)
● Constructor to accept passengerName
● Method displayTicket() to show ticket details
Task:
Create 3 tickets and display their details.
Sample Input:
Passenger 1: Rahul
Passenger 2: Priya
Passenger 3: Amit
*/
class Ticket{
	private String passengerName;
	private int ticketNo=5001;
	
	//Constructor
	Ticket(String passengerName){
		this.passengerName = passengerName;
		this.ticketNo = ticketNo;
		ticketNo++;
	}
	
	public void displayTicket(){
		System.out.println("Ticket No.: "+ticketNo+" Passenger: "+passengerName);
	}
	
	public static void main(String[] args){
		Ticket t1 = new Ticket("Rahul");
		Ticket t2 = new Ticket("Priya");
		Ticket t3 = new Ticket("Amit");
		
		t1.displayTicket();
		t2.displayTicket();
		t3.displayTicket();
		
	}
}
/*
D:\CDAC\OOPJ\Assignment 2>javac Ticket.java
D:\CDAC\OOPJ\Assignment 2>java Ticket

Ticket No.: 5002 Passenger: Rahul
Ticket No.: 5002 Passenger: Priya
Ticket No.: 5002 Passenger: Amit
*/