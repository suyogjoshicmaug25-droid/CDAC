//11. Bank Account Types
class Account{
	private int accountNo;
	private int balance;
	
	//constructor
	public Account(int accountNo,int balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	//getter method
	public int getAccountNo(){
		return accountNo;
	}
	
	public int getBalance(){
		return balance;
	}
	public void displayDetails(){
		System.out.println("Displaying Account Details...");
	}
}
class SavingAccount extends Account{
	private int interestRate;
	
	//constructor
	public SavingAccount(int accountNo,int balance,int interestRate){
		super(accountNo,balance);
		this.interestRate = interestRate;
	}
	
	//display method for Saving Account
	@Override
	public void displayDetails(){
		System.out.println("Saving -> "+getAccountNo()+", Balance= "+getBalance()+", Interest= "+interestRate+"%");
	}
}
class CurrentAccount extends Account{
	private int overdraftLimit;
	
	//constructor
	public CurrentAccount(int accountNo,int balance,int overdraftLimit){
		super(accountNo,balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	//display method for Saving Account
	@Override
	public void displayDetails(){
		System.out.println("Current -> "+getAccountNo()+", Balance= "+getBalance()+", Overdraft= "+overdraftLimit);
	}
}
public class AccountDemo{
	public static void main(String[] args){
		Account a1 = new SavingAccount(101,5000,5);
		a1.displayDetails();
		
		Account a2 = new CurrentAccount(102,10000,2000);
		a2.displayDetails();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac AccountDemo.java
D:\CDAC\OOPJ\Assignment 3>java AccountDemo

Saving -> 101, Balance= 5000, Interest= 5%
Current -> 102, Balance= 10000, Overdraft= 2000
*/