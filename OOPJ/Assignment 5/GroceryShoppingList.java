// Problem 4: Grocery Shopping List

import java.util.*;
class GroceryShoppingList{
	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Milk");
		list.add("Eggs");
		list.add("Bread");
		
		System.out.println("Grocery List: "+list);
		
		System.out.print("Purchase: ");
		Scanner sc = new Scanner(System.in);
		String purchase = sc.nextLine();
		
		if(list.remove(purchase)){
			System.out.println("Item "+purchase+" purchased and removed from list.");
		}else{
			System.out.println("Item not found in the grocery list");
		}
		
		System.out.println("Items to buy: "+list);
		
	}
}

/*
D:\CDAC\OOPJ\Assignment 5>javac GroceryShoppingList.java

D:\CDAC\OOPJ\Assignment 5>java GroceryShoppingList
Grocery List: [Milk, Eggs, Bread]
Purchase: Milk
Item Milk purchased and removed from list.
Items to buy: [Eggs, Bread]
*/