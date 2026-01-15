package student_management_system;

public class Course {
	private int course_id;
	private String course_name;
	
	public int get_courseid()
	{
		return course_id;
	}
	public String getcoursename()
	{
		return course_name;
	}
	public void set_courseid(int course_id)
	{
		this.course_id=course_id;
	}
	public void setcoursename(String course_name)
	{
		this.course_name=course_name;
	}
}
