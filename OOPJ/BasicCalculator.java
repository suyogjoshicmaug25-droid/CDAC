/*
20. Basic Calculator Using If-Else
Scenario: Create a calculator that takes two numbers and an operator (+, -, *, /) and prints result using
nested if-else.
*/
import java.util.Scanner;
class BasicCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the operator : ");
		char ch = sc.next().charAt(0);
		
		if(ch == '+'){
			System.out.println("Result = "+(num1+num2));
		}
		else if(ch == '-'){
			System.out.println("Result = "+(num1-num2));
		}
		else if(ch == '*'){
			System.out.println("Result = "+(num1*num2));
		}
		else if(ch == '/'){
			System.out.println("Result = "+(num1/num2));
		}
		else{
			System.out.println("Invalid operator");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac BasicCalculator.java
D:\CDAC\OOPJ\Assignment 1>java BasicCalculator
Enter the first number : 23
Enter the second number : 54
Enter the operator : +
Result = 77
*/