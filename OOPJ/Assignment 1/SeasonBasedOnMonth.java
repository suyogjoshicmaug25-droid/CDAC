/*
26. Season Based on Month
Scenario: Print season based on month number:
● Dec–Feb → Winter
● Mar–May → Summer
● Jun–Aug → Monsoon
● Sep–Nov → Autumn
Input:
Enter month number: 12
Output:
Season is Winter
*/
import java.util.Scanner;
class SeasonBasedOnMonth{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number : ");
		int num = sc.nextInt();
		switch(num){
			case 12:
			case 1:
			case 2:
					System.out.println("Season is Winter");
					break;
			case 3:
			case 4:
			case 5:
					System.out.println("Season is Summer");
					break;
			case 6:
			case 7:
			case 8:
					System.out.println("Season in Monsoon");
					break;
			case 9:
			case 10:
			case 11:
					System.out.println("Season is Autumn");
					break;
			default:
					System.out.println("Invalid month number");
		}
	}
}
/*
C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>java SeasonBasedOnMonth
Enter month number : 2
Season is Winter
*/
