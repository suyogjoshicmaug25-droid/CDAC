//Problem 1: Student Names Management System

import java.util.*;
class StudentNamesManagementSystem{
	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Amit");
		list.add("Priya");
		list.add("Rohan");
		
		//System.out.println(list);
		list.remove("Priya");
		
		System.out.println("Students : "+list);
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac StudentNamesManagementSystem.java
D:\CDAC\OOPJ\Assignment 5>java StudentNamesManagementSystem

[Amit, Priya, Rohan]
Students : [Amit, Rohan]
*/