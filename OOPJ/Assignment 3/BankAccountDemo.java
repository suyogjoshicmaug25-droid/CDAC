//19. Bank Account Types
class BankAccount{
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	//constructor
	public BankAccount(int accountNumber,String accountHolder,double balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	//getter methods
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public String getAccountHolder(){
		return accountHolder;
	}
	
	public double getBalance(){
		return balance;
	}
	//display method
	public void displayBalance(){
		System.out.println("Account Holder= "+getAccountHolder()+" Balance="+getBalance());
	}
}
class SavingsAccount extends BankAccount{
	private double interestRate;
	
	public SavingsAccount(int accountNumber,String accountHolder,double balance,double interestRate){
		super(accountNumber,accountHolder,balance);
		this.interestRate = interestRate;
	}
	public double calculateInterest() {
        return getBalance() * (interestRate / 100.0);
    }
	
	@Override
	public void displayBalance(){
		System.out.println(getAccountHolder()+" -> Balance="+getBalance()+", Interest="+calculateInterest());
	}
}
class CurrentAccount extends BankAccount{
	private double overDraftLimit;
	
	public CurrentAccount(int accountNumber,String accountHolder,double balance,double overDraftLimit){
		super(accountNumber,accountHolder,balance);
		this.overDraftLimit = overDraftLimit;
	}
	
	@Override
	public void displayBalance(){
		System.out.println(getAccountHolder()+" -> Balance="+getBalance()+", Overdraft Limit="+overDraftLimit);
	}
}
public class BankAccountDemo{
	public static void main(String[] args){
		BankAccount b1 = new SavingsAccount(101,"Ramesh",5000,5);
		BankAccount b2 = new CurrentAccount(102,"Anita",2000,1000);
		
		b1.displayBalance();
		b2.displayBalance();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac BankAccountDemo.java
D:\CDAC\OOPJ\Assignment 3>java BankAccountDemo

Ramesh -> Balance=5000.0, Interest=250.0
Anita -> Balance=2000.0, Overdraft Limit=1000.0
*/