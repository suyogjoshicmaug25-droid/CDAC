/*
21. Day of the Week (Ternary)
Scenario: Take an int (1–7) and print the corresponding day of the week using ternary operators.
Input:
Enter day number: 3
Output:
Day is Wednesday
*/
import java.util.Scanner;
class DayOfWeek{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		switch(num){
			case 1:
					System.out.println("Monday");
					break;
			case 2:
					System.out.println("Tuesday");
					break;
			case 3:
					System.out.println("Wednesday");
					break;
			case 4:
					System.out.println("Thursday");
					break;
			case 5:
					System.out.println("Friday");
					break;
			case 6:
					System.out.println("Saturady");
					break;
			case 7:
					System.out.println("Sunday");
					break;
			default:
					System.out.println("Invalid day number");
			
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac DayOfWeek.java
D:\CDAC\OOPJ\Assignment 1>java DayOfWeek
Enter a number : 5
Friday
*/