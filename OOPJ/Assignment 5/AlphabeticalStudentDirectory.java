//Problem 7: Alphabetical Student Directory
import java.util.*;
class AlphabeticalStudentDirectory{
	public static void main(String[] args){
		
		TreeSet<String> students = new TreeSet<>();
		
		String []list = {"Rohan","Amit","Priya"};
		
		for(String s: list){
			students.add(s);
		}
		
		System.out.println("Students: "+students);
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac AlphabeticalStudentDirectory.java

D:\CDAC\OOPJ\Assignment 5>java AlphabeticalStudentDirectory
Students: [Amit, Priya, Rohan]
*/