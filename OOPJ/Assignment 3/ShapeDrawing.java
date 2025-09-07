//13. Shape Drawing
abstract class Shape{
	abstract public void draw();
}
class Circle extends Shape{
	private int radius;
	//Constructor
	public Circle(int radius){
		this.radius = radius;
	}
	@Override
	public void draw(){
		System.out.println("Drawing Circle of radius "+radius);
	}
}
class Rectangle extends Shape{
	private int length,breadth;
	
	public Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void draw(){
		System.out.println("Drawing rectangle of length "+length+" and breadth "+breadth);
	}
}

public class ShapeDrawing{
	public static void main(String[] args){
		Shape s1 = new Circle(7);
		s1.draw();
		
		Shape s2 = new Rectangle(5,10);
		s2.draw();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac ShapeDrawing.java
D:\CDAC\OOPJ\Assignment 3>java ShapeDrawing

Drawing Circle of radius 7
Drawing rectangle of length 5 and breadth 10
*/