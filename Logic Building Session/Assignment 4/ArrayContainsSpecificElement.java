import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
class ArrayContainsSpecificElement{
	public static void main(String[] args){
		Integer[] arr = new Integer[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 integers : ");
		for(int i = 0;i<5;i++){
			arr[i] = sc.nextInt();
		}
		
		List<Integer> list = Arrays.asList(arr);
		System.out.print("Enter a number to search : ");
		int num = sc.nextInt();
		if(list.contains(num)){
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
		sc.close();
	}
	
}