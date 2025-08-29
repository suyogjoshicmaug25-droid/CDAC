/*
6. Leap Year Check for a Birthday
Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input
and check if it’s a leap year.
*/
import java.util.Scanner;
class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = sc.nextInt();
		if ((year % 400 == 0) | (year % 100 != 0  && year % 4 == 0)) {
			System.out.println(year+" is a leap year.");
		}
		else{
			System.out.println(year+" is not a leap year.");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac LeapYear.java
D:\CDAC\OOPJ\Assignment 1>java LeapYear
Enter a year : 2020
2020 is a leap year.
*/