/*
48. Grade with Plus/Minus
Scenario: Take marks and print grade with plus/minus (e.g., 85 → A, 78 → A−).
Input:
Enter marks: 78
Output:
Grade: A−
*/
import java.util.Scanner;

public class GradeWithPlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Enter 0–100.");
            return;
        }

        String grade;
        if (marks >= 85)       
			grade = "A";
        else if (marks >= 75)  
			grade = "A-";
        else if (marks >= 65)  
			grade = "B+";
        else if (marks >= 55)  
			grade = "B";
        else if (marks >= 45)  
			grade = "C";
        else if (marks >= 35)  
			grade = "D";
        else                   
			grade = "F";

        System.out.println("Grade: " + grade);
		sc.close();
    }
}
/*
D:\CDAC\OOPJ\Assignment 1>javac GradeWithPlusMinus.java
D:\CDAC\OOPJ\Assignment 1>java GradeWithPlusMinus
Enter marks: 78
Grade: A-
*/