package constructors;

public class Product {
	int id;
	String name;
	float price;
	float rating;
	
	public Product(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public Product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public Product(int id,String name,float price,float rating)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.rating=rating;
	}
	
	public void displayProduct(int id,String name)
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	public void displayProduct(int id,String name,float price)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}
	
	public void displayProduct(int id,String name,float price,float rating)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(rating);
	}

	public static void main(String[] args) {
		Product p1=new Product(1,"Aloo");
		Product p2=new Product(1,"Aloo",20.5f);
		Product p3=new Product(1,"Aloo",20.5f,5);
		p1.displayProduct(p1.id,p1.name);
		p2.displayProduct(p2.id,p2.name,p2.price);
		p3.displayProduct(p3.id,p3.name,p3.price,p3.rating);
	}

}
