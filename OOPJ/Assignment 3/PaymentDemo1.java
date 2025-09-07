//18. Payment Process
abstract class Payment{
	abstract public void pay();
}
class CreditCardPayment extends Payment{
	private String cardNumber;
	private double amount;
	
	//Constructor
	public CreditCardPayment(String cardNumber,double amount){
		this.cardNumber = cardNumber;
		this.amount = amount;
	}
	
	//getter function 
	public String getCardNumber(){
		return cardNumber;
	}
	
	public double getAmount(){
		return amount;
	}
	@Override
	public void pay(){
		System.out.println("Payment via Credit Card "+cardNumber+" -> Rs."+amount+" Paid");
	}
}
class UPIPayment extends Payment{
	private String upiId;
	private double amount;
	
	//Constructor
	public UPIPayment(String upiId,double amount){
		this.upiId = upiId;
		this.amount = amount;
	}
	
	//getter function 
	public String getUPIId(){
		return upiId;
	}
	
	public double getAmount(){
		return amount;
	}
	@Override
	public void pay(){
		System.out.println("Payment via UPI "+upiId+" -> Rs."+amount+" Paid");
	}
}
public class PaymentDemo1{
	public static void main(String[] args){
		Payment p1 = new CreditCardPayment("1234567890123456",5000);
		p1.pay();
		
		Payment p2 = new UPIPayment("rahul@upi",2000);
		p2.pay();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac PaymentDemo1.java
D:\CDAC\OOPJ\Assignment 3>java PaymentDemo1

Payment via Credit Card 1234567890123456 -> Rs.5000.0 Paid
Payment via UPI rahul@upi -> Rs.2000.0 Paid
*/