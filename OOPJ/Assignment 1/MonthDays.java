/*
49. Days in Month Considering Leap Year
Scenario: Take a year and month number, print days in that month considering leap years.
Input:
Enter year: 2024
Enter month number: 2
Output:
29 days
*/
import java.util.Scanner;
class MonthDays{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		System.out.print("Enter month number : ");
		int num = sc.nextInt();
		if(num == 2){
			if((year%400 == 0) ||(year % 100 != 0 && year % 4 == 0)){
				System.out.println("29 days");
			}
			else{
				System.out.println("28 days");
			}
		}
		else if (num==4 || num==6 || num==9 || num==11){
			System.out.println("30 days");
		}
		else{
			System.out.println("31 days");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac MonthDays.java
D:\CDAC\OOPJ\Assignment 1>java MonthDays
Enter year : 1900
Enter month number : 2
28 days

D:\CDAC\OOPJ\Assignment 1>java MonthDays
Enter year : 2000
Enter month number : 2
29 days
*/

