/*
36. Smallest of Three Numbers (Nested Ternary)
Scenario: Take three numbers as input and print the smallest using nested ternary operator.
*/
import java.util.Scanner;
class SmallestAmongThreeTernary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int smallest = ((num1 < num2) && (num1 < num3)) ? num1 : ((num2 < num1) && (num2 < num3)) ? num2 : num3;
		System.out.println("Smallest number : "+smallest);
		sc.close();
	}
}