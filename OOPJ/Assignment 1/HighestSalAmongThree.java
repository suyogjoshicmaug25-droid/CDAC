/*
2. Highest Salary Among Three Offers
Scenario: You have three job offers. Take the offered salaries as input and print which company is
offering the highest salary.
*/
import java.util.Scanner;
class HighestSalAmongThree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary for company 1 : ");
		int sal1 = sc.nextInt();
		System.out.print("Enter salary for company 2 : ");
		int sal2 = sc.nextInt();
		System.out.print("Enter salary for company 3 : ");
		int sal3 = sc.nextInt();
		
		int result = (sal1>sal2 && sal1 > sal3) ? 1 : (sal2 > sal1 && sal2 > sal3)? 2 : 3;
		System.out.println("Company "+result+" offers the highest salary.");
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac HighestSalAmongThree.java
D:\CDAC\OOPJ\Assignment 1>java HighestSalAmongThree
Enter salary for company 1 : 12000
Enter salary for company 2 : 14000
Enter salary for company 3 : 13000
Company 2 offers the highest salary.
*/