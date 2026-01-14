package inheritance;

public class Apple extends Fruit {
	double price;
	
	Apple(String color,String name,double price)
	{
		this.color=color;
		this.name=name;
		this.price=price;
	}
	
	public static void main(String[] args) {
		Apple a=new Apple("Lal","Kashmiri Apple",240.55);
		System.out.println(a.color);
		System.out.println(a.name);
		System.out.println(a.price);
		Fruit f=new Fruit("Red","Apple");
		System.out.println(f.color);
		System.out.println(f.name);
		//System.out.println(f.price); // By using parent reference we can only use the parent members-> Compile Time Error
	}
}
