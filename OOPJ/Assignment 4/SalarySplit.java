//Problem 1: Salary Split
import java.util.Scanner;
class SalarySplit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the bonous amount : ");
		int bonous = sc.nextInt();
		System.out.print("Enter the number of employees : ");
		int num = sc.nextInt();
		int share;
		try{
			share = bonous / num; // ArithmeticException
		}catch(ArithmeticException e){
			//e.printStackTrace();
			System.out.println("Error: Division by zero not allowed");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac SalarySplit.java
D:\CDAC\OOPJ\Assignment 4>java SalarySplit

Enter the bonous amount : 10000
Enter the number of employees : 0
Error: Division by zero not allowed
*/