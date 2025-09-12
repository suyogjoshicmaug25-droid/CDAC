// Problem 14: Report Title
import java.util.Scanner;
class ReportTitle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.print("Original Title: ");
		String original = sc.nextLine();
		sb.append(original);
		
		System.out.print("Department Name : ");
		String dept = sc.nextLine();
		int idx = sb.indexOf("Report");
		//System.out.println(idx);
		sb.insert(idx,dept);
		System.out.println(sb);
		sc.close();
		
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac ReportTitle.java

D:\CDAC\OOPJ\Assignment 4>java ReportTitle
Original Title: Annual Report
Department Name : CDAC
7
Annual CDAC Report
*/