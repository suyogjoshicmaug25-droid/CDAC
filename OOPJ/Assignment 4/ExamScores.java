//Problem 2: Exam Scores
import java.util.Scanner;
class ExamScores{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students : ");
		int num = sc.nextInt();
		int []marks = new int[num];
		System.out.print("Enter the marks : ");
		for(int i=0;i<num;i++){
			marks[i] = sc.nextInt();
		}
		System.out.print("Enter index of the student whose marks have to be seen:");
		int index = sc.nextInt();
		try{
			System.out.println(marks[index]); // ArrayIndexOutOfBoundException
		}catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("Invalid index accessed");
		}
		
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac ExamScores.java
D:\CDAC\OOPJ\Assignment 4>java ExamScores

Enter number of students : 3
Enter the marks : 78 90 85
Enter index of the student whose marks have to be seen:5
Invalid index accessed
*/