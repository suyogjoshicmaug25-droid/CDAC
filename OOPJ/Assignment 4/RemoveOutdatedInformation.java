//Problem 17: Remove Outdated Information
import java.util.Scanner;
class RemoveOutdatedInformation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Original Text: ");
		String original = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(original);
		
		System.out.print("Exact substring to delete: ");
		String delete_string = sc.nextLine();
		int idx = sb.indexOf(delete_string);
		int len = delete_string.length();
		sb.delete(idx,(idx+len));
		
		System.out.println(sb);
		sc.close();
		
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac RemoveOutdatedInformation.java
D:\CDAC\OOPJ\Assignment 4>java RemoveOutdatedInformation
Original Text: CDAC Kharghar 2024
Exact substring to delete: 2024
CDAC Kharghar
*/