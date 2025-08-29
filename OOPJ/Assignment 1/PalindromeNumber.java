/*
44. Reverse 4-Digit Number and Palindrome Check
Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome.
Input:
Enter 4-digit number: 1221
Output:
Reversed number: 1221
Palindrome: Yes
*/
import java.util.Scanner;
class PalindromeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4-digit number : ");
		int num = sc.nextInt();
		int remainder,reverse=0,num1;
		num1 = num;
		while(num > 0){
			remainder = num % 10;
			reverse = (reverse*10) + remainder;
			num /= 10;
		}
		System.out.println("Reversed number : "+reverse);
		if(reverse == num1){
			System.out.println("Palindrome : Yes");
		}
		else{
			System.out.println("Palindrome : No");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac PalindromeNumber.java
D:\CDAC\OOPJ\Assignment 1>java PalindromeNumber
Enter 4-digit number : 1221
Reversed number : 1221
Palindrome : Yes

D:\CDAC\OOPJ\Assignment 1>java PalindromeNumber
Enter 4-digit number : 1234
Reversed number : 4321
Palindrome : No
*/