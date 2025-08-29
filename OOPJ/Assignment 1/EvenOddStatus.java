/*47. Even/Odd Status of Two Numbers
Scenario: Take two numbers and print if both are even, both odd, or mixed.
Input:
Enter first number: 12
Enter second number: 17
Output:
Numbers are mixed (one even, one odd)
*/
import java.util.Scanner;
class EvenOddStatus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		String result = (num1%2 == 0 && num2%2==0) ? "both even" : ((num1%2 !=0 && num2%2 == 0) || (num1%2 ==0 && num2%2 != 0)) ? "(one even,one odd)" : "Both odd";
		System.out.println(result);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac EvenOddStatus.java
D:\CDAC\OOPJ\Assignment 1>java EvenOddStatus
Enter first number : 6
Enter second number : 7
(one even,one odd)
*/