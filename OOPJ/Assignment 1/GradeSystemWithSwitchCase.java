/*
24. Grade Using Switch (Ranges)
Scenario: Take marks (0–100) and print grade using switch-case grouping:
● 0–24 → F
● 25–44 → E
● 45–54 → D
● 55–69 → C
● 70–84 → B
● 85–100 → A
*/
import java.util.Scanner;

class GradeSystemWithSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        String grade;

        if (marks < 0 || marks > 100) {
            grade = "Invalid input!";
        } else {
            switch (marks / 10) {
                case 10: // 100
                case 9:  // 90–99
                    grade = "A"; // still in A range
                    break;
                case 8:  // 80–89
                    if (marks >= 85)
                        grade = "A";  // 85–89
                    else
                        grade = "B";  // 80–84
                    break;
                case 7:  // 70–79
                    grade = "B"; // 70–79
                    break;
                case 6:  // 60–69
                    if (marks >= 55) 
                        grade = "C"; 
                    else 
                        grade = "D"; 
                    break;
                case 5:  // 50–59
                    if (marks >= 55)
                        grade = "C"; // 55–59
                    else
                        grade = "D"; // 50–54
                    break;
                case 4:  // 40–49
                    if (marks >= 45)
                        grade = "D"; // 45–49
                    else
                        grade = "E"; // 40–44
                    break;
                case 3:  // 30–39
                case 2:  // 20–29
                    if (marks >= 25)
                        grade = "E"; // 25–39
                    else
                        grade = "F"; // below 25
                    break;
                case 1:  // 10–19
                case 0:  // 0–9
                    grade = "F"; // 0–24
                    break;
                default:
                    grade = "F";
            }
        }

        System.out.println("Grade: " + grade);

        sc.close();
    }
}
/*
D:\CDAC\OOPJ\Assignment 1>javac GradeSystemWithSwitchCase.java
D:\CDAC\OOPJ\Assignment 1>java GradeSystemWithSwitchCase
Enter marks (0-100): 90
Grade: A
*/