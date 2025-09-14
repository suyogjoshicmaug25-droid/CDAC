// Problem 24: Print Job Queue Manager

import java.util.*;
class PrintJobQueueManager{
	public static void main(String[] args){
		Queue<String> list = new LinkedList<>();
		
		list.add("Doc 1");
		list.add("Doc 2");
		list.add("Doc 3");
		
		System.out.println(list);
		
		String currentJob = list.poll();
		if(currentJob != null)
			System.out.println("Printing "+currentJob);
		
		System.out.print("Queue : ");
		for(String job : list){
			System.out.print(job+" ");
		}
		
	}
} 
/*
D:\CDAC\OOPJ\Assignment 5>javac PrintJobQueueManager.java
D:\CDAC\OOPJ\Assignment 5>java PrintJobQueueManager

[Doc 1, Doc 2, Doc 3]
Printing Doc 1
Queue : Doc 2 Doc 3
*/