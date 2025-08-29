/*
31. Greatest of Two Numbers (Ternary)
Input:
Enter first number: 45
Enter second number:30
Output:
Greatest number : 45
*/
import java.util.Scanner;
class GreatestAmongTwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter secon number : ");
		int num2 = sc.nextInt();
		int result = (num1 > num2) ? num1 : num2;
		System.out.println("Greatest number : "+result);
		sc.close();
	}
}
/*
C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>java GreatestAmongTwo
Enter first number : 12
Enter secon number : 23
Greatest number : 23
*/