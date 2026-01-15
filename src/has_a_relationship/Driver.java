package has_a_relationship;

public class Driver {
	public static void getStudent(Student s)
	{
		System.out.println("-------STUDENT--------");
		System.out.println(s.get_id());
		System.out.println(s.get_name());
		System.out.println("----------------------");
	}
	public static void getTrainer(Trainer t)
	{
		System.out.println("--------TRAINER-------");
		System.out.println(t.get_name());
		System.out.println(t.get_subject());
		System.out.println(t.get_student_trainer().get_id());
		System.out.println(t.get_student_trainer().get_name());
		System.out.println("----------------------");
	}
	public static void getCollege(College c)
	{
		System.out.println("--------COLLEGE-------");
		System.out.println(c.get_name_college());
		System.out.println(c.get_location());
		System.out.println(c.get_student_college().get_id());
		System.out.println(c.get_student_college().get_name());
		System.out.println(c.get_trainer().get_name());
		System.out.println(c.get_trainer().get_subject());
		System.out.println(c.get_trainer().get_student_trainer().get_id());
		System.out.println(c.get_trainer().get_student_trainer().get_name());
		System.out.println("----------------------");
	}
	public static void main(String[] args) {
		Engine en=new Engine();
		en.set_cc(5000);
		en.set_type("Petrol");
		
		Car c1=new Car();
		
		c1.set_color("Red");
		c1.set_id(1);
		c1.set_brand("Thar");
		c1.setEngine(en);
		
		Engine e2=c1.getEngine();
		
		System.out.println(c1.get_id());
		System.out.println(c1.get_color());
		System.out.println(c1.get_brand());
		System.out.println(c1.getEngine().get_cc());
		System.out.println(c1.getEngine().get_type());
		System.out.println(e2.get_cc());
		System.out.println(e2.get_type()); 
		
		System.out.println("----------------------");
		Student s=new Student();
		s.set_id(1);
		s.set_name("Sombit");
		
		Trainer t=new Trainer();
		t.set_name("Sandeep Sir");
		t.set_subject("Java");
		t.set_student_trainer(s);
		
		College c=new College();
		c.set_name_college("IEM");
		c.set_location("Kolkata");
		c.set_student_college(s);
		c.set_trainer(t);
		
		getStudent(s);
		getTrainer(t);
		getCollege(c);

	}

}
