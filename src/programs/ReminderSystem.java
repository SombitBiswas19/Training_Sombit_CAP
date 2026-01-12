package programs;

public class ReminderSystem {

	public static void main(String[] args) {
		String day="Sun";
		switch (day) {
		case "Mon","Wed","Thu": {
			System.out.println("Take English Book");
		}
		break;
		case "Tue","Sat": {
			System.out.println("Take Java Book");
		}
		break;
		case "Fri": {
			System.out.println("Take SQL Book");
		}
		break;
		default:
			System.out.println("It is break time");
		}

	}

}
