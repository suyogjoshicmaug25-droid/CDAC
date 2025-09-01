class Student1{
	private String name;
	private String className;
	private static int tutionFee;
	
	static{
		tutionFee = 30000;
		System.out.println("School Tution Fee Initilized: "+tutionFee);
	}
	
	//setter methods
	public void setName(String name){
		this.name = name;
	}
	
	public void setClassName(String className){
		this.className = className;
	}
	
	//getter function
	public String getName(){
		return name;
	}
	
	public String getClassName(){
		return className;
	}
	
	public static void main(String[] args){
		Student1 s1 = new Student1();
		s1.setName("Anjali");
		s1.setClassName("10th");
		
		Student1 s2 = new Student1();
		s2.setName("Vikram");
		s2.setClassName("12th");
		
		System.out.println("Student1: Name="+s1.getName()+", Class="+s1.getClassName()+", Tution Fee="+tutionFee);
		System.out.println("Student1: Name="+s2.getName()+", Class="+s2.getClassName()+", Tution Fee="+tutionFee);
	}
}
/*
D:\CDAC\OOPJ\Assignment 2>javac Student1.java
D:\CDAC\OOPJ\Assignment 2>java Student1
School Tution Fee Initilized: 30000
Student1: Name=Anjali, Class=10th, Tution Fee=30000
Student1: Name=Vikram, Class=12th, Tution Fee=30000
*/