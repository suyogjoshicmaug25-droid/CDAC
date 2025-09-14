// Problem 19: Grade Report Generator

import java.util.*;
class GradeReportGenerator{
	public static void main(String[] args){
		
		Map<String,Integer> list = new HashMap<>();
		
		list.put("Amit",85);
		list.put("Priya",92);
		
		Iterator<Map.Entry<String,Integer>> itr = list.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String,Integer> entry = itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac GradeReportGenerator.java
D:\CDAC\OOPJ\Assignment 5>java GradeReportGenerator

Priya : 92
Amit : 85
*/