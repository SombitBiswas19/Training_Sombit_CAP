package inheritance.hierarchical;

public class Car extends Vehicle {
	String brand;
	double price;
	
	Car(String color,String brand,double price)
	{
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	
	public static void main(String[] args) {
		Car c1=new Car("Black","Thar",1500000.0);
		System.out.println(c1.brand);
		System.out.println(c1.color);
		System.out.println(c1.price);
	}
}
