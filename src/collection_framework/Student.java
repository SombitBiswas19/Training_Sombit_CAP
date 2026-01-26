package collection_framework;
import java.util.ArrayList;

public class Student {
	int id;
	String name;
	double marks;
	public Student(int id, String name,double marks) {
		this.id = id;
		this.name = name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public static void display_students(ArrayList<Student> s)
	{
		System.out.println("Student Details: ");
		for(int i=0;i<s.size();i++)
		{
			System.out.println("Id: "+s.get(i).id);
			System.out.println("Name: "+s.get(i).name);
			System.out.println("Marks: "+s.get(i).marks);
			System.out.println("---------");
		}
	}
	public static ArrayList<Student> display_passed_students(ArrayList<Student> s,int passing_marks)
	{
		ArrayList<Student> s_temp= new ArrayList<Student>();
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).marks>=passing_marks)
			{
				s_temp.add(s.get(i));
			}
		}
		return s_temp;
	}
	public static void display_students_highest_marks(ArrayList<Student> s)
	{
		System.out.println("Highest Mark Student Details: ");
		double marks=s.get(0).marks;
		int index=0;
		for(int i=0;i<s.size();i++)
		{
			if(marks<s.get(i).marks)
			{
				marks=s.get(i).marks;
				index=i;
			}
		}
		System.out.println("Id: "+s.get(index).id);
		System.out.println("Name: "+s.get(index).name);
		System.out.println("Marks: "+s.get(index).marks);
		System.out.println("---------");
	}
	public static void search_by_name(ArrayList<Student> s,String name)
	{
		
		int index=-1;
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).name.equalsIgnoreCase(name))
			{
				index=i;
				break;
			}
		}
		if(index!=-1)
		{
			System.out.println(" Student found: ");
			System.out.println("Id: "+s.get(index).id);
			System.out.println("Name: "+s.get(index).name);
			System.out.println("Marks: "+s.get(index).marks);
			System.out.println("---------");
		}
		else {
			System.out.println("Student not found.");
		}
	}
	
	public static int count_passed_students(ArrayList<Student> s,int passing_marks)
	{
		int count=0;
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).marks>=passing_marks)
			{
				count++;
			}
		}
		return count;
	}

}
