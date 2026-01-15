package student_management_system;

public class Student extends Person {
	private int rollnumber;
	private float grade;
	Course course;
	
	public int get_roll()
	{
		return rollnumber;
	}
	public float get_grade()
	{
		return grade;
	}
	public void set_roll(int rollnumber)
	{
		this.rollnumber=rollnumber;
	}
	public void set_grade(float grade)
	{
		this.grade=grade;
	}
	public Course get_course()
	{
		return course;
	}
	public void set_course(Course course)
	{
		this.course=course;
	}
}
