// Problem 22: Student Object Cleanup
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // Overriding the finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student object for " + name + " is being garbage collected.");
    }
}

class StudentObjectCleanup {
    public static void main(String[] args) {
        Student s1 = new Student("Amit");

        // Make the object eligible for GC
        s1 = null;

        // Request JVM to run Garbage Collector
        System.gc();

        // Small delay to give GC time to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
D:\CDAC\OOPJ\Assignment 4>javac StudentObjectCleanup.java
StudentObjectCleanup.java:11: warning: [removal] finalize() in Object has been deprecated and marked for removal
    protected void finalize() throws Throwable {
                   ^
1 warning

D:\CDAC\OOPJ\Assignment 4>java StudentObjectCleanup
Student object for Amit is being garbage collected.
*/