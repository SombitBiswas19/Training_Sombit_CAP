package week2_practice_and_checking;
import java.util.Scanner;

public class Checking_println_problems {

	public static void main(String[] args) {
		//After integer if we take String as input
		//In input buffer, it stores the enter and for next string taking input
		//Takes the enter as input automatically.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int age=sc.nextInt();
		sc.nextLine(); //It will take the Enter stays in buffer memory
		System.out.println("Enter a string: ");
		String name=sc.nextLine();
		
		System.out.println("name "+name+"age "+age);
	}

}
