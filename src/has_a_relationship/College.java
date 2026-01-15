package has_a_relationship;

public class College {
	private String name;
	private String location;
	private Trainer trainer;
	private Student student;
	
	public String get_name_college()
	{
		return name;
	}
	public void set_name_college(String name)
	{
		this.name=name;;
	}
	
	public String get_location()
	{
		return location;
	}
	public void set_location(String location)
	{
		this.location=location;
	}
	public Student get_student_college()
	{
		return student;
	}
	public void set_student_college(Student student)
	{
		this.student=student;
	}
	public Trainer get_trainer()
	{
		return trainer;
	}
	public void set_trainer(Trainer trainer)
	{
		this.trainer=trainer;
	}
}
