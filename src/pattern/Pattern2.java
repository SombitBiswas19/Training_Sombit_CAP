package pattern;

public class Pattern2 {

	public static void main(String[] args) {
		diamondshape(5);

	}

	private static void diamondshape(int n) {
		int s= n - 1; //for space
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < s; j++)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print("* ");
			System.out.println();
			s--;
		}
		s = 0;
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < s; j++)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print("* ");
			System.out.println();
			s++;
		}

	}

}
