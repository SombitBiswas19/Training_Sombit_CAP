package scannerclass;
import java.util.Scanner; //1st step

public class Example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //2nd step
		System.out.println("Enter Byte: ");
		byte a=sc.nextByte();
		System.out.println("Enter Short: ");
		short b=sc.nextShort();
		System.out.println("Enter Int: ");
		int c=sc.nextInt();
		System.out.println("Enter long: ");
		long d=sc.nextLong();
		System.out.println("Enter float: ");
		float e=sc.nextFloat();
		System.out.println("Enter double: ");
		double f=sc.nextDouble();
		System.out.println("Enter Single word: ");
		String g=sc.next();
		System.out.println("Enter Multiple word: ");
		String h=sc.nextLine();
		System.out.println("Enter Character: ");
		char i=sc.next().charAt(0);
		
	}

}
