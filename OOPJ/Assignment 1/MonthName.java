import java.util.Scanner;
class MonthName{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number : ");
		int num = sc.nextInt();
		String result = (num == 1) ? "January" : (num == 2) ? "Febuary" : (num == 3) ? "March" : (num == 4) ? "April" : (num == 5) ? "May" : (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "August" : (num == 9) ? "September" : (num == 10) ? "October" : (num == 11) ? "November" : (num == 12) ? "December" : "Invalid";
		System.out.println("Month is "+result);
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac MonthName.java
D:\CDAC\OOPJ\Assignment 1>java MonthName
Enter month number : 5
Month is May
*/