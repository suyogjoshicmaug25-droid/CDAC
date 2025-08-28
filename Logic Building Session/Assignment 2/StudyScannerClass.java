import java.util.Scanner;
class StudyScannerClass {
	public static void main(String[] args){
		String name;
		int age;
		long salary;
		float cgpa;
		
		// make the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		System.out.println("Enter your salary");
		salary = sc.nextLong();
		System.out.println("Enter your cgpa: ");
		cgpa = sc.nextFloat();
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("CGPA : "+cgpa);
	}
}