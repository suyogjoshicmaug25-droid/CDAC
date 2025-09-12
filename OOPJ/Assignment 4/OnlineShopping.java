//Problem 5: Online Shopping
import java.util.Scanner;
class OnlineShopping{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter quantity : ");
		int quantity = sc.nextInt();
		
		System.out.print("Enter number of products : ");
		int n = sc.nextInt();
		
		double [] prices = new double[n];
		System.out.print("Enter the prices of the products : ");
		
		for(int i=0;i<n;i++){
			prices[i] = sc.nextDouble();
		}
	
		System.out.print("Enter the product index: ");
		int index = sc.nextInt();
	
		try{
			double unitPrice = prices[index]; //ArrayIndexOutOfBoundsException
			try{
				if(quantity <= 0){
					throw new IllegalAccessException("Invalid quantity");
				}
				double total = unitPrice * quantity;
				System.out.printf("Total = %.2f",total);
			}catch(IllegalAccessException e){
				System.out.println("Invalid qunatity");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Product");
		}
		sc.close();
	}
	
}
/*
D:\CDAC\OOPJ\Assignment 4>javac OnlineShopping.java

D:\CDAC\OOPJ\Assignment 4>java OnlineShopping
Enter quantity : 0
Enter number of products : 3
Enter the prices of the products : 199.99 299.99 499.99
Enter the product index: 2
Invalid qunatity

D:\CDAC\OOPJ\Assignment 4>java OnlineShopping
Enter quantity : 1
Enter number of products : 2
Enter the prices of the products : 160.50 199.99
Enter the product index: 3
Invalid Product
*/