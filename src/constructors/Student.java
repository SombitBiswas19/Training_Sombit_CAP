package constructors;
//Constructor Chaining 
public class Student {
	int id;
	String name;
	long phone;
	
	public Student(int id)
	{
		this.id=id;
	}
	public Student(int id,String name)
	{
		this(id);
		this.name=name;
	}
	public Student(int id,String name,long phone)
	{
		this(id,name);
		this.phone=phone;
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(phone);
		System.out.println("-------------");
		
	}

	public static void main(String[] args) {
		Student p=new Student(1);
		p.display();
		Student p1=new Student(1,"Sombit");
		p1.display();
		Student p2=new Student(1,"Sombit",8420077098l);
		p2.display();
		

	}
}
