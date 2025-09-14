// Problem 25: Command History Tracker

import java.util.*;
class CommandHistoryTracker{
	public static void main(String[] args){
		
		LinkedList<String> list = new LinkedList<>();
		
		String[] commands = { "ls", "pwd", "cd ..", "mkdir"};
		
		for(String c : commands){
			list.add(c);
			if(list.size() > 3)
				list.remove();
		}
		System.out.println("Recent Commands : "+list);
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac CommandHistoryTracker.java
D:\CDAC\OOPJ\Assignment 5>java CommandHistoryTracker

Recent Commands : [pwd, cd .., mkdir]
*/