package student;
import java.util.Comparator;
public class RollNumComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1,Student s2) {
		return Integer.compare(s1.getRollNo(),s2.getRollNo()); // roll nums
	}
}


