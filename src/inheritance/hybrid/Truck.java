package inheritance.hybrid;

public class Truck extends FourWheeler { 
	int loadCapacity;
    Truck(String fuelType, int loadCapacity) {
        this.fuelType = fuelType;
        this.loadCapacity = loadCapacity;
    }
    public static void main(String[] args) {
        Truck t = new Truck("Diesel", 5000);
        System.out.println("Fuel: " + t.fuelType);
        System.out.println("Wheels: " + t.wheels);
        System.out.println("Load Capacity: " + t.loadCapacity);
        t.start();
        t.drive();
    }
}
