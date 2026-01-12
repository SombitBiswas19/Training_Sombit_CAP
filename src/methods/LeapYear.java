package methods;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=sc.nextInt();
		leapyear(year);
	}

	private static void leapyear(int year) {
		if((year%4==0 && year%100!=0) || year%400==0)
			System.out.println(year+" is leap year.");
		else
			System.out.println(year+" is not leap year.");
	}
}
