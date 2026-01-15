package student_management_system;

public class StudentCourse {
	
	public static void showStudentCourseDetails(Student s)
	{
		System.out.println(s.get_age());
		System.out.println(s.get_grade());
		System.out.println(s.get_name());
		System.out.println(s.get_roll());
		System.out.println(s.get_course().get_courseid());
		System.out.println(s.get_course().getcoursename());
		
	}
	public static void main(String[] args) {
		Course c=new Course();
		c.set_courseid(1);
		c.setcoursename("java");
		
		Student s=new Student();
		s.set_age(21);
		s.set_name("Sombit");
		s.set_roll(12);
		s.set_grade(4.5f);
		s.set_course(c);
		
		showStudentCourseDetails(s);
	}
}
