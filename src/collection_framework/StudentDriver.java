package collection_framework;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayList<Student> student=new ArrayList<Student>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of students you want to add: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the id of student "+i+1+" :");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name of student "+i+1+" :");
			String name=sc.nextLine();
			System.out.println("Enter the marks of student "+i+1+" :");
			double marks=sc.nextDouble();
			student.add(new Student(id,name,marks));
		}
		
		Student.display_students(student);
		int count=Student.count_passed_students(student, 40);
		System.out.println("Count of passed students: "+count);
		ArrayList<Student> passed_student=Student.display_passed_students(student, 40);
		if(count>0)
			Student.display_students(passed_student);
		else
			System.out.println("No Passed Student Available.");
		Student.display_students_highest_marks(student);
		Student.search_by_name(student, "Somba");
		
		Collections.sort(student, new SortStudentById());
		//Lambda Expression
		Collections.sort(student,(s1,s2)->s1.id-s2.id);
		System.out.println(student);
		
		sc.close();
	}
	
	
}
