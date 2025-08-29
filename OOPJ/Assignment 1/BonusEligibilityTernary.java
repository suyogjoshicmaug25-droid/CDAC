/*
39. Bonus Eligibility (Ternary)
Scenario: A company gives 5% bonus if years of service > 5. Take salary and years of service, print
bonus eligibility using ternary.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus: 2500
*/
import java.util.Scanner;
class BonusEligibilityTernary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary : ");
		int salary = sc.nextInt();
		System.out.print("Enter years of services : ");
		int years = sc.nextInt();
		int bonous = (years > 5) ? (salary/20) : 0;
		System.out.println("Bonous : "+bonous);
		sc.close();
	}
}
/*

D:\CDAC\OOPJ\Assignment 1>javac BonusEligibilityTernary.java
D:\CDAC\OOPJ\Assignment 1>java BonusEligibilityTernary
Enter salary : 25000
Enter years of services : 6
Bonous : 1250
*/