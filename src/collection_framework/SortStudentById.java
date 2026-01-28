package collection_framework;
import java.util.Comparator;
public class SortStudentById implements Comparator<Student> {
	@Override
	public int compare(Student s1,Student s2)
	{
		return s1.id-s2.id;// ascndig
		//return e1.name.compareTo(e2.name); //asc
	}
	
}
