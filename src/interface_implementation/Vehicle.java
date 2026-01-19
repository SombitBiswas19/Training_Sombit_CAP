package interface_implementation;

public interface Vehicle {
	void price();
	void type();
}

class Bike implements Vehicle{
	@Override
	public void price()
	{
		System.out.println(200000);
	}
	@Override
	public void type()
	{
		System.out.println("petrol");
	}
}
class Car implements Vehicle{
	@Override
	public void price()
	{
		System.out.println(3000000);
	}
	@Override
	public void type()
	{
		System.out.println("Electric");
	}
}