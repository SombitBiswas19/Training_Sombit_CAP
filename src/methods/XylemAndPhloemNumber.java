package methods;

import java.util.Scanner;

public class XylemAndPhloemNumber {

	public static void main(String[] args) {
		/*A number is a xylem number if the sum of its extreme digits (first and last) is
		equal to the sum of its mean digits (all digits in between).
		
		A number is a phloem number if the sum of its extreme digits is not equal to the
		 sum of its mean digits. */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Give a number for checking xylem or phloem number: ");
		int num=sc.nextInt();
		checkxylemphloemnumber(num);

	}

	private static void checkxylemphloemnumber(int num) {
		int sum1=0,sum2=0,n=num,rem=0;
		while(n>0)
		{
			if((n==num)||(n>0 && n<9)) //when last digit and first digit
			{
				rem=n%10;
				sum1+=rem;
				n/=10;
			}
			else
			{
				rem=n%10;
				sum2+=rem;
				n/=10;
			}
		}
		if(sum1==sum2)
			System.out.println(num+" is Xylem Number");
		else
			System.out.println(num+" is Phloem Number");
		
	}

}
