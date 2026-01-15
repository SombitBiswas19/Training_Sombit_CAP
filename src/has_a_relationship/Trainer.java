package has_a_relationship;

public class Trainer {
	private String name;
	private String subject;
	private Student student;
	
	public String get_name()
	{
		return name;
	}
	public void set_name(String name)
	{
		this.name=name;;
	}
	
	public String get_subject()
	{
		return subject;
	}
	public void set_subject(String subject)
	{
		this.subject=subject;
	}
	public Student get_student_trainer()
	{
		return student;
	}
	public void set_student_trainer(Student student)
	{
		this.student=student;
	}
	
}
