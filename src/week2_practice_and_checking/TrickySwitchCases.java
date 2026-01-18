package week2_practice_and_checking;

public class TrickySwitchCases {

	public static void main(String[] args) {
		int x = 2;
        //We an write default anywhere
		switch (x) {
		    default:
		        System.out.print("D ");
		    case 1:
		        System.out.print("1 ");
		    case 2:
		        System.out.println("2 ");
		}
		
		System.out.println("------------------");
		
		//What happens if no case matches and there is no default?-> Nothing will run.
		int x1 = 6;

		switch (x1) {
		    case 1:
		        System.out.print("1 ");
		    case 2:
		        System.out.println("2 ");
		}
		
		System.out.println("------------------");
		//Fall through occurs
		int x2 = 1;
		
		switch (x2) {
		case 1:
			System.out.print("1 ");
		case 2:
			System.out.print("2 ");
		default:
	        System.out.println("D ");	
		}
		System.out.println("------------------");
		//Switch case without any case and with default value
		int x3 = 1;
		
		switch (x3) {
		default: 
			System.out.println("D ");	
		}
		System.out.println("------------------");
		//Switch case without any case and without default value
		int x4 = 1;
		
		switch (x4) {
		}
		System.out.println("------------------");
	}

}
