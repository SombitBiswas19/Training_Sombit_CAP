package inheritance;

public class Vehicle {
	String brand;
	String color;
	double price;

	public static void main(String[] args) {
		Bike b = new Bike("BMW", "black", 150);
		b.printVehicle();
		Vehicle v= new Vehicle();
		v.printVehicle();
	}

	public void printVehicle() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}

}

class Bike extends Vehicle {
	
	Bike(String brand, String color, double price) { //Child class through constructor initializing the value
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

}
