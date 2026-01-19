package non_primitive_array;

public class StudentDriver {
	
	public static void main(String[] args) {
		Student[] students=new Student[3];
		
		students[0]=new Student(10,"Somba",95f);
		students[1]=new Student(11,"Dinga",34.6f);
		students[2]=new Student(12,"Dingi",56.9f);
		
		Student s1=students[0];
		
		System.out.println(students[0]);
		System.out.println(s1);
		System.out.println(students);
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].id);
			System.out.println(students[i].name);
		}
		System.out.println("------------");
		for(Student i:students)
		{
			System.out.println(i.id);
			System.out.println(i.name);
		}
		System.out.println("------------");
		Student[] students1=Student.passedstudent(students);
		System.out.println("Passed Students: ");
		for(Student s:students1)
		{
			System.out.println(s.id);
			System.out.println(s.name);
		}
	}
}
