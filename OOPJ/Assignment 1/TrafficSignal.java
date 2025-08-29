/*
28. Traffic Signal Instruction
Scenario : Traffic signal color as input (Red, Green, Yellow) and print appropriate instruction.
Input : 
Enter traffic light color : Green
Output:
Go
*/
import java.util.Scanner;
class TrafficSignal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter traffic light color : ");
		String color = sc.next();
		switch(color){
			case "Green":
					System.out.println("Go");
					break;
			case "Yellow":
					System.out.println("Ready/Wait");
					break;
			case "Red":
					System.out.println("Stop");
					break;
			default:
					System.out.println("Invalid signal color");
		}
		sc.close();
	}
	
}
/*
C:\Users\LENOVO\OneDrive\Desktop\CDAC\OOPJ\Assignment 1>java TrafficSignal
Enter traffic light color : Red
Stop
 */