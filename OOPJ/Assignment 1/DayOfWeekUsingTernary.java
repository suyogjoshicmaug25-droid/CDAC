/*18. Day of the Week
Scenario: Take day number (1–7) and print the day name.
Input:
Enter day number: 4
Output:
Day is Thursday
*/
import java.util.Scanner;
class DayOfWeekUsingTernary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		String result = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : 
		                (num == 3) ? "Wedenesday" : (num == 4) ? "Thursday" :  
						(num == 5) ? "Friday" : (num == 6) ? "Saturady" : 
						(num == 7) ? "Sunday" : "Invalid day number";
		System.out.println(result);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac DayOfWeekUsingTernary.java
D:\CDAC\OOPJ\Assignment 1>java DayOfWeekUsingTernary
Enter a number : 6
Saturady
*/