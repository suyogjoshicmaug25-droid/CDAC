/*
Problem 1: Counter for Cups
Scenario: You are keeping track of how many cups of tea are prepared in your home.
Requirements:
1. Create a class TeaCup with instance variable: teaType (String).
2. Create a static variable totalCups to count all cups created.
3. Constructor should initialize teaType and increment totalCups.
4. Create getter for teaType.
5. Create a static method showTotalCups() to print total cups.
Input Example:
Cup1: teaType = "Masala Tea"
Cup2: teaType = "Green Tea"
Cup3: teaType = "Ginger Tea"
Expected Output:
Cup1 type: Masala Tea
Cup2 type: Green Tea
Cup3 type: Ginger Tea
Total cups made: 3
*/
class TeaCup{
	private String teaType; //instance variable
	static private int totalCups = 0; //static variable
	
	//Constructor
	TeaCup(String teaType){
		this.teaType = teaType;
		totalCups++;
	}
	
	//getter method
	String getTeaType(){
		return teaType;
	}
	// static method showTotalCups
	static void showTotalCups(){
		System.out.println("Total cups made: "+totalCups);
	} 
	
	public static void main(String[] args){
		
		TeaCup cup1 = new TeaCup("Masala Tea");
		TeaCup cup2 = new TeaCup("Green Tea");
		TeaCup cup3 = new TeaCup("Ginger Tea");
		
		System.out.println("Cup1 type: "+cup1.teaType);
		System.out.println("Cup2 type: "+cup2.teaType);
		System.out.println("Cup3 type: "+cup3.teaType);
		
		showTotalCups();
	}
}
/*
D:\CDAC\OOPJ\Assignment 2>javac TeaCup.java
D:\CDAC\OOPJ\Assignment 2>java TeaCup
Cup1 type: Masala Tea
Cup2 type: Green Tea
Cup3 type: Ginger Tea
Total cups made: 3
*/