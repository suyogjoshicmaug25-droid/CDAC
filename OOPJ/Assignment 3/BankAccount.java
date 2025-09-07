//1. Bank Account Protection
class BankAccount{
	 private double balance;
	 
	 //getter function for balance
	 public double getBalance(){
		 return balance;
	 }
 
	 //deposit method
	 public void deposit(double amount){
		 
		if (amount <= 0) {
			System.out.println("Invalid deposit amount");
		} else {
			System.out.println("Deposit = " + amount);
			balance += amount;
		}
	 }
	 
	 //withdraw method
	 public void withdraw(double amount){
		 if(amount <= 0){
			 System.out.println("Invalid withdrawal amount"); 
		 }
		 else{
			if(balance > amount){
			 System.out.println("Withdrawl = "+amount);
			 balance -= amount;
			}
			else{
				System.out.println("Withdrawal amount exceeds available balance");
			}
		 }	
	 }
	 
	 public static void main(String[] args){
		 BankAccount b1 = new BankAccount();
		 b1.deposit(5000); //5000
		 b1.withdraw(2000); //3000
		 b1.deposit(5000);  //8000
		 b1.withdraw(10000); //Withdrawal amount exceeds available balance
		 System.out.println("Updated balance: "+b1.getBalance());
	 }
}