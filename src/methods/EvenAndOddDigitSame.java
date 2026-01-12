package methods;
import java.util.Scanner;

public class EvenAndOddDigitSame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int num=sc.nextInt();
		if(digitsame(num))
			System.out.println("Even and odd digit is same for "+num);
		else
		    System.out.println("Even and odd digit isn't same for "+num);
	}

	private static boolean digitsame(int num) {
		int odd_count=0,even_count=0,rem=0,n=num;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
				even_count++;
			else
				odd_count++;
			num/=10;
		}
		System.out.println("Number of Even digits in "+n+" is "+even_count);
		System.out.println("Number of Odd digits in "+n+" is "+odd_count);
		if(even_count==odd_count)
			return true;
		else
			return false;
	}

}
