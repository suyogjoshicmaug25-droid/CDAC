/*
43. Sum of Digits of a Number
Scenario: Take a number as input and print the sum of its digits.
Input:
Enter number: 482
Output:
Sum of digits: 14
*/
import java.util.Scanner;
class SumOfDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int remainder,sum=0;
		while(num > 0){
			remainder = num % 10;
			sum += remainder;
			num /= 10;
		}
		System.out.println("Sum of digits: "+sum);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac SumOfDigits.java
D:\CDAC\OOPJ\Assignment 1>java SumOfDigits
Enter a number : 390
Sum of digits: 12
*/