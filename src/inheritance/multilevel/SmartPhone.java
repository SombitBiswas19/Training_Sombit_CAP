package inheritance.multilevel;

public class SmartPhone extends Mobile {
	String os;

    SmartPhone(String brand, int battery, String os) {
        this.brand = brand;
        this.battery = battery;
        this.os = os;
    }

    void browseInternet() {
        System.out.println("Browsing internet...");
    }

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Samsung", 5000, "Android");

        // Accessing all levels
        System.out.println("Brand: " + sp.brand);      // from ElectronicDevice
        System.out.println("Battery: " + sp.battery);  // from Mobile
        System.out.println("OS: " + sp.os);             // from SmartPhone

        sp.powerOn();        // level 1
        sp.call();           // level 2
        sp.browseInternet(); // level 3
    }
}
