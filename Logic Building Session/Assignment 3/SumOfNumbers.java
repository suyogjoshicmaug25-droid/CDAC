import java.util.Scanner;
class SumOfNumbers{
	public static int calculateSum(int n){
		int sum = 0;
		for(int i = 1;i<=n;i++){
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int result = calculateSum(num);
		System.out.println("The sum of numbers from 1 to "+num+" is "+result+".");
		sc.close();
	}
}