package non_primitive_typecasting;

public class Helper {
	public static void main(String[] args) {
		Bike b=new Bike();
		System.out.println(b instanceof Bike);  //true reference variable is object of Bike
		System.out.println(b instanceof Vehicle); //Child is object of Parent ->true
		
		Vehicle v=new Vehicle();
		System.out.println(v instanceof Bike); //Parent is object of Child ->false
		
		Vehicle v2=new Bike(); //Upcasting
		System.out.println(v2 instanceof Bike); //After upcasting it is true
		
		//System.out.println(b instanceof Train); //CTE
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Incompatible conditional operand types Bike and Train
		
		getVehicle(b); //Upcasting
		
		getVehicle(new Train()); //Upcasting
	}
	
	public static void getVehicle(Vehicle v)
	{
		if(v instanceof Car)
		{
			//Downcasting for using child member
			Car c=(Car)v;
			c.Number_of_passenger();
		}
		else if(v instanceof Bike)
		{
			//Downcasting for using child member
			Bike b=(Bike)v;
			b.Top_speed();;
		}
		else if(v instanceof Train)
		{
			//Downcasting for using child member
			Train t=(Train)v;
			t.Ticket_price();;
		}
	}
}
