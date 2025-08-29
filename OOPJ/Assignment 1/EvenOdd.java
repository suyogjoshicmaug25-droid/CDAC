/*4. Even or Odd Locker Number
Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is
even or odd.
Input:
Enter locker number: 17
Output:
Odd locker number
*/
import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter locker number : ");
		int num = sc.nextInt();
		String result = (num % 2 == 0) ? "Even locker number" : "Odd locker number";
		System.out.print(result);
		sc.close();
	}

}
/*
D:\CDAC\OOPJ\Assignment 1>javac EvenOdd.java
D:\CDAC\OOPJ\Assignment 1>java EvenOdd
Enter locker number : 5
Odd locker number
*/