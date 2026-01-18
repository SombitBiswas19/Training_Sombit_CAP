package abstraction;

public abstract class Shape {
	public abstract void area();
	public  void display()
	{
		area();
		System.out.println("Showing Display after Area");
	}
	static { //static block;
		
	}
	
	{//non-static block
		
	}
}
