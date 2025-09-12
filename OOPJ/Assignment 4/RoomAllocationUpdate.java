// Problem 16: Room Allocation Update
import java.util.Scanner;
class RoomAllocationUpdate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Original Text: ");
		String original = sc.nextLine();
		
		StringBuffer sb = new StringBuffer();
		sb.append(original);
		
		System.out.print("Text to insert: ");
		String insert_string = sc.nextLine();
		System.out.print("Insert Index: ");
		int idx = sc.nextInt();
		sb.insert(idx,insert_string);
		System.out.println(sb);
		
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac RoomAllocationUpdate.java
D:\CDAC\OOPJ\Assignment 4>java RoomAllocationUpdate
Original Text:  101
Text to insert: New Building
Insert Index: 0
New Building 101
*/