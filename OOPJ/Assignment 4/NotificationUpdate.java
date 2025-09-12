// Problem 11: Notification Update
import java.util.Scanner;
class NotificationUpdate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(50);
		System.out.print("Original Text: ");
		String str = sc.nextLine();
		sb.append(str);
		
		System.out.print("Text to find: ");
		String find = sc.nextLine();
		int idx = sb.indexOf(find);
		
		System.out.print("replacement text: ");
		String replacement = sc.nextLine();
		int len = replacement.length();
		sb.replace(idx,(idx+len),replacement);
		System.out.println(sb);
		
	}
}

/*
D:\CDAC\OOPJ\Assignment 4>javac NotificationUpdate.java
D:\CDAC\OOPJ\Assignment 4>java NotificationUpdate

Original Text: Exam postponed
Text to find: postponed
replacement text: rescheduled
Exam rescheduled
*/