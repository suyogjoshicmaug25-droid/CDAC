class Employee1{
	private int id;
	private String name;
	private double basicSalary;
	static private int counter = 1001;
	
	//default constructor
	Employee1(){
		this.id = counter++;
		this.name = "Unknown";
		this.basicSalary = 20000;
	}
	//parameterized constructor
	Employee1(String name,double basicSalary){
		this.id = counter++;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	public void displayEmployee(){
		System.out.println("ID: "+id+", Name: "+name+", Salary: "+basicSalary+", Net Salary: "+calculateNetSalary());
	}
	//getter functions
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getBasicSalary(){
		return basicSalary;
	}
	
	public double calculateNetSalary(){
		double hra = 0.10 * basicSalary;
		double da = 0.05 * basicSalary;
		double pf = 0.02 * basicSalary;
		return basicSalary +hra+da-pf;
		
	}
	
	public static void main(String[] args){
		Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1("Robert",30000);
		
		System.out.println("Employee Details:");
		e1.displayEmployee();
		e2.displayEmployee();
	}
	
}