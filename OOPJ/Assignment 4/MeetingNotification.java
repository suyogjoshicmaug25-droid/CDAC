// Problem 15: Meeting Notification
import java.util.Scanner;
class MeetingNotification{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Base Text: ");
		String base = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(50);
		sb.append(base);
		
		System.out.print("Text to append: ");
		String append_text = sc.nextLine();
		sb.append(append_text);
		
		System.out.println(sb);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac MeetingNotification.java
D:\CDAC\OOPJ\Assignment 4>java MeetingNotification

Base Text: Meeting:
Text to append: Friday at 5 PM
Meeting: Friday at 5 PM
*/