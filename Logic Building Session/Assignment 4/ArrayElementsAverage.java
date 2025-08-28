import java.util.Scanner;
class ArrayElementsAverage{
	public static void main(String[] args){
		
		int[] intArr = new int[5];
		int sum = 0;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter five integers : ");
		for(int i =0;i < intArr.length;i++){
			intArr[i] = sc.nextInt();
			sum += intArr[i];
		}
		avg = sum/ (double)intArr.length;
		System.out.println("The average of the numbers is "+avg);
		sc.close();
	}
}