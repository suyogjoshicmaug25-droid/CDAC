/*
30. Menu-Based Simple Arithmetic Operations
Scenario: Implement a menu-based program that asks user to select operation (Addition, Subtraction,
Multiplication, Division) and prints result.
Input:
Select operation (1-Addition, 2-Subtraction): 1
Enter first number: 20
Enter second number: 30
Output:
Result: 50
*/
import java.util.Scanner;
class MenuBasedArithmetic{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Select operation (1-Addition, 2-Subtraction 3-Multiplication 4-Division) : ");
		int num = sc.nextInt();
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		switch(num){
			case 1:
					System.out.println("Result : "+(num1+num2));
					break;
			case 2:
					System.out.println("Result : "+(num1 - num2));
					break;
			case 3:
					System.out.println("Result : "+(num1*num2));
					break;
			case 4:
					System.out.println("Result : "+(num1/num2));
					break;
			default:
					System.out.println("Invalid opration number");
		}
		sc.close();
	}
}
/*
C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>java MenuBasedArithmetic
Select operation (1-Addition, 2-Subtraction 3-Multiplication 4-Division) : 3
Enter first number : 23
Enter second number : 76
Result : 1748
*/