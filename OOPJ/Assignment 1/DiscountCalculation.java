/*
8. Shop Discount Calculation
Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount
as input and calculate final cost.
Input:
Enter total purchase amount: 1200
Output:
Final cost after discount: 1080
*/
import java.util.Scanner;
class DiscountCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total purchase amount : ");
		int amount = sc.nextInt();
		int discount;
		if (amount > 1000) {
			discount = amount/10;
			amount = amount - discount;
			System.out.println("Final cost after discount : "+amount);
		}
		else{
			System.out.println("Final cost after discount : "+amount);
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac DiscountCalculation.java
D:\CDAC\OOPJ\Assignment 1>java DiscountCalculation
Enter total purchase amount : 1300
Final cost after discount : 1170
*/