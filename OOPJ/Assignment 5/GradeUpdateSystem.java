// Problem 14: Grade Update System

import java.util.*;
class GradeUpdateSystem{
	public static void main(String[] args){
		
		LinkedHashMap<String,Integer> grades = new LinkedHashMap<>();
		
		grades.put("Rohan",78);
		grades.put("Sumit",70);
		
		System.out.println(grades);
		grades.put("Rohan",88);
		System.out.println(grades);
		
	}
}