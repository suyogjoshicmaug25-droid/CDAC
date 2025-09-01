class Student{
	private String name;
	private int marks;
	private static int totalStudents;
	
	//Constructor
	public Student(String name,int marks){
		this.name = name;
		this.marks = marks;
		totalStudents++;
	}
	
	// setter method for marks
	public void setMarks(int marks){
		this.marks = marks;
	}
	
	// getter method for marks
	public int getMarks(){
		return marks;
	}
	
	// isPassed() method
	public boolean isPassed(){
		if(marks >= 35)
			return true;
		else
			return false;
	}
	
	// static method showTotalStudents()
	public static void  showTotalStudents(){
		System.out.println("Total students: "+totalStudents);
	}
	
	public static void main(String[] args){
		/*
		Student1: Name: "Rahul", Marks: 78
		Student2: Name: "Pooja", Marks: 34
		Student3: Name: "Amit", Marks: 65
		*/
		Student s1 = new Student("Rahul",78);
		Student s2 = new Student("Pooja",34);
		Student s3 = new Student("Amit",65);
		/*
		Student Rahul Passed? true
		Student Pooja Passed? false
		Student Amit Passed? true
		*/
		System.out.println("Student "+s1.name+" Passed? "+s1.isPassed());
		System.out.println("Student "+s2.name+" Passed? "+s2.isPassed());
		System.out.println("Student "+s3.name+" Passed? "+s3.isPassed());
		
		Student.showTotalStudents();
		
	}
}