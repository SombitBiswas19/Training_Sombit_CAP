package inheritance.hierarchical;

public class Bike extends Vehicle {
	String brand;
	double price;
	
	Bike(String color,String brand,double price)
	{
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	
	public static void main(String[] args) {
		Bike b1=new Bike("Red","Hero Honda",100000.0);
		System.out.println(b1.brand);
		System.out.println(b1.color);
		System.out.println(b1.price);
	}
}
