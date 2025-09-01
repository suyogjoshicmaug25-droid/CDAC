class BankAccount{
	
	private static double interest_rate;
	private String name;
	private double balance;
	//static block
	static{
		interest_rate = 4;
		System.out.println("Bank Interest Initialized: "+interest_rate+"%");
	}
	
	//setter function
	public void setName(String name){
		this.name = name;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	//getter function
	public String getName(){
		return name;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public static void main(String[] args){
		
		BankAccount b1 = new BankAccount();
		b1.setName("Rohit");
		b1.setBalance(5000);
		BankAccount b2 = new BankAccount();
		b2.setName("Priya");
		b2.setBalance(15000);
		
		System.out.println("Account1: Name="+b1.getName()+", Balance= "+b1.getBalance()+", Interest Rate="+b1.interest_rate+"%");
		System.out.println("Account2: Name="+b2.getName()+", Balance= "+b2.getBalance()+", Interest Rate="+b2.interest_rate+"%");
	}
}
/*
D:\CDAC\OOPJ\Assignment 2>javac BankAccount.java
D:\CDAC\OOPJ\Assignment 2>java BankAccount
Bank Interest Initialized: 4.0%
Account1: Name=Rohit, Balance= 5000.0, Interest Rate=4.0%
Account2: Name=Priya, Balance= 15000.0, Interest Rate=4.0%
*/