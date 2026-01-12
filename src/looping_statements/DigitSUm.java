package looping_statements;

public class DigitSUm {
	public static void main(String[] args) {
		//Digit Sum
		int n=123,sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println(sum);
		
		//Find sum 1 to n
		int sum1=0,i=1,n1=10;
		while(i<=n1)
		{
			sum1+=i;
			i++;
		}
		System.out.println(sum1);
	}
}
