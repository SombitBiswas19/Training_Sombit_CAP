package constructors;

public class Laptop {
	String brand;
	float price;
	
	public Laptop() {
        this.brand = "ASUS";
        this.price = 183000f;
    }
	
	public Laptop(String brand,float price)
	{
		this.brand=brand;
		this.price=price;
	}
	
	public  void compareprice(float price1)
	{
		if(price1>this.price)
			System.out.println(price1);
		else
			System.out.println(this.price);
	}

	public static void main(String[] args) {
		Laptop l1=new Laptop("Dell",90000f);
		Laptop l2=new Laptop();
		l1.compareprice(l2.price);
	}

}
