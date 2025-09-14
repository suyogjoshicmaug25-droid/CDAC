// Problem 12: Attendance Tracking System
import java.util.*;
class AttendanceTrackingSystem{
	public static void main(String[] args){
		
		SortedMap<String,Integer> attendance = new TreeMap<>();
		
		attendance.put("Amit",85);
		attendance.put("Priya",92);
		attendance.put("Rohan",78);
		
		System.out.println("Attendance Report: ");
		for(Map.Entry<String,Integer> entry: attendance.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
} 
/*
D:\CDAC\OOPJ\Assignment 5>javac AttendanceTrackingSystem.java
D:\CDAC\OOPJ\Assignment 5>java AttendanceTrackingSystem

Attendance Report:
Amit : 85
Priya : 92
Rohan : 78
*/