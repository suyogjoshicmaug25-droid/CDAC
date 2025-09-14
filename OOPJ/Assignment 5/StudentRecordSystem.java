// Problem 29: Student Record System 

import java.util.*;

class Student {
    private String name;
    private String grade;

    // Constructor
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getGrade() {
        return grade;
    }
}

class StudentRecordSystem {
    public static void main(String[] args) {
        // Store student records
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amit", "A"));
        students.add(new Student("Priya", "B"));

        // Display student records
        System.out.println("Student Records:");
        for (Student s : students) {
            System.out.println(s.getName() + ":" + s.getGrade());
        }
    }
}
