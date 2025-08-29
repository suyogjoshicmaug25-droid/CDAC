/*
10. Exam Attendance Eligibility
Scenario: A student can sit in exams only if attendance >=75%. Take total classes held and attended as
input, print allowance
*/
import java.util.Scanner;
class ExamAttendanceEligibility{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  total classes held : ");
		int total = sc.nextInt();
		System.out.print("Enter classes attended : ");
		int attended = sc.nextInt();
		double percentage;
		percentage = ((double)attended/total)*100;
		String result = (percentage >= 75) ? "allowed" : "not allowed";
		System.out.println("Student is "+result+" to sit for the exam.");
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac ExamAttendanceEligibility.java
D:\CDAC\OOPJ\Assignment 1>java ExamAttendanceEligibility
Enter  total classes held : 100
Enter classes attended : 89
Student is allowed to sit for the exam.
*/