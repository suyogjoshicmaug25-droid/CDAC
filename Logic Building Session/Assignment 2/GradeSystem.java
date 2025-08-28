class GradeSystem {
	public static void main(String[] args) {
		int marks1 = 85;
		int marks2 = 90;
		int marks3 = 95;
		double avg_marks;
		
		avg_marks = (marks1 + marks2 + marks3)/3;
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
}