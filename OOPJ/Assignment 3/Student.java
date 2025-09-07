//2. Student Marks
class Student{
	private int marks;
	
	//setter method for marks
	public void setMarks(int marks){
		if(marks>= 0 && marks<=100){
			this.marks = marks;
		}
		else{
			System.out.println("Marks should be between 0 and 100");
		}
	}
	
	//getter method for marks
	public int getMarks(){
		return marks;
	}
	
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setMarks(85);
		System.out.println("marks = "+s1.getMarks());
	}
}