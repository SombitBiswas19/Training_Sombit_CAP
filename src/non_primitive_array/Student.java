package non_primitive_array;

public class Student {
	int id;
	String name;
	float marks;
	
	public Student(int id,String name,float marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public static Student[] passedstudent(Student[] students)
	{
		int count=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].marks>=35) {
				count++;}
		}
		Student[] newstudent=new Student[count];
		int j=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].marks>=35) {
				newstudent[j]=students[i];
			    j++;}
		}
		return newstudent;
	}
	
}
