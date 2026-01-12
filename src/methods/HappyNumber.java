package methods;
import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		/* A happy number is a positive integer that eventually reaches 1 
		when you repeatedly replace it with the sum of the squares of its 
		digits; if the process enters a cycle that doesn't include 1 
		(often cycling through 4), it's an "unhappy" or "sad" number. */
		
		/*
		  A number cannot be a happy number if, at any step, the sum of the square of
		  digits obtained is a single-digit number except 1 or 7. 
		  This is because 1 and 7 are the only single-digit happy numbers.*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Give a number for checking happy number: ");
		int num=sc.nextInt();
		checkhappynumber(num);

	}

	private static void checkhappynumber(int num) {
		int sum=num;
		while(sum>9)
		{
			sum=sumofsquaredigits(sum);
		}
		if(sum==1 || sum==7)
			System.out.println(num + " is a happy number");
		else
			System.out.println(num + " is a sad number");
	}

	private static int sumofsquaredigits(int num) {
		int n=num,sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			sum+=rem*rem;
			n/=10;
		}
		return sum;
	}

}
