/*
5. Square or Rectangle Garden
Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a
square garden or rectangular.
Input:
Enter length: 12
Enter breadth: 12
Output:
Square garden
*/
import java.util.Scanner;
class SOrRGarden{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the garden : ");
		int length = sc.nextInt();
		System.out.print("Enter the breadth of the garden : ");
		int breadth = sc.nextInt();
		String result = (length == breadth) ? "Square garden"  : "Rectangle garden";
		System.out.println(result);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac SOrRGarden.java
D:\CDAC\OOPJ\Assignment 1>java SOrRGarden
Enter the length of the garden : 5
Enter the breadth of the garden : 6
Rectangle garden
*/