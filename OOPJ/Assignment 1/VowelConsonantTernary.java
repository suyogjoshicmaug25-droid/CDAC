/*
38. Vowel or Consonant (Ternary)
Scenario: Take a character and check if it is a vowel or consonant using ternary operator.
Input:
Enter character: i
Output:
Vowel
*/
import java.util.Scanner;
class VowelConsonantTernary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  a character :  ");
		char ch = sc.next().charAt(0);
		String result = (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ? "Vowel" : "Consonant";
		System.out.println(result);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac VowelConsonantTernary.java
D:\CDAC\OOPJ\Assignment 1>java VowelConsonantTernary
Enter  a character :  A
Vowel
*/