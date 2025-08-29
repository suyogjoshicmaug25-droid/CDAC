// Days in Month
import java.util.Scanner;
	/* 
	1-jan   2-feb  3-march 4-april 
	5-may   6-jun  7-july  8-aug 
	9-sep  10=oct 11-nov  12-dec 
	
	
	*/
class DayInMonth{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number : ");
		int num = sc.nextInt();
		if (num == 1 | num == 3 | 
			num == 5 | num == 7 |
			num == 8 | num == 10 |
			num == 12){
				System.out.println("31 days");
			}
		else if(num == 2){
			System.out.println("28 or 29 days");
		}
		else{
			System.out.println("30 days");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac DayInMonth.java
D:\CDAC\OOPJ\Assignment 1>java DayInMonth
Enter month number : 3
31 days
*/