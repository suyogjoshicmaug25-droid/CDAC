/* 50. Divisibility by 2, 3, 5 with Custom Messages 
Scenario: Take a number and check divisibility by 2, 3, and 5, printing custom messages for each. 
Input: 
Enter number: 30 
Output: 
Divisible by 2 
Divisible by 3 
Divsible by 5
*/
import java.util.Scanner;

class DivisibilityCheck1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Divisible by 2");
        }
        if (num % 3 == 0) {
            System.out.println("Divisible by 3");
        }
        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        }

        // If not divisible by any
        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
            System.out.println("Not divisible by 2, 3, or 5");
        }
    }
}
/*
D:\CDAC\OOPJ\Assignment 1>javac DivisibilityCheck1.java
D:\CDAC\OOPJ\Assignment 1>java DivisibilityCheck1
Enter number: 30
Divisible by 2
Divisible by 3
Divisible by 5
*/
