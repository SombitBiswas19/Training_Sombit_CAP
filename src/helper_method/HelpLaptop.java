package helper_method;

public class HelpLaptop {
	
	public static Laptop getLaptop()
	{
		Laptop l=new Laptop();
		return l;
	}
	
	public static Laptop getLaptopwithdata(String brand,float price)
	{
		Laptop l=new Laptop(brand,price);
		return l;
	}
	
	public static Laptop getLaptopwithdata()
	{
		Laptop l=new Laptop();
		return l;
	}
	
	public static Laptop getLaptopByVerifyingPrice(String brand,float price)
	{
		if(price<10000 || price>500000)
		{
			return null;
		}
		else
		{
			Laptop l=new Laptop(brand,price);
			return l;
		}
	}

}
