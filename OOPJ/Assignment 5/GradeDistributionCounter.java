// Problem 17: Grade Distribution Counter

import java.util.*;

class GradeDistributionCounter {
    public static void main(String[] args) {

        Map<String,Integer> gradeCount = new HashMap<>();

        String[] grades = {"A", "B", "A", "C", "B", "A"};

        // Count occurrences of each grade
        for (String grade : grades) {
            gradeCount.put(grade, gradeCount.getOrDefault(grade, 0) + 1);
        }

        // Display grade distribution
        System.out.println("Grade Distribution:");
        for (Map.Entry<String, Integer> entry : gradeCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
/*
D:\CDAC\OOPJ\Assignment 5>javac GradeDistributionCounter.java
D:\CDAC\OOPJ\Assignment 5>java GradeDistributionCounter

Grade Distribution:
A : 3
B : 2
C : 1
*/