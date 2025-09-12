// Problem 18: Ticket Number Verification
import java.util.Scanner;
class TicketNumberVerification{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Ticket Number: ");
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.reverse();
		
		System.out.println(sb);
		sc.close();
	}
}