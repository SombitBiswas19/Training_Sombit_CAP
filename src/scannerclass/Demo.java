package scannerclass;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight");
		System.out.println(sc.nextFloat());
		sc.nextLine(); //It is for consuming the enter from the previous line.
		System.out.println("Enter the name");
		System.out.println(sc.nextLine());
		System.out.println("Enter the age");
		System.out.println(sc.nextShort());
		System.out.println("Enter the phone no.");
		System.out.println(sc.nextLong());
		System.out.println("Enter the email");
		System.out.println(sc.next());
		System.out.println("Enter the gender");
		System.out.println(sc.next().charAt(0));
		System.out.println("Are you married or not?");
		System.out.println(sc.nextBoolean());
	}

}
