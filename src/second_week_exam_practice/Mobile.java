package second_week_exam_practice;

public class Mobile extends ElectronicDevice {
	int battery;
	
	Mobile(String brand,int battery)
	{
		super(brand);
		this.battery=battery;
	}

    void call() {
        System.out.println("Calling...");
    }
}
