/*
40.Discount on Purchase (Ternary)
Scenario: A shop gives 10% discount if purchase amount > 1000. Take purchase amount and print total
cost using ternary.
*/
import java.util.Scanner;
class DiscountCalculationTernary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter purchase amount : ");
		int amount = sc.nextInt();
		int total_amount;
		total_amount = (amount > 1000) ? (amount-(amount/10)) : amount;
		System.out.println("Total cost after discount : "+total_amount);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac DiscountCalculationTernary.java
D:\CDAC\OOPJ\Assignment 1>java DiscountCalculationTernary
Enter purchase amount : 900
Total cost after discount : 900

D:\CDAC\OOPJ\Assignment 1>java DiscountCalculationTernary
Enter purchase amount : 1200
Total cost after discount : 1080
*/