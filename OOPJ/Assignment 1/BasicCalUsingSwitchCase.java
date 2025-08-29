/*
Basic Calculator Using Switch-Case
*/
import java.util.Scanner;
class BasicCalUsingSwitchCase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter operator : ");
		char op = sc.next().charAt(0);
		
		switch(op){
			case '+':
					System.out.println("Result = "+(num1+num2));
					break;
			case '-':
					System.out.println("Result = "+(num1-num2));
					break;
			case '*':
					System.out.println("Result = "+(num1*num2));
					break;
			case '/':
					System.out.println("Result = "+(num1/num2));
					break;
			default:
					System.out.println("Invalid operation");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac BasicCalUsingSwitchCase.java
D:\CDAC\OOPJ\Assignment 1>java BasicCalUsingSwitchCase
Enter first number : 90
Enter second number : 34
Enter operator : -
Result = 56
*/