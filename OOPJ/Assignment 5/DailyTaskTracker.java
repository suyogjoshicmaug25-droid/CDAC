// Problem 3: Daily Task Tracker
import java.util.*;
class DailyTaskTracker{
	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Study Java");
		list.add("complete Assignment");
		list.add("Exercise");
		
		System.out.println("All tasks : "+list);
		
		System.out.print("Completed task name: ");
		Scanner sc = new Scanner(System.in);
		String complete = sc.nextLine();
		
		if(list.remove(complete)){
			System.out.println("Task "+complete+" marked as completed");
		}else{
			System.out.println("Task "+complete+" can not found in the list");
		}
		
		System.out.println("Remaining Tasks: "+list);
		
	}
}

/*
D:\CDAC\OOPJ\Assignment 5>javac DailyTaskTracker.java
D:\CDAC\OOPJ\Assignment 5>java DailyTaskTracker

All tasks : [Study Java, complete Assignment, Exercise]
Completed task name: Exercise
Task Exercise marked as completed
Remaining Tasks: [Study Java, complete Assignment]
*/