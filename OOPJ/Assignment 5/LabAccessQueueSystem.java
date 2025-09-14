// Problem 2 : Lab Access Queue System

import java.util.*;
class LabAccessQueueSystem{
	public static void main(String[] args){
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Amit");
		queue.add("Priya");
		queue.add("Rohan");
		
		System.out.println(queue);
		queue.poll();
		System.out.println("Queue = "+queue);
	}
}

/*
D:\CDAC\OOPJ\Assignment 5>javac LabAccessQueueSystem.java
D:\CDAC\OOPJ\Assignment 5>java LabAccessQueueSystem

[Amit, Priya, Rohan]
Queue = [Priya, Rohan]
*/