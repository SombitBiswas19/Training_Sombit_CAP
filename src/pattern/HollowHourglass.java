package pattern;

public class HollowHourglass {
	    public static void hhg(int n) {
	        // Upper half Inverted Hollow Pyramid
	        for (int i = 0; i < n; i++) {
	            // Print leading spaces
	            for (int j = 0; j < i; j++) System.out.print(" ");
	            // Print stars at boundaries or first row
	            for (int k = 0; k < 2 * (n - i) - 1; k++) {
	                if (i == 0 || k == 0 || k == 2 * (n - i) - 2)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	        // Lower half Hollow Pyramid
	        for (int i = n - 2; i >= 0; i--) {
	            // Print leading spaces
	            for (int j = 0; j < i; j++) System.out.print(" ");
	            // Print stars at boundaries or last row
	            for (int k = 0; k < 2 * (n - i) - 1; k++) {
	                if (i == 0 || k == 0 || k == 2 * (n - i) - 2)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }


	public static void main(String[] args) {
		hhg(5);

	}

}
