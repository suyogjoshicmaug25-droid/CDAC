/*
12. Oldest and Youngest Among Three Friends
Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the
oldest and youngest.
Input:
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Output:
Oldest: Friend 2
Youngest: Friend 3
*/
import java.util.Scanner;
class OldYoungAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of first friend : ");
        int age1 = sc.nextInt();
        System.out.print("Enter the age of second friend : ");
        int age2 = sc.nextInt();
        System.out.print("Enter the age of third friend : ");
        int age3 = sc.nextInt();

        int oldestAge = Math.max(age1, Math.max(age2, age3));
        int youngestAge = Math.min(age1, Math.min(age2, age3));

        System.out.print("Oldest : ");
        if(age1 == oldestAge) System.out.print("Friend 1 ");
        if(age2 == oldestAge) System.out.print("Friend 2 ");
        if(age3 == oldestAge) System.out.print("Friend 3 ");
        System.out.println();

        System.out.print("Youngest : ");
        if(age1 == youngestAge) System.out.print("Friend 1 ");
        if(age2 == youngestAge) System.out.print("Friend 2 ");
        if(age3 == youngestAge) System.out.print("Friend 3 ");
        System.out.println();

        sc.close();
    }
}
/*
D:\CDAC\OOPJ\Assignment 1>javac OldYoungAmongThree.java
D:\CDAC\OOPJ\Assignment 1>java OldYoungAmongThree
Enter the age of first friend : 12
Enter the age of second friend : 12
Enter the age of third friend : 14
Oldest : Friend 3
Youngest : Friend 1 Friend 2
*/