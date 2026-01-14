package inheritance.hybrid;

public class Car extends FourWheeler {
	String brand;
    Car(String fuelType, String brand) {
        this.fuelType = fuelType;
        this.brand = brand;
    }
    public static void main(String[] args) {
        Car c = new Car("Petrol", "Honda");
        System.out.println("Fuel: " + c.fuelType);
        System.out.println("Wheels: " + c.wheels);
        System.out.println("Brand: " + c.brand);
        c.start();
        c.drive();
    }
}
