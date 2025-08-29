/*
42. Armstrong Numbers Between 100–500
Scenario: Print all Armstrong numbers between 100 and 500. Output:
153
370
371
407
*/
class ArmstrongNumber1{
	public static void main(String[] args){
		for(int i=100;i <= 500; i++){
			int num=i;
			int num1 = num;
			int remainder,armstrong=0;
			while(num > 0){
				remainder = num % 10;
				armstrong = armstrong + (remainder * remainder * remainder);
				num /= 10;
			}
			if(num1 == armstrong){
				System.out.println(num1);
			}
		}
	}
}
/*
D:\CDAC\OOPJ\Assignment 1>javac ArmstrongNumber1.java
D:\CDAC\OOPJ\Assignment 1>java ArmstrongNumber1
153
370
371
407
*/