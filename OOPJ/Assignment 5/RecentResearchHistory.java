// Problem 5: Recent Research History

import java.util.*;
class RecentResearchHistory{
	public static void main(String[] args){
		
		LinkedList<String> list = new LinkedList<>();
				
		String []searches = {"Java","Python","C++","DSA","OOP","Spring"};
		
		for(String s: searches){
			list.add(s);
			if(list.size() > 5){
				list.poll(); //remove oldest
			}
		}
		
		System.out.println("Recent searches : "+list);
		
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac RecentResearchHistory.java

D:\CDAC\OOPJ\Assignment 5>java RecentResearchHistory
Recent searches : [Python, C++, DSA, OOP, Spring]
*/