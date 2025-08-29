/*
29. Day Type Selection
Scenario: Take user input for day type (1–Workday, 2–Weekend) and print working status.
Input:
Enter day type (1–Workday, 2–Weekend): 2
Output:
It’s weekend. No work today.

*/
import java.util.Scanner;
class DayTypeSelection{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day type (1-Workday, 2-Weekend): ");
		int num = sc.nextInt();
		switch(num){
			case 1:
					System.out.println("It's workday.");
					break;
			case 2:
					System.out.println("It’s weekend. No work today.");
					break;
			default:
					System.out.println("Invalid choice");
		}
		sc.close();
	}
	
}
/*
C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>java DayTypeSelection
Enter day type (1-Workday, 2-Weekend): 2
It?s weekend. No work today.
*/