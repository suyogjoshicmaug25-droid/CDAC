//23. School Members
class Member{
	private String name;
	private int id;
	
	//Constructor
	public Member(String name,int id){
		this.name = name;
		this.id = id;
	}
	
	//getter method
	public String getname(){
		return name;
	}
	
	public int getId(){
		return id;
	}
	
	public void displayInfo(){
		System.out.println(name+" -> Id="+id);
	}
}
class Teacher extends Member{
	private String subject;
	
	//Constructor
	public Teacher(String name,int id,String subject){
		super(name,id);
		this.subject = subject;
	}
	
	//getter method
	public String getSubject(){
		return subject;
	}
	//display method
	public void displayInfo(){
		System.out.println(getname()+" -> ID="+getId()+", Subject="+subject);
	}
}
class Student extends Member{
	private int grade;
	
	//Constructor
	public Student(String name,int id,int grade){
		super(name,id);
		this.grade = grade;
	}
	
	//getter method
	public int getGrade(){
		return grade;
	}
	
	//display method
	public void displayInfo(){
		System.out.println(getname()+" -> ID="+getId()+", Grade="+grade);
	}
}
class Staff extends Member{
	private String department;
	
	//Constructor
	public Staff(String name,int id,String department){
		super(name,id);
		this.department = department;
	}
	
	//getter method
	public String getDepartment(){
		return department;
	}
	//display method
	public void displayInfo(){
		System.out.println(getname()+" -> ID="+getId()+", Department="+department);
	}
}
public class SchoolMembers{
	public static void main(String[] args){
		Member m1 = new Teacher("Mr.Kumar",101,"English");
		Member m2 = new Student("Riya",201,10);
		Member m3 = new Staff("Mr.Das",301,"Maintenance");
		m1.displayInfo();
		m2.displayInfo();
		m3.displayInfo();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac SchoolMembers.java
D:\CDAC\OOPJ\Assignment 3>java SchoolMembers

Mr.Kumar -> ID=101, Subject=English
Riya -> ID=201, Grade=10
Mr.Das -> ID=301, Department=Maintenance
*/