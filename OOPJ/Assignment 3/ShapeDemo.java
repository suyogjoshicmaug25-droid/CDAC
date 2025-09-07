abstract class Shape{
	abstract void area(); //abstract method
}
class Rectangle extends Shape{
	private int length;
	private int breadth;
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void area(){
		System.out.println("Rectangle Area = "+length*breadth);
	}
}
class Circle extends Shape{
	private double radius;
	Circle(double radius){
		if (radius <= 0) throw new IllegalArgumentException("Radius must be positive");
		this.radius = radius;
	}
	@Override
	public void area(){
		System.out.printf("Circle Area = %.2f%n",Math.PI * radius*radius);
	}
}
public class ShapeDemo{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(5,6);
		r1.area();
		
		Circle c1 = new Circle(10.5);
		c1.area();
		
		Shape s1 = new Rectangle(7,6);
		s1.area();
		
		Shape s2 = new Circle(6);
		s2.area();
	}	
}