import java.util.Scanner;
import java.io.*;
class StringPalindrome{
	public static void main(String[] args){
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		str1 = sc.nextLine();
		StringBuilder objSB = new StringBuilder();
		objSB.append(str1);
		objSB.reverse();
		str2 = objSB.toString();
		if(str1.equals(str2)){
			System.out.println("The string "+str1+" is a palindrome.");
		}
		else{
			System.out.println("The string "+str1+" is not  palindrome.");
		}
		sc.close();
	}
}