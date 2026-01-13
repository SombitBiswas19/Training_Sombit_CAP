package non_static_var;

public class Student {
	int id;
	String name;
	
	public void initialize(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.initialize(10, "XYZ");
	}

}
