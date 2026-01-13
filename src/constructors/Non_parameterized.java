package constructors;

public class Non_parameterized {
	int id;
	String name;
	
	public Non_parameterized()
	{
		System.out.println("Non Parameterized Constructor");
	}
	public Non_parameterized(int id, String name)
	{
		System.out.println("Parameterized Constructor");
		this.id=id;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		//Constructor Overloading
		Non_parameterized s1=new Non_parameterized();
		s1.display();
		Non_parameterized s2=new Non_parameterized(10,"Raju");
		s2.display();

	}

}
