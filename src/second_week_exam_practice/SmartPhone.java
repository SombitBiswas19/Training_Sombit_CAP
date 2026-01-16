package second_week_exam_practice;

public class SmartPhone extends Mobile {
	String os;

    SmartPhone(String brand, int battery, String os) {
        super(brand,battery);
        this.os = os;
    }

    void browseInternet() {
        System.out.println("Browsing internet...");
    }
}
