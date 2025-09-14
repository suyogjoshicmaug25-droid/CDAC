// Unique Roll Number Validator

import java.util.*;
class UniqueRollNumberValidator{
	public static void main(String[] args){
		HashSet<Integer> list = new HashSet<>();
		
		int[] arr = {101,102,101,103};
		
		for(int roll: arr){
			list.add(roll);
		}
		
		System.out.println("Unique Roll Numbers : "+list);
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac UniqueRollNumberValidator.java

D:\CDAC\OOPJ\Assignment 5>java UniqueRollNumberValidator
Unique Roll Numbers : [101, 102, 103]
*/