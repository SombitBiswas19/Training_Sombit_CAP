package constructors;

public class ProductConstChaining {
	int id;
	String name;
	float price;
	
	public ProductConstChaining(int id)
	{
		this.id=id;
	}
	public ProductConstChaining(int id,String name)
	{
		this(id);
		this.name=name;
	}
	public ProductConstChaining(int id,String name,float price)
	{
		this(id,name);
		this.price=price;
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}

	public static void main(String[] args) {
		ProductConstChaining p=new ProductConstChaining(11,"XYZ",7856.9f);
		p.display();

	}

}
