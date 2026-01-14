package constructors;

public class Laptop {
	String brand;
	float price;
	
	
	public Laptop(String brand,float price)
	{
		this.brand=brand;
		this.price=price;
	}
	
	public  void compareprice(Laptop laptop)
	{
		if(this.price>laptop.price) // used l1.compareprice means reference of l1 means current object of l1
			//so this.price denotes l1.price means Dell price
			System.out.println(this.brand+" is costly");
		else
			System.out.println(laptop.brand+" is costly");
	}

	public static void main(String[] args) {
		Laptop l1=new Laptop("Dell",90000f);
		Laptop l2=new Laptop("ASUS",183000f);
		l1.compareprice(l2);
	}

}
