// Problem 15: Library Book Inventory 

import java.util.*;
class LibraryBookInventory{
	
	public static void borrow(Map<String,Integer> inventory, String bookTitle){
		if(inventory.containsKey(bookTitle)){
			int copies = inventory.get(bookTitle);
			if(copies > 0){
				inventory.put(bookTitle,copies-1);
				System.out.println("borrowed 1 copy of "+bookTitle);
			}else{
				System.out.println("Sorry, no copies left of "+bookTitle);
			}
		}else{
			System.out.println("Book not found in the inventory "+bookTitle);
		}
	}
	
	public static void main(String[] args){
		
		Map<String,Integer> inventory =  new HashMap<>();
		
		inventory.put("Java",3);
		inventory.put("Python",5);
		
		System.out.println(inventory);
		
		//Borrow a Java book
		borrow(inventory,"Java");
		
		System.out.println("Current Inventory: " + inventory);
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac LibraryBookInventory.java
D:\CDAC\OOPJ\Assignment 5>java LibraryBookInventory

{Java=3, Python=5}
borrowed 1 copy of Java
Current Inventory: {Java=2, Python=5}
*/