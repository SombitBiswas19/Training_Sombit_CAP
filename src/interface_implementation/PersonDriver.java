package interface_implementation;

public class PersonDriver {
	public static void main(String[] args) {
		//Person p=new Person();
		//Object is creating at runtime
		//p.setV(new Car());
		//p.setV(new Bike());  //Loose coupling Person can choose any type of variable based on mood.
		
		//Vehicle v2=p.getV();
		//v2.type();
		//v2.price();
		
		Vehicle v=HelpVehicle.getVehicle(); // here using helper class we are creating object of Bike
		// here we can't see implementation. It is real abstraction.
		v.type();
		v.price();
	}
}
