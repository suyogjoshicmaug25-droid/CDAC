import java.util.Scanner;
class PositveNegativeCount{
	public static void main(String[] args){
		int count_pos=0,count_neg=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter six integers : ");
		int[] intArr = new int[6];
		for(int i = 0;i < intArr.length;i++){
			intArr[i] = sc.nextInt();
			if(intArr[i] > 0){
				count_pos++;
			}
			else if(intArr[i] < 0) {
				count_neg++;
			}
			else{
				continue;
			}
		}
		System.out.println("Positive numbers : "+count_pos);
		System.out.println("Negative numbers : "+count_neg);
		sc.close();
	}
	
}