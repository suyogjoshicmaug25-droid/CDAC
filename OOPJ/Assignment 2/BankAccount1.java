class BankAccount1{
	private String accountHolder;
	private double balance;
	private double amount;
	static private String bankName = "CDAC Bank";
	
	//Parameterized constructor
	BankAccount1(String accountHolder,double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	//setter function
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	//getter function
	public double getBalance(){
		return balance;
	}
	//deposit method
	public double deposit(double amount){
		balance = balance + amount;
		return balance;
	}
	//withdraw method
	public double withdraw(double amount){
		balance = balance - amount;
		return balance;
	}
	//static method displayBankName()
	public static void displayBankName(){
		System.out.println("Bank name: "+bankName);
	}
	
	public static void main(String[] args){
		BankAccount1 b1 = new BankAccount1("Amit",23000);
		BankAccount1 b2 = new BankAccount1("Sumit",20000);
		
		System.out.println("Account1: Account Holder: "+b1.accountHolder+" Balance: "+b1.balance);
		System.out.println("Account2: Account Holder: "+b2.accountHolder+" Balance: "+b2.balance);
		
		b1.deposit(5000);
		b2.withdraw(2000);
		
		System.out.println("Account1: Account Holder: "+b1.accountHolder+" Balance: "+b1.balance);
		System.out.println("Account2: Account Holder: "+b2.accountHolder+" Balance: "+b2.balance);
		
		displayBankName();
		BankAccount1 b3 = new BankAccount1("Sumit",20000);
		b3.displayBankName();
	}
}