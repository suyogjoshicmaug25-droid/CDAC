// Problem 19: Message Update System
import java.util.Scanner;
class MessageUpdateSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Original text: ");
		String original = sc.nextLine();
		
		StringBuffer sb = new StringBuffer();
		sb.append(original);
		
		System.out.print("Text to find: ");
		String find = sc.nextLine();
		int idx = sb.indexOf(find);
		int len = find.length();
		
		sb.delete(idx,(idx+len));
		System.out.print("Replacement text: ");
		String replacement = sc.nextLine();
		int len1 = replacement.length();
		
		sb.insert(idx,replacement);
		System.out.println(sb);
		sc.close();
		
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac MessageUpdateSystem.java
D:\CDAC\OOPJ\Assignment 4>java MessageUpdateSystem

Original text: Old Notice
Text to find: Old
Replacement text: Updated
Updated Notice
*/