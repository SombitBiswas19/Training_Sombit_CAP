package this_keyword;


public class Student {
	int id=100;
	String name;
	
	public void initialize(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void m1()
	{
		int id=10;
		System.out.println(id);//local
		System.out.println(this.id);//Non static
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
	}


	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		s.initialize(200, "XYZ");
		s.display();
		s.m1();
	}

}
