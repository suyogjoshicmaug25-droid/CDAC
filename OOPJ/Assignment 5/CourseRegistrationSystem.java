//  Problem 8 : Course Registration System

import java.util.*;
class CourseRegistrationSystem{
	public static void main(String[] args){
		
		HashSet<String> courses = new HashSet<>();
		
		String []list ={"CS101","MA101","CS101"};
		
		for(String s: list){
			courses.add(s);
		}
		
		System.out.println("Registered Courses: "+courses);
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac CourseRegistrationSystem.java

D:\CDAC\OOPJ\Assignment 5>java CourseRegistrationSystem
Registered Courses: [CS101, MA101]
*/