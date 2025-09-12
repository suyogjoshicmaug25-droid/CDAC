//Problem 12: Remove Extra Text
import java.util.Scanner;
class RemoveExtraText{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.print("Original Text : ");
		String original = sc.nextLine();
		sb.append(original);
		System.out.println(sb);
		
		System.out.print("Exact substring to delete: ");
		String delete_string = sc.nextLine();
		int len = delete_string.length();
		int idx = sb.indexOf(delete_string);
		
		sb.delete(idx,(idx+len));
		System.out.println(sb);
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac RemoveExtraText.java
D:\CDAC\OOPJ\Assignment 4>java RemoveExtraText

Original Text : Please read - Do not disturb
Please read - Do not disturb
Exact substring to delete: - Do not disturb
Please read
*/