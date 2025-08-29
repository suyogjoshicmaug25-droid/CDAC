/*
41. Check Armstrong Number (3-Digit)
Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits =
number).
Input:
Enter number: 153
Output:
153 is an Armstrong number
*/
import java.util.Scanner;
class ArmstrongNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int num1 = num;
		int remainder,armstrong=0;
		while(num > 0){
			remainder = num % 10;
			armstrong = armstrong + (remainder * remainder * remainder);
			num /= 10;
		}
		if(num1 == armstrong){
			System.out.println(num1+" is an armstrong number.");
		}
		else{
			System.out.println(num1+" is not an armstrong number.");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac ArmstrongNumber.java
D:\CDAC\OOPJ\Assignment 1>java ArmstrongNumber
Enter number : 153
153 is an armstrong number.
*/