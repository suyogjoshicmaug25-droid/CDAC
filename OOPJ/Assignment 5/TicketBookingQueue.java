// Problem 22: Ticket Booking Queue 

import java.util.*;
class TicketBookingQueue{
	public static void main(String[] args){
		
		LinkedList<String> myQueue = new LinkedList<>();

		myQueue.add("Amit");
		myQueue.add("Priya");
		myQueue.add("Rohan");
		
		System.out.println(myQueue);
		myQueue.poll();
		System.out.println("Serving: "+myQueue);
		
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac TicketBookingQueue.java
D:\CDAC\OOPJ\Assignment 5>java TicketBookingQueue

[Amit, Priya, Rohan]
Serving: [Priya, Rohan]

*/