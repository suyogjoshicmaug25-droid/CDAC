/*
14. Reverse a 4-Digit Number
Scenario: Take a 4-digit number and print its reverse.
*/
import java.util.Scanner;
class ReverseNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4 digit number : ");
		int num = sc.nextInt();
		int remainder,reverse=0;
		while( num > 0 ){
			remainder = num % 10;
			reverse = reverse*10 + remainder;
			num /= 10;
		}
		System.out.println("Reverse number : "+reverse);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac ReverseNumber.java
D:\CDAC\OOPJ\Assignment 1>java ReverseNumber
Enter 4 digit number : 1234
Reverse number : 4321
*/