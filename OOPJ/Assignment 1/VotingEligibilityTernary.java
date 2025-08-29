/*
34. Voting Eligibility (Ternary)
Scenario: Ask user age and print “Eligible” or “Not Eligible” to vote using ternary operator.
Input:
Enter age: 20
Output:
Eligible to vote
*/
import java.util.Scanner;
class VotingEligibilityTernary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		String result = (age >= 18) ? "Eligible" : "Not Eligible";
		System.out.println(result+" to vote");
		sc.close();
	}
}
/*
C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>javac VotingEligibilityTernary.java

C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>java VotingEligibilityTernary
Enter age : 16
Not Eligible to vote
*/