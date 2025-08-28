import java.io.*;
import java.util.Scanner;
class StringReverse{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		
		StringBuilder objSB = new StringBuilder();
		
		objSB.append(str);
		objSB.reverse();
		System.out.println("Reversed string : "+objSB);
		sc.close();
	}
}