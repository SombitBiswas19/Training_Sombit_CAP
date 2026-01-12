package looping_statements;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=17;
		boolean flag=false;
		for(int i=2;i*i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not Prime");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Prime");
		}
		

	}

}
