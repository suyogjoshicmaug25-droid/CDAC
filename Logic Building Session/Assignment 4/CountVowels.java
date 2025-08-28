import java.util.Scanner;
class CountVowels{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		int count = 0;
		char[] charArray = str.toCharArray();
		for(char alphabet :charArray){
			if(alphabet == 'a' || alphabet == 'A' ||
			   alphabet == 'e' || alphabet == 'E' ||
			   alphabet == 'i' || alphabet == 'I' ||
			   alphabet == 'o' || alphabet == 'O' ||
			   alphabet == 'u' || alphabet == 'U'){
				count++;
			}
		}
		System.out.println("The number of vowels in '"+str+"' is "+count);
		sc.close();
	}
}