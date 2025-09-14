package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Amit","CS",8.5);
        Student s2 = new Student(102,"Priya","Math",9.2);
        Student s3 = new Student(103,"Rohan","CS",7.8);
        Student s4 = new Student(104,"Sneha","Physics",4.5);

        // Step 1 : Registration List(ArrayList)
        List<Student> registrationList = new ArrayList<>();
        registrationList.add(s1);
        registrationList.add(s2);
        registrationList.add(s3);
        registrationList.add(s4);

        System.out.println("Registration Order:");
        for(Student s: registrationList) {
            System.out.print(s.getName()+" ");
        }
        System.out.println("\n");

        // Step 2: Merit List (Comparable - sort by CGPA descending)
        List<Student> meritList = new ArrayList<>(registrationList);
        Collections.sort(meritList);

        System.out.println("Merit List:");
        for (Student s : meritList) {
            System.out.print(s.getName() + " "+s.getCgpa()+"  ");
        }
        System.out.println("\n");
        
        //Step 3: Alphabetical List 
        List<Student> alphabeticalList = new ArrayList<>(registrationList);
        Collections.sort(alphabeticalList,new NameComparator());
        
        System.out.println("Alphabetical List: ");
        for(Student s: alphabeticalList) {
        	System.out.println(s.getName()+"  ");
        }
        System.out.println("\n");
        
        //  Unique Names - HashSet<String> 
        HashSet<Student> uniqueNames = new HashSet<>(registrationList);
        System.out.println("Unique List: ");
        for(Student s: uniqueNames) {
        	System.out.print(s.getName()+"  ");
        }
        System.out.println("\n");
        
        // Roll Number Sorting - TreeSet<Student> 
        TreeSet<Student> rollNoSet = new TreeSet<>(Comparator.comparingInt(Student::getRollNo));
        rollNoSet.addAll(registrationList);
        
        System.out.println("Sorted List by Roll Numbers: ");
        for(Student s: rollNoSet) {
        	System.out.println(s.getRollNo()+" : "+s.getName());
        }
        System.out.println("\n");
        
        // Department Grouping (HashMap<String,List<Student>>)
        HashMap<String,List<Student>> deptGroups = new HashMap();
        
        for(Student s: registrationList) {
        	//If department key not present,create new list
        	deptGroups.putIfAbsent(s.getDept(),new ArrayList<>());
        	//Add students to that department list
        	deptGroups.get(s.getDept()).add(s);
        	
        }
        
        System.out.println("Department Groups: ");
        for(String dept: deptGroups.keySet()) {
        	System.out.print(dept+" : ");
        	for(Student s: deptGroups.get(dept)) {
        		System.out.print(s.getName()+" ");
        	}
        	System.out.println();
        }
        
     // Step 7: Performance Filter (Iterator - remove students with CGPA < 5.0)
        List<Student> filteredList = new ArrayList<>(registrationList);

        Iterator<Student> itr = filteredList.iterator();
        while (itr.hasNext()) {
            Student s = itr.next();
            if (s.getCgpa() < 5.0) {
                itr.remove();  // Safe removal using Iterator
            }
        }

        System.out.println("After Filter (CGPA >= 5.0):");
        for (Student s : filteredList) {
            System.out.print(s.getName() + " ");
        }
        System.out.println("\n");
        
        
     // Step 8: Recent Registrations - Stack<Student>
        Stack<Student> recentRegistration = new Stack<>();

        // Add all registered students into the stack (instead of re-adding one by one)
        recentRegistration.addAll(registrationList);
        
        System.out.println("Recent Registrations: ");
        for(Student s: recentRegistration) {
        	System.out.print(s.getName()+"  ");
        }
        System.out.println("\n");
        //9. Scholarship Queue - Queue<Student> 
        Queue<Student> scholarshipQueue = new LinkedList<>(registrationList);
        
        System.out.println("Scholarship List: ");
        for(Student s: scholarshipQueue) {
        	System.out.print(s.getName()+"  ");
        }
        System.out.println("\n");
        
        //Step 10: Hostel Applications - LinkedList<Integer>
        LinkedList<Integer> hostelQueue = new LinkedList<>();
        
        hostelQueue.addLast(105);
        System.out.println("Add regular(105): "+hostelQueue);
        
        //Add a regular applicant (roll no 101)
        hostelQueue.addFirst(101);
        System.out.println("Add priority(101): "+hostelQueue);
        
        //Remove from front (allocation to priority applicant first)
        hostelQueue.removeFirst();
        System.out.println("Remove front: "+hostelQueue);
        
        
        
    }
}
