// Recent Research History

import java.util.*;
class RecentResearchHistory{
	public static void main(String[] args){
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("DSA");
		list.add("OOP");
		list.add("Spring");
		
		if(list.size() > 5){
			list.poll();
		}
		
		System.out.println(list);
		
	}
}