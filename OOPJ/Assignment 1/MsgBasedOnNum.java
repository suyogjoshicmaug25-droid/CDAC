/* 25. Message Based on Number (1–5)
Scenario: Take a number (1–5) and print a message according to the case. Useful for simple menu
selection.
Input:
Enter a number: 3
Output:
You selected option 3.
*/
import java.util.Scanner;
class MsgBasedOnNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("You selected option "+num+".");
		sc.close();
	}
}
/*
C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>java MsgBasedOnNum
Enter a number : 2
You selected option 2.
*/