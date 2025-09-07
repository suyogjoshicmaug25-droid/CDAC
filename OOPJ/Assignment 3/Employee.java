//3. Employee Age Validation
class Employee{
	private int age;
	
	//setter method for age
	public void setAge(int age){
		if(age < 18){
			System.out.println("Invalid age");
		}
		else{
			this.age = age;
		}
	}
	
	//getter method for age
	public int getAge(){
		return age;
	}
	
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.setAge(17);
	}
}