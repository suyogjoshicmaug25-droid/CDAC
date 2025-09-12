// Problem 20: Bank Account Security

class BankAccount{
	private final int accountId;
	
	public BankAccount(int accountId){
		this.accountId = accountId;
	}
	
	//getter method
	public int getAccountId(){
		return accountId;
	}
	
	//setter method
	public void setAccountId(int newId){
		System.out.println("Account ID = "+getAccountId()+" (cannot be changed)");
	}
}

class BankAccountSecurity{
	public static void main(String[] args){
		BankAccount b1 = new BankAccount(101);
		//System.out.println(b1.getAccountId());
		b1.setAccountId(102);
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac BankAccountSecurity.java
D:\CDAC\OOPJ\Assignment 4>java BankAccountSecurity
Account ID = 101 (cannot be changed)
*/