package pattern;

public class Pattern3 {

	
	public static void hourglass(int n)
	{
		    for (int i = 0; i < 2 * n - 1; i++) {
		        int l = (i < n) ? i : 2 * n - 2 - i;
		        for (int j = 0; j < l; j++) {
		            System.out.print(" ");
		        }
		        for (int k = 0; k < 2 * (n - l) - 1; k++) {
		        	System.out.print("*");
		        }
		        System.out.println();
		    }

	}
	
	public static void main(String[] args) {
		hourglass(5);

	}

}
