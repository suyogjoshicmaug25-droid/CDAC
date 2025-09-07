//24. Payment Gateway
interface Payment{
	public void pay(double amount);
}
class CreditCardPayment implements Payment{
	
		
	@Override
	public void pay(double amount){
		System.out.println("Processing Credit Card Payment of "+amount);
	}
}
class PayPalPayment implements Payment{
	private double amount;
	
	@Override
	public void pay(double amount){
		System.out.println("Processing PayPal Payment of "+amount);
	}
}
public class PaymentInterfaceDemo{
	public static void main(String[] args){
		Payment p1 = new CreditCardPayment();
		Payment p2 = new PayPalPayment();
		
		p1.pay(2500);
		p2.pay(1500);
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac PaymentInterfaceDemo.java
D:\CDAC\OOPJ\Assignment 3>java PaymentInterfaceDemo

Processing Credit Card Payment of 2500.0
Processing PayPal Payment of 1500.0
*/