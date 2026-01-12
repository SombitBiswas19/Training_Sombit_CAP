package programs;

public class Greatest_between_four {

	public static void main(String[] args) {
		int a=16,b=9;
		int c=10;
		int d=120;
		int big=(a>b)?a:b;
		big=(big>c)?big:c;
		big=(big>d)?big:d;
		System.out.println("Biggest Number is "+big);

	}

}
