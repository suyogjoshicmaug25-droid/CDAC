import java.util.*;
class PrintArrayUsingForEach{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 integers : ");
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++){
			arr[i] = sc.nextInt();
		}
		
		//for-each loop
		for(int element: arr){
			System.out.print(element+" ");
		}
		sc.close();
	}
}