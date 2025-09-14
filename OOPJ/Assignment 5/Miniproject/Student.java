package student;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private String dept;
    private double cgpa;

    public Student(int rollNo, String name, String dept, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dept=" + dept + ", cgpa=" + cgpa + "]";
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return rollNo == other.rollNo;
    }

    @Override
    public int compareTo(Student other) {
        if (this.cgpa > other.cgpa) {
            return -1;
        } else if (this.cgpa < other.cgpa) {
            return 1;
        } else {
            return Integer.compare(this.rollNo, other.rollNo);
        }
    }
}
