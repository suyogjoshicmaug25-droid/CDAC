/*
32. Positive  negative or zero (Ternary):
Input : 
Enter a number : -12
Output:
Number is negative
*/
import java.util.Scanner;
class CheckPosNegZero{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
		System.out.println("Number is "+result);
		sc.close();
	}
}
/*
C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>javac CheckPosNegZero.java

C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>java CheckPosNegZero
Enter a number : 34
Number is Positive
*/