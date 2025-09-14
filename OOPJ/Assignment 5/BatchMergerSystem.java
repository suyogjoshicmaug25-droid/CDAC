// Problem 18: Batch Merger System 

import java.util.*;
class BatchMergerSystem{
	public static void main(String[] args){
		
		HashSet<String> list1 = new HashSet<>();
		list1.add("Amit");
		list1.add("Priya");
		
		System.out.println("Morning Batch : "+list1);
		
		HashSet<String> list2 = new HashSet<>();
		list2.add("Rohan");
		list2.add("Priya");
		
		System.out.println("Evening Batch : "+list2);
		
		list1.addAll(list2);
		System.out.println("Combined Batches: "+list1);
		
	}
}