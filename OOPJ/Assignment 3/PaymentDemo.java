//12. Payment System
abstract class Payment{
	abstract public void pay();  //abstract method
}
class CreditCardPayment extends Payment{
	private String cardNumber;
	private int amount;

	//Constructor
	public CreditCardPayment(String cardNumber,int amount){
		this.cardNumber = cardNumber;
		this.amount = amount;
	}
	@Override
	public void pay(){
		System.out.println("Payment via Credit Card "+cardNumber+" -> Rs."+amount+" Paid");
	}
}
class UPIPayment extends Payment{
	private String upiId;
	private int amount;

	//Constructor
	public UPIPayment(String upiId,int amount){
		this.upiId = upiId;
		this.amount = amount;
	}
	@Override
	public void pay(){
		System.out.println("Payment via UPI "+upiId+" -> Rs."+amount+" Paid");
	}
}
public class PaymentDemo{
	public static void main(String[] args){
		Payment p1 = new CreditCardPayment("1234567890123456",5000);
		p1.pay();
		
		Payment p2 = new UPIPayment("rahul@upi",2000);
		p2.pay();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac PaymentDemo.java
D:\CDAC\OOPJ\Assignment 3>java PaymentDemo

Payment via Credit Card 1234567890123456 -> Rs.5000 Paid
Payment via UPI rahul@upi -> Rs.2000 Paid
*/