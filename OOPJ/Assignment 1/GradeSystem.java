/*
11. Grade Based on Percentage
Scenario: Your friend got exam marks. Take percentage marks as input and print the grade:
● 90+ → A+
● 76–89 → A
● 66–75 → B+
● 51–65 → B
● 36–50 → C
● Below 35 → Fail
*/
import java.util.Scanner;
class GradeSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your percentages : ");
		int percent = sc.nextInt();
		if(percent >= 90){
			System.out.println("Grade A+");
		}
		else if(percent >= 76 && percent <= 89){
			System.out.println("Grade A");
		}
		else if(percent >= 66 && percent <= 75){
			System.out.println("Grade B+");
		}
		else if(percent >= 51 && percent <= 65){
			System.out.println("Grade B");
		}
		else if(percent >= 36 && percent <= 50){
			System.out.println("Grade C");
		}
		else{
			System.out.println("Fail");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac GradeSystem.java
D:\CDAC\OOPJ\Assignment 1>java GradeSystem
Enter your percentages : 78
Grade A
*/