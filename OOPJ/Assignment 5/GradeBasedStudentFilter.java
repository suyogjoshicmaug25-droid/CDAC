//Problem 16: Grade-Based Student Filter

import java.util.*;
class GradeBasedStudentFilter{
	public static void main(String[] args){
		
		Map<String,Integer> list = new HashMap<>();
		
		list.put("Amit",85);
		list.put("Priya",52);
		list.put("Rohan",78);
		
		int threshold = 60;
		
		Iterator<Map.Entry<String,Integer>> itr = list.entrySet().iterator();
		
		while(itr.hasNext()){
			Map.Entry<String,Integer> entry = itr.next();
			if(entry.getValue() < threshold){
				itr.remove();
			}
			
		}
		
		System.out.println("Honor Roll: ");
		for(Map.Entry<String,Integer> entry : list.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		

	}
}