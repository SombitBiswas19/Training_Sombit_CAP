package helper_method;


public class Laptop {
	String brand;
	float price;
	
	public Laptop()
	{
	}
	
	public Laptop(String brand,float price)
	{
		this.brand=brand;
		this.price=price;
	}
	
	public  void compareprice(Laptop laptop)
	{
		if(this.price>laptop.price)
			System.out.println(this.brand+" is costly");
		else
			System.out.println(laptop.brand+" is costly");
	}

	public static void main(String[] args) {
		
		/*Laptop l1=HelpLaptop.getLaptop();  //Using helper method
		l1.brand="HP";
		l1.price=45000f;
		Laptop l2=HelpLaptop.getLaptop();  //Using helper method
		l1.brand="ASUS";
		l1.price=183000f;
		l1.compareprice(l2);*/
		
		/*String brand1="HP"; 
		 float price1=67000f; 
		 Laptop l1=HelpLaptop.getLaptopwithdata(brand1, price1);  //Using helper method
		 */
		
		/*String brand2="ASUS";
		  float price2=183000f;
		  Laptop l2=HelpLaptop.getLaptopwithdata(); 
		  l1.compareprice(l2);
		 */
		
		String brand1="HP";
		float price1=0f;
		Laptop l1=HelpLaptop.getLaptopByVerifyingPrice(brand1, price1);  //Using helper method
		System.out.println(l1==null);
		
		//Laptop l3; -> local non-primitive variable-> without initialization we cannot use.
		//System.out.println(l3); //without initializing we cannot use local variable because this is local to main.
		
		
	}

}
