package interface_implementation;

public class HelpVehicle {
	//Helper  to create implementation/child object of Vehicle
	public static Vehicle getVehicle()
	{
		//Creating implementation/child object
		return new Bike(); //upcasting
	}
}
