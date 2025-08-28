import java.util.Scanner;
import java.util.Arrays;
class LargestElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter five integers : ");
		int[] intArr = new int[5];
		
		for(int i = 0;i< intArr.length;i++){
			intArr[i] = sc.nextInt();
		}
		Arrays.sort(intArr);
		System.out.println("The largest element is "+intArr[intArr.length-1]);
		sc.close();
	}
}