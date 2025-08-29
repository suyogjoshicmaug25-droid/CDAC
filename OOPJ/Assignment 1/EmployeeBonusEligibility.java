/*
9. Employee Bonus Eligibility
Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and
years of service as input and print bonus amount.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus amount: 2500
*/
import java.util.Scanner;
class EmployeeBonusEligibility{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your salary : ");
		int sal = sc.nextInt();
		System.out.print("Enter years of experience : ");
		int years = sc.nextInt();
		int bonous;
		if(years > 5){
			bonous = sal/20;
			System.out.println("Bonous amount : "+bonous);
		}
		else{
			System.out.println("Bonous amount : NA ");
		}
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac EmployeeBonusEligibility.java
D:\CDAC\OOPJ\Assignment 1>java EmployeeBonusEligibility
Enter your salary : 100000
Enter years of experience : 8
Bonous amount : 5000
*/