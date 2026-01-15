package inheritance.supercall_statement;

public class Student extends Human {
	float percentage;
	public Student(String name,int age,char gender,float percentage)
	{
		super(name,age,gender);
		this.percentage=percentage;
	}
	public static void main(String[] args) {
		Student s=new Student("Sombi",21,'M',80.5f);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.gender);
		System.out.println(s.percentage);
	}
}
