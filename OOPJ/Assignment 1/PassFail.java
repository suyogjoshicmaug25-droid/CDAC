/*
7. Exam Pass or fail:
pass : 35 and more
*/
import java.util.Scanner;
class PassFail{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks (1-100) : ");
		int marks = sc.nextInt();
		String result = (marks >= 35) ? "Student is passed" : "Student is failed";
		System.out.println(result);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac PassFail.java
D:\CDAC\OOPJ\Assignment 1>java PassFail
Enter marks (1-100) : 67
Student is passed
*/