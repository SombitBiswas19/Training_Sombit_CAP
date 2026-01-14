package encapsulation;

public class MobilePhone {
	private int batteryLevel;

	public void chargePhone(int charge) {
		if (charge > 0 && batteryLevel + charge <= 100) {
			batteryLevel += charge;
		}
		else
			System.out.println("Can't Charge");
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}
}
