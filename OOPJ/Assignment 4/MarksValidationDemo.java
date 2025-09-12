//Problem 9: Marks Validation
import java.util.Scanner;
class MarksValidation extends Exception{
	MarksValidation(){
		super("Invalid marks");
	}
}
class MarksValidationDemo{
	
	static void marksValidate(int marks) throws MarksValidation{
		if( marks>= 0 && marks <= 100)
			System.out.println("Marks = "+marks);
		else
			throw new MarksValidation();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks : ");
		int marks = sc.nextInt();
		
		try{
			marksValidate(marks);
		}catch(MarksValidation e){
			System.out.println(e.getMessage());
		}
		
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac MarksValidationDemo.java
D:\CDAC\OOPJ\Assignment 4>java MarksValidationDemo

Enter your marks : -5
Invalid marks
*/