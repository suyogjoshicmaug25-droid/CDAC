/*
27. Print Message Based on character (A-E):
Scenario: Take a character (A–E) print message using switch-case.
Input:
Enter a character: B
Output:
You selected option B.
*/
import java.util.Scanner;
class MsgBasedOnChar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		switch(ch){
			case 'A':
					System.out.println("You selected option A.");
					break;
			case 'B':
					System.out.println("You selected option B.");
					break;
			case 'C':
					System.out.println("You selected option C.");
					break;
			case 'D':
					System.out.println("You selected option D.");
					break;
			case 'E':
					System.out.println("You selected option E.");
					break;
			default:
					System.out.println("Invalid character.");
		}
		sc.close();
		
	}
}
/*
C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>javac MsgBasedOnChar.java
C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>java MsgBasedOnChar
Enter a character : E
You selected option E. 
*/