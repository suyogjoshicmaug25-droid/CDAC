import java.util.*;

class Student {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public String getGrade() {
        return grade;
    }
}

public class GradeBasedFilter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amit", "A"));
        students.add(new Student("Priya", "C"));
        students.add(new Student("Rohan", "B"));

        // Filter students with grade <= "B" (A and B are acceptable)
        List<Student> qualified = new ArrayList<>();
        for (Student s : students) {
            if (s.getGrade().compareTo("B") <= 0) { 
                qualified.add(s);
            }
        }

        // Display results
        System.out.println("Qualified Students:");
        for (Student s : qualified) {
            System.out.println(s.getName() + ":" + s.getGrade());
        }
    }
}
