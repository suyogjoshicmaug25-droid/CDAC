//Problem 6: Age Restriction
import java.util.Scanner;
class AgeRestriction extends Exception{
	AgeRestriction(){
	super("AgeNotValidException: Age must be >= 18");
	}
}
class AgeRestrictionDemo{
	
	static void age(int a) throws AgeRestriction{
		if(a > 18)
			System.out.println("Age = "+a);
		else
			throw new AgeRestriction();
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int a = sc.nextInt();
	
		try{
			age(a);
		}catch(AgeRestriction e){
			System.out.println(e.getMessage());
		}
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac AgeRestrictionDemo.java
D:\CDAC\OOPJ\Assignment 4>java AgeRestrictionDemo

Enter your age : 16
AgeNotValidException: Age must be >= 18
*/