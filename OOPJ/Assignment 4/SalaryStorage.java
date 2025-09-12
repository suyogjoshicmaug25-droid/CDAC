// Problem 26: Salary Storage
import java.util.Scanner;
class SalaryStorage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		Double d1 = Double.valueOf(salary);
		System.out.println("Double Object: "+salary);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac SalaryStorage.java
D:\CDAC\OOPJ\Assignment 4>java SalaryStorage

Enter salary: 45000.5
Double Object: 45000.5
*/