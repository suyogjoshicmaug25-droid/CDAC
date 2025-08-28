import java.util.Scanner;
import java.util.Arrays;
class ArrayBinarySearch{
	public static void main(String[] args){
		int[] arr = new int[5];
		int num,index; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 integers : ");
		for(int i = 0;i<5;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the number to search : ");
		num = sc.nextInt();
		Arrays.sort(arr);
		index = Arrays.binarySearch(arr,num);
		if(index >= 0){
			System.out.println("The number "+num+" is found at index "+index);
		}
		else{
			System.out.println("Not Found");
		}
		sc.close();
	}
}