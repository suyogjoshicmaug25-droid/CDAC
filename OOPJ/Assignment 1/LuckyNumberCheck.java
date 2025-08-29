/*
15. Lucky Number Check
Scenario: A 4-digit number ABCD is lucky if A+B = C+D. Check if a number is lucky.
Input:
Enter 4-digit number: 3521
Output:
Not a lucky number
*/
import java.util.Scanner;
import java.util.Arrays;
class LuckyNumberCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any 4 digit number : ");
		int num = sc.nextInt();
		int[] intArr = new int[4];
		int remainder, reverse=0,i=0;
		while(num > 0){
			remainder = num % 10;
			intArr[i++]= remainder;
			reverse = (reverse*10) + remainder;
			num /= 10;
		}
		int sum1 = intArr[0] + intArr[1];
		int sum2 = intArr[2] + intArr[3];
		if (sum1 == sum2){
			System.out.println("It is a lucky number");
		}
		else{
			System.out.println("It is not a lucky number");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac LuckyNumberCheck.java

D:\CDAC\OOPJ\Assignment 1>java LuckyNumberCheck
Enter any 4 digit number : 1331
It is a lucky number
*/