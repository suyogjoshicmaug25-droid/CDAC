/*16. Vowel or Consonant Checker
Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid
input.
Input:
Enter a character: e
Output:
Vowel
*/
import java.util.Scanner;
class VowelOrConsonant{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		
		if(ch == 'A' | ch == 'a' |
		ch == 'E' | ch == 'e' |
		ch == 'I' | ch == 'i' |
		ch == 'U' | ch == 'u'){
			System.out.println("Vowel");
		}
		else{
			System.out.println("Consanant");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac VowelOrConsonant.java
D:\CDAC\OOPJ\Assignment 1>java VowelOrConsonant
Enter a character : e
Vowel
*/