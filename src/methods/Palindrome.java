package methods;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: "); 
		int num=sc.nextInt();
		palindrome(num);
	}

	public static void palindrome(int num) {
		int num1=0,n=num;
		while(num>0)
		{
			int rem=num%10;
			num1=(num1*10)+rem;
			num/=10;
		}
		
		if(n==num1)
			System.out.println("Good");
		else 
			System.out.println("Bad");
	}

}
