// Problem 28: Department Employee Mapping 

import java.util.*;

class  DepartmentEmployeeMapping  {
    public static void main(String[] args) {
        Map<String, List<String>> deptMap = new HashMap<>();

        // Directly put departments and employees
        deptMap.put("IT", Arrays.asList("Amit", "Rohan"));
        deptMap.put("HR", Arrays.asList("Priya"));

        System.out.println("Department Structure:");
        
	Iterator<Map.Entry<String, List<String>>> itr = deptMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, List<String>> entry = itr.next();
            
			String dept = entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println(dept + ": " + String.join(", ", employees));
        }
    }
}
/*
D:\CDAC\OOPJ\Assignment 5>javac DepartmentEmployeeMapping.java
D:\CDAC\OOPJ\Assignment 5>java DepartmentEmployeeMapping

Department Structure:
HR: Priya
IT: Amit, Rohan
*/