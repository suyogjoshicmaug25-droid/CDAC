import java.util.Scanner;
class PrintNames{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4 names : ");
		
		String[] namesArr = new String[4];
		for(int i = 0;i<namesArr.length;i++){
			namesArr[i] = sc.nextLine();
		}
		System.out.println();
		//for-each loop
		for(String names : namesArr){
			System.out.println(names);
		}
		sc.close();
	}
}