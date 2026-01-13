package constructors;

public class ConstructorChaining {
	
	public ConstructorChaining()
	{
		System.out.println("C1");
	}
	
	public ConstructorChaining(int a)
	{
		this(); // Constructor chaining
		System.out.println("C2");
	}

	public static void main(String[] args) {
		ConstructorChaining e=new ConstructorChaining(20);
	}

}
