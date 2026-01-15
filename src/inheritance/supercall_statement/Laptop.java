package inheritance.supercall_statement;

public class Laptop extends Product {
	double price;
	String processor;
	
	public Laptop(String brand,double price,String processor){
		super(brand);
		this.price=price;
		this.processor=processor;
	}
	public static void main(String[] args) {
		Laptop l=new Laptop("HP",87000.0,"Ryzen");
		System.out.println(l.brand);
		System.out.println(l.price);
		System.out.println(l.processor);
	}
}
