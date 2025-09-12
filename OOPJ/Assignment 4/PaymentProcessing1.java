//Problem 25: Payment Processing
import java.util.Scanner;
class PaymentProcessing1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount as string: ");
		String s1 = sc.nextLine();
		
		System.out.print("Additional amount to add: ");
		String s2 = sc.nextLine();
		
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		int k = i + j;
		System.out.println(i+" + "+j+" = "+k);
		sc.close();	
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac PaymentProcessing1.java
D:\CDAC\OOPJ\Assignment 4>java PaymentProcessing1

Amount as string: 1000
Additional amount to add: 500
1000 + 500 = 1500
*/