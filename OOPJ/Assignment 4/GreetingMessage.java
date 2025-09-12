// Problem 10: Greeting Message
import java.util.Scanner;
class GreetingMessage{
	public static void main(String[] args){
		
		StringBuilder sb = new StringBuilder(50);
		sb.append("Hello ");
		sb.insert(6,"CDAC ");
		sb.append("Java Student");
		System.out.println(sb);	
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac GreetingMessage.java
D:\CDAC\OOPJ\Assignment 4>java GreetingMessage
Hello CDAC Java Student
*/