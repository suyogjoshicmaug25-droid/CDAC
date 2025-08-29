/*
3. Bank Transaction Check
Scenario: You check your bank account and see a transaction amount. Print whether the transaction is a
deposit (positive) or a withdrawal (negative).
Input:
Enter transaction amount: -2500
Output:
Withdrawal transaction
*/
import java.util.Scanner;
class BankTransactionCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter transaction amount : ");
		int amount = sc.nextInt();
		String result = (amount > 0) ? "Deposit transaction" : "Withdrawl transaction";
		System.out.println(result);
	}
	
}
/*
D:\CDAC\OOPJ\Assignment 1>javac BankTransactionCheck.java
D:\CDAC\OOPJ\Assignment 1>java BankTransactionCheck
Enter transaction amount : 70000
Deposit transaction
*/