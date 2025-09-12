//Problem 7: Student List
import java.io.*;
class StudentList{
	public static void main(String[] args){
		File f = new File("student_list.txt");
		
		try{
			FileReader fr = new FileReader(f); //FileNotFoundException
		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac StudentList.java
D:\CDAC\OOPJ\Assignment 4>java StudentList

File not found
*/