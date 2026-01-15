package has_a_relationship;

public class Car {
	private int id;
	private String color;
	private String brand;
	private Engine engine;
	
	public void setEngine(Engine engine)
	{
		this.engine=engine;
	}
	
	public Engine getEngine()
	{
		return engine;
	}
	
	public int get_id()
	{
		return id;
	}
	public void set_id(int id)
	{
		this.id=id;
	}
	
	public String get_color()
	{
		return color;
	}
	public void set_color(String color)
	{
		this.color=color;
	}
	
	public String get_brand()
	{
		return brand;
	}
	public void set_brand(String brand)
	{
		this.brand=brand;
	}
}
