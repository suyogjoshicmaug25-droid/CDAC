import java.util.Scanner;
class MultiplicationTable{
	public static void printMultiplicationTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" X "+i+" = "+ num*i);
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		printMultiplicationTable(num);
		sc.close();
	}
}
