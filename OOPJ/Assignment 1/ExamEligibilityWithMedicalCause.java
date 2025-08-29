/*
13. Exam Eligibility with Medical Cause
*/
import java.util.Scanner;
class ExamEligibilityWithMedicalCause{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Classes held : ");
		int total = sc.nextInt();
		System.out.print("Classes attended : ");
		int attended = sc.nextInt();
		System.out.print("Medical cause (Y/N) : ");
		char ch = sc.next().charAt(0);
		double percent;
		percent = ((double)attended/total)*100;
		if (percent <= 75){
			if (ch == 'Y'){
				System.out.println("Student is allowed to sit for the exam.");
			}
			else{
				System.out.println("Student is not allowed to sit for the exam.");
			}
		}
		else{
			System.out.println("Student allowed to sit for the exam.");
		}
		sc.close();
	}	
	
}
/*
D:\CDAC\OOPJ\Assignment 1>javac ExamEligibilityWithMedicalCause.java
D:\CDAC\OOPJ\Assignment 1>java ExamEligibilityWithMedicalCause
Classes held : 100
Classes attended : 60
Medical cause (Y/N) : Y
Student is allowed to sit for the exam.
*/
