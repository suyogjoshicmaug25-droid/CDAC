// 8. Payment Processing
class PaymentProcessing{
	public static void main(String[] args){
		try{
			throw new IllegalArgumentException();
		}catch(IllegalArgumentException e){
			System.out.println("Exception occurred: Payment failed");
		}finally{
			System.out.println("Cleanup done");
		}
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac PaymentProcessing.java
D:\CDAC\OOPJ\Assignment 4>java PaymentProcessing

Exception occurred: Payment failed
Cleanup done
*/




