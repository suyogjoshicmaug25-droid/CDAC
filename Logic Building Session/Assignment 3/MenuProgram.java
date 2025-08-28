import java.util.Scanner;
class MenuProgram{
	// static variables
	static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;
	static Scanner sc = new Scanner(System.in);
	
	
	public static void gradeEvaluation(){
		System.out.println("Enter your marks in maths: ");
		int mathsMarks = sc.nextInt();
		System.out.println("Enter your marks in science: ");
		int scienceMarks = sc.nextInt();
		System.out.println("Enter your marks in english: ");
		int englishMarks = sc.nextInt();
		
		double avg_marks;
		
		avg_marks = (mathsMarks + scienceMarks + englishMarks)/3;
		System.out.println("Average marks : "+avg_marks);
		if (avg_marks >= 90) {
			System.out.println("Grade A");
		}
		else if(avg_marks >= 70 && avg_marks <=89) {
			System.out.println("Grade B");
		}
		else if(avg_marks >= 50 && avg_marks <=69) {
			System.out.println("Grade C");
		}
		else if(avg_marks >= 30 && avg_marks <=49) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");	
		}
	}
	
	public static void leapYear() {
		
		System.out.println("Please enter any year: ");
		int year = sc.nextInt();
		
		if ( (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0) ) )
		{
			System.out.println(year+ " is a leap year.");
		}
		else {
			System.out.println(year+ " is not a leap year.");
		}
	}
	
	public static void dayOfWeek() {
		System.out.println("Enter any day number : ");
		int dayNumber = sc.nextInt();
		
		switch(dayNumber){
			case 1:
				System.out.println("This day is Monday");
				break;
			case 2:
				System.out.println("This day is Tuesday");
				break;
			case 3:
				System.out.println("This day is Wednesday");
				break;
			case 4:
				System.out.println("This day is Thursday");
				break;
			case 5:
				System.out.println("This day is Friday");
				break;
			case 6:
				System.out.println("This day is Saturday");
				break;
			case 7:
				System.out.println("This day is Sunday");
				break;
			default:
				System.out.println("Invalid Day number.");
			
		}
	}
	
	public static void showValues(){
		a = 12;
		b = 256;
		c = 34567;
		d = 4509659499L;
		e = 12.65f;
		f = 3.125556882;
		g = 'd';
		h = true;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
	public static void main(String[] args){
		int choice;
		
		
		do{
			System.out.println("\n\n---------Menu---------");
			System.out.println("1. Grade Evaluation System");
			System.out.println("2. Leap Year Check");
			System.out.println("3. Day of the week");
			System.out.println("4. Identify Default Values of Variables");
			System.out.println("5. Exit");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:	
						gradeEvaluation();
						break;
				case 2:
						leapYear();
						break;
				case 3: 
						dayOfWeek();
						break;
				case 4:
						showValues();
						break;
				case 5:
						System.out.println("Exiting...");
						break;
				default:
						System.out.println("the invalid number");


			}
		}while(choice != 5);
		
		sc.close();
	}
}