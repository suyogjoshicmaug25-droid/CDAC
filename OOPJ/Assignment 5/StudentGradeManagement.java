// Problem 11 : Student Grade Management

import java.util.*;
class StudentGradeManagement{
	public static void main(String[] args){
		
		HashMap<String,Integer> list = new HashMap<>();
		
		
		list.put("Amit",85);
		list.put("Priya",92);
		list.put("Rohan",78);
		
		System.out.print("Grade Report: ");
		
		for(Map.Entry<String,Integer> entry : list.entrySet()){
			System.out.print(entry.getKey()+" : "+entry.getValue()+"  ");
		}

	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac StudentGradeManagement.java

D:\CDAC\OOPJ\Assignment 5>java StudentGradeManagement
Grade Report: Priya : 92  Amit : 85  Rohan : 78
*/