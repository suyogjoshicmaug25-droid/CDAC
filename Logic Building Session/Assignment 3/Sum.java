import java.util.Scanner;
class Sum{
	public static int sumOfTwoNumbers(int num1,int num2){
		int sum = num1 + num2;
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		
		int result = sumOfTwoNumbers(num1,num2);
		
		System.out.println("The sum of "+num1+" and "+num2+" is "+result);
	}
}