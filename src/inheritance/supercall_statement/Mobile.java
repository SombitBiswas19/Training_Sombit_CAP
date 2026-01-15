package inheritance.supercall_statement;

public class Mobile extends Product {
	double price;
	String Sim;
	
	public Mobile(String brand,double price,String Sim)
	{
		super(brand);
		this.price=price;
		this.Sim=Sim;
	}
	
	public static void main(String[] args) {
		Mobile m=new Mobile("Redmi",18000.0,"Airtel");
		System.out.println(m.brand);
		System.out.println(m.price);
		System.out.println(m.Sim);
	}
}
