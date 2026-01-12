package while_loop_assignments;

public class Palindrome_Number {

	public static void main(String[] args) {
		int num=1214,num1=0,n=num;
		while(num>0)
		{
			int rem=num%10;
			num1=(num1*10)+rem;
			num/=10;
		}
		if(n==num1)
			System.out.println("It is a palindrome number.");
		else 
			System.out.println("It is not a palindrome number.");
	}

}
