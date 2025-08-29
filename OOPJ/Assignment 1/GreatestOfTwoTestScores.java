/*
1. Greatest of Two Test Scores
Scenario: Your friend took two mock tests. Write a program to take the two test scores as input and print
which test the friend scored higher in.
Input:
Enter score for Test 1: 78
Enter score for Test 2: 85
Output:
Test 2 has higher score
*/
import java.util.Scanner;
class  GreatestOfTwoTestScores{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the test1 score : ");
		int test1 = sc.nextInt();
		System.out.print("Enter the test2 score : ");
		int test2 = sc.nextInt();
		String result = (test1 > test2) ? "Test1 has higher score" : 
		(test1 < test2) ? "Test2 has higher score" : "Test1 and Test2  scores are equal" ;
		System.out.println(result);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac GreatestOfTwoTestScores.java
D:\CDAC\OOPJ\Assignment 1>java GreatestOfTwoTestScores
Enter the test1 score : 89
Enter the test2 score : 98
Test2 has higher score
*/