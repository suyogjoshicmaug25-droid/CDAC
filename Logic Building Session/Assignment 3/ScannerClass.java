import java.util.Scanner;
class ScannerClass {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your height: ");
		float height = sc.nextFloat();
		System.out.println("Your name is "+name+" height is "+height+" and your age is "+age );
	}
}