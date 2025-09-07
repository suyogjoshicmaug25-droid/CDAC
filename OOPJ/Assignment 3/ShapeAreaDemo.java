//27. Shape Area Calculator
interface Shape{
	public void calculateArea();
}
class Circle implements Shape{
	private int radius;
	//Constructor
	public Circle(int radius){
		this.radius = radius;
	}
	@Override
	public void calculateArea(){
		double area = Math.PI * radius * radius;
		System.out.printf("Circle Area = %.1f%n",area);
	}
}
class Rectangle implements Shape{
	private int length,breadth;
	public Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void calculateArea(){
		int area = length*breadth;
		System.out.println("Rectangle Area = "+area);
	}
}
class Square implements Shape{
	private int side;
	public Square(int side){
		this.side = side;
	}
	@Override
	public void calculateArea(){
		int area = side * side;
		System.out.println("Square area = "+area);
	}
}
public class ShapeAreaDemo{
public static void main(String[] args){
	Shape s1 = new Circle(5);
	Shape s2 = new Rectangle(10,5);
	Shape s3 = new Square(4);
	s1.calculateArea();
	s2.calculateArea();
	s3.calculateArea();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac ShapeAreaDemo.java
D:\CDAC\OOPJ\Assignment 3>java ShapeAreaDemo

Circle Area = 78.5
Rectangle Area = 50
Square area = 16
*/