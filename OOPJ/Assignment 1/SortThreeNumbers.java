/*
45. Sort Three Numbers in Ascending Order
Scenario: Take three numbers and print them in ascending order.
*/
import java.util.Scanner;
class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Sorting with simple swaps
        if (a > b) { int temp = a; a = b; b = temp; }
        if (a > c) { int temp = a; a = c; c = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }

        System.out.println("Ascending order: " + a + " " + b + " " + c);
    }
}
/*
D:\CDAC\OOPJ\Assignment 1>javac SortThreeNumbers.java
D:\CDAC\OOPJ\Assignment 1>java SortThreeNumbers
Enter first number: 23
Enter second number: 12
Enter third number: 31
Ascending order: 12 23 31
*/
