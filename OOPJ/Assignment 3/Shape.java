abstract class Shape{
	abstract void area(); //abstract method
}
class Rectangle extends Shape{
	int length,breadth;
	public int shape(){
		return length * breadth;
	}
}
class Circle extends Shape{
	double radius;
	public double shape(){
		return (Math.PI * radius*radius);
	}
}
public class ShapeDemo{
	
}