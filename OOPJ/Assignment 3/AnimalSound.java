//9. Animal Sound
class Animal{
	public void makeSound(){
		System.out.println("The animal makes a sound");
	}
}
class Dog extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Dog -> Bark");
	}
}
class Cat extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Cat -> Meow");
	}
}
public class AnimalSound{
	public static void main(String[] args){
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.makeSound();
		cat.makeSound();
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac AnimalSound.java
D:\CDAC\OOPJ\Assignment 3>java AnimalSound

Dog -> Bark
Cat -> Meow
*/