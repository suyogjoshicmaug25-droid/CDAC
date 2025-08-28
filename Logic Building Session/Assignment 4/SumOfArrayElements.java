import java.util.Scanner;
class SumOfArrayElements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter five inegers : ");
		int[] arr = new int[5];
		int sum=0;
		for(int i=0;i<5;i++){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("The sum of all numbers is "+sum);
		sc.close();
	}
}