// Problem 13: Student Registration Order Tracker

import java.util.*;
class StudentRegistrationOrderTracker{
	public static void main(String[] args){
		LinkedHashMap<String,Integer> register = new LinkedHashMap<>();
		
		register.put("Amit",101);
		register.put("Rohan",102);
		register.put("Priya",103);
		
		//System.out.println(register);
		
		System.out.println("Registration Order:");
		for(Map.Entry<String,Integer> entry : register.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac StudentRegistrationOrderTracker.java

D:\CDAC\OOPJ\Assignment 5>java StudentRegistrationOrderTracker
Registration Order:
Amit : 101
Rohan : 102
Priya : 103
*/
