//Problem 4: Employee Data
import java.util.Scanner;
class EmployeeData{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of employess :");
		
		int num = sc.nextInt();
		int [] salaries = new int[num];
		
		System.out.print("Enter the salaries : ");
		for(int i=0;i<num;i++){
			salaries[i] = sc.nextInt();
		}
		
		System.out.print("Index of the employee : ");
		int index = sc.nextInt(); 
		
		System.out.print("Number of working hours : ");
		int working_hours = sc.nextInt();
		
		try{
			int salary = salaries[index]; // ArrayIndexOutOfBoundsException
			try{
				int hourly_wage = salary / working_hours;
			}catch(ArithmeticException e){
				System.out.println("Divde by zero");
			}
		}catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("Invalid index");
		}
		sc.close();
	}
}
/*
D:\CDAC\OOPJ\Assignment 4>javac EmployeeData.java

D:\CDAC\OOPJ\Assignment 4>java EmployeeData
Enter number of employess :2
Enter the salaries : 5000 6000
Index of the employee : 0
Number of working hours : 0
Divde by zero

D:\CDAC\OOPJ\Assignment 4>java EmployeeData
Enter number of employess :2
Enter the salaries : 4000 5000
Index of the employee : 3
Number of working hours : 5
Invalid index
*/
