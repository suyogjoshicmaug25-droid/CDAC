// Problem 20: Even Roll Number Filter

import java.util.*;

class EvenRollNumberFilter{
	public static void main(String[] args){
		
		LinkedList<Integer> list = new LinkedList<>();
		
		int [] roll_nos = {101,102,103,104};
		
		for(int a: roll_nos){
			if(a % 2 == 0)
				list.add(a);
		}
		System.out.println("Even Roll Numbers: "+list);
	}
}