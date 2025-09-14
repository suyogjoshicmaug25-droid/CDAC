// Problem 9: Event Attendance Counter

import java.util.*;
class EventAttendanceCounter{
	public static void main(String[] args){
		
		HashSet<String> attendees = new HashSet<>();
		
		String[] names = {"Amit", "Rohan", "Amit", "Priya"};
		
		for(String s: names){
			attendees.add(s);
		}
		System.out.println("Total unique attendees: "+attendees.size());
	}
}