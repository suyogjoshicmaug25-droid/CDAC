// Problem 13: Order Number Display
import java.util.Scanner;
class OrderNumberDisplay{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
	
		sb.reverse();
		System.out.println(sb);
		sc.close();
	}
	
}
/*
D:\CDAC\OOPJ\Assignment 4>javac OrderNumberDisplay.java

D:\CDAC\OOPJ\Assignment 4>java OrderNumberDisplay
Enter a string: INV2025
5202VNI
*/