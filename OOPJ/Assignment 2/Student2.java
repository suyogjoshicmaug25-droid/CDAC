class Student2{
	private int rollNo;
	private String name;
	private int marks;
	
	//Parameterized constructor
	public Student2(int rollNo,String name,int marks){
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	//setter method for marks
	public void setMarks(int marks){
		this.marks = marks;
	}
	//getter method for marks
	public int getMarks(){
		return marks;
	}
	public String calculateGrade(){
		if(marks >= 80)
			return "A";
		else if(marks >= 60)
			return "B";
		else if(marks >= 40)
			return "C";
		else
			return "Fail";
	}
	
	public static void main(String[] args){
		Student2 s1 = new Student2(1,"Robert",67);
		System.out.println("Student1: Roll No.: "+s1.rollNo+" Name: "+s1.name+" Marks: "+s1.marks);
		
		s1.setMarks(78);
		System.out.println("Student1: Roll No.: "+s1.rollNo+" Name: "+s1.name+" Marks: "+s1.marks);	
		
		Student2 s2 = new Student2(2,"Tom",89);
		System.out.println("Student name: "+s1.name+" Marks: "+s1.marks+" Grade: "+s1.calculateGrade());
		System.out.println("Student name: "+s2.name+" Marks: "+s2.marks+" Grade: "+s2.calculateGrade());
	}
}
/*
D:\CDAC\OOPJ\Assignment 2>javac Student2.java
D:\CDAC\OOPJ\Assignment 2>java Student2
Student1: Roll No.: 1 Name: Robert Marks: 67
Student1: Roll No.: 1 Name: Robert Marks: 78
*/