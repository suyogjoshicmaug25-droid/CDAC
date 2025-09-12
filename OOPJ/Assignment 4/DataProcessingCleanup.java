// Problem 21: Data Processing Cleanup
class DataProcessingCleanup{
	public static void main(String[] args){
		try{
			throw new IllegalArgumentException();
		}catch(IllegalArgumentException e){
			System.out.println("Exception occurred: Invalid input");
		}finally{
			System.out.println("Data processing completed");
		}
	}
}

/*
D:\CDAC\OOPJ\Assignment 4>javac DataProcessingCleanup.java
D:\CDAC\OOPJ\Assignment 4>java DataProcessingCleanup
Exception occurred: Invalid input
Data processing completed
*/