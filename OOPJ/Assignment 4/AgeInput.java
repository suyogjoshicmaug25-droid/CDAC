// Age Input
import java.util.Scanner;
class AgeInput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		String age = sc.next();
		try{
		int age1 = Integer.parseInt(age);  //NumberFormatException
		}catch(NumberFormatException e){
			System.out.println("Invalid number format");
		}
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac AgeInput.java
D:\CDAC\OOPJ\Assignment 4>java AgeInput

Enter your age :
eighteen
Invalid number format
*/