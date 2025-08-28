import java.util.Scanner;
class StudyOfForLoop{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary : ");
		long salary = sc.nextLong();
		for(int i=1;i<=12;i++){
			System.out.println("At the end of the "+i+ "month the salary is "+  salary*i);
		}
	}
}