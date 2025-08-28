// We understand the behavior of the instance variable and static variable

class Employee {
	int id;
	String name;
	static String companyName;
	
	// Constructor
	Employee (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.println(id+" "+name+" "+companyName);
	}
} 
public class StudyVariables {
	public static void main(String[] args) {
		Employee.companyName = "Infosys";  // Initialized static variable
		
		Employee e1 = new Employee(121, "Robert");
		Employee e2 = new Employee(122, "Alice");
		
		e1.print();
		e2.print();
		
	}
}